package net.spectre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipFile;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main{
	
	public static String modelName = "Cat";
	public static int maxU = 0, maxV = 0;
	
	public static void main(String[] args) {
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(new FileFilter() {

			@Override
			public String getDescription() {
				return "Techne model files";
			}

			@Override
			public boolean accept(File file) {
				return file.isDirectory() || file.getName().endsWith(".tcn");
			}});
		if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			try {
				Main.modelName = fc.getSelectedFile().getName().replaceAll(" ", "").replaceAll("_", "").replaceAll("-", "").replace(".tcn", "");
				ZipFile zf = new ZipFile(fc.getSelectedFile());
				InputStream is = zf.getInputStream(zf.getEntry("model.xml"));
				
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				factory.setValidating(false);
				DocumentBuilder db = factory.newDocumentBuilder();
				Document d = db.parse(is);
				NodeList texList = d.getElementsByTagName("TextureSize");
				for(int tli = 0; tli < texList.getLength(); ++tli) {
					String[] s = texList.item(tli).getTextContent().split(",");
					maxU = Integer.parseInt(get(s, 0));
					maxV = Integer.parseInt(get(s, 1));
				}
				NodeList nl = d.getElementsByTagName("Shape");
				ArrayList<Cube> list = new ArrayList<Cube>();
				for(int i = 0; i < nl.getLength(); ++i) {
					Node pNode = nl.item(i);
					Cube cube = new Cube();
					cube.setName(pNode.getAttributes().getNamedItem("name").getNodeValue());
					NodeList childList = pNode.getChildNodes();
					for(int c = 0; c < childList.getLength(); ++c) {
						Node node = childList.item(c);
						String name = node.getNodeName().toLowerCase();
						if(name.equals("position")) {
							String[] pos = node.getTextContent().split(",");
							cube.setPosition(Double.parseDouble(get(pos, 0)), Double.parseDouble(get(pos, 1)), Double.parseDouble(get(pos, 2)));
						}
						else if(name.equals("offset")) {
							String[] off = node.getTextContent().split(",");
							cube.setOffset(Double.parseDouble(get(off, 0)), Double.parseDouble(get(off, 1)), Double.parseDouble(get(off, 2)));
						}
						else if(name.equals("rotation")) {
							String[] rot = node.getTextContent().split(",");
							cube.setRotation(Double.parseDouble(get(rot, 0)), Double.parseDouble(get(rot, 1)), Double.parseDouble(get(rot, 2)));
						}
						else if(name.equals("textureoffset")) {
							String[] tex = node.getTextContent().split(",");
							cube.setTexOffset(Integer.parseInt(get(tex, 0)), Integer.parseInt(get(tex, 1)));
						}
						else if(name.equals("size")) {
							String[] s = node.getTextContent().split(",");
							cube.setSize(Integer.parseInt(get(s, 0)), Integer.parseInt(get(s, 1)), Integer.parseInt(get(s, 2)));
						}
						else if(name.equals("ismirrored")) {
							cube.setMirror(Boolean.parseBoolean(node.getTextContent()));
							System.out.println(cube.mirror);
						}
					}
					list.add(cube);
				}
				writeJava(list);
				is.close();
				zf.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	private static void writeJava(ArrayList<Cube> list) throws IOException {
		
		File f = new File(modelName + ".java");
		if(!f.exists())f.createNewFile();
		FileWriter fw = new FileWriter(f);
		ArrayList<String> names = new ArrayList<>();
		int id = 0;
		
		fw.write("package help;\n\n\n");
		fw.write("import net.minecraft.client.model.ModelBase;\nimport net.minecraft.client.model.ModelRenderer;\nimport net.minecraft.entity.Entity;\n\n");
		fw.write("public class "+ modelName + " extends ModelBase {\n\n");
		for(Cube c : list) {
			if(names.contains(c.name)) {
				c.name = "Gen" + id++;
			}
			fw.write("\tModelRenderer " + c.name + ";\n");
		}
		fw.write("\n\tpublic " + modelName + "() { \n\n");
		fw.write("\t\ttextureWidth = " + maxU + ";\n\t\ttextureHeight = " + maxV + ";\n\n");
		for(Cube c : list) {
			fw.write("\t\t" + c.name + " = new ModelRenderer(this, " + c.texU + ", " + c.texV + ");\n");
			fw.write("\t\t" + c.name + ".addBox(" + c.offX + "F, " + c.offY + "F, " + c.offZ + "F, " + c.sizeX + ", " + c.sizeY + ", " + c.sizeZ + ");\n");
			fw.write("\t\t" + c.name + ".setTextureSize(" + maxU + ", " + maxV + ");\n");
			fw.write("\t\t" + c.name + ".setRotationPoint(" + c.posX + "F, " + c.posY + "F, " + c.posZ + "F);\n");
			fw.write("\t\t" + "setRotation(" + c.name + ", " + Math.toRadians(c.rotX) + "F, "+ Math.toRadians(c.rotY) + "F, " + Math.toRadians(c.posZ) + "F);\n");
			fw.write("\t\t" + c.name + ".mirror = " + c.mirror + ";\n\n");
		}
		fw.write("\t}\n");
		
		fw.write("\t@Override\n\tpublic void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {\n");
		for(Cube c : list) {
			fw.write("\t\t" + c.name + ".render(f5);\n");
		}
		fw.write("\t}\n");
		fw.write("\tprivate void setRotation(ModelRenderer model, float x, float y, float z){\n\t\tmodel.rotateAngleX = x;\n\t\tmodel.rotateAngleY = y;\n\t\tmodel.rotateAngleZ = z;\n\t}\n\n");

		fw.write("\t@Override\n\tpublic void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity){\n\t\tsuper.setRotationAngles(f, f1, f2, f3, f4, f5, entity);\n\t}\n");
		fw.write("}");
		fw.close();

		System.exit(0);
	}

	public static String get(String[] s, int index) {
		return s.length > index ? s[index] : "0";
	}
	public Main() {}

}
