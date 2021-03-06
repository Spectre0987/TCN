package net.spectre;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main{
	
	public static UI ui;
	
	public static void main(String[] args) {
		ui = new UI();
	}
	
	public static void writeJava(Model model, String prefix) throws IOException {
		
		File f = new File(model.name + ".java");
		if(!f.exists())f.createNewFile();
		FileWriter fw = new FileWriter(f);
		ArrayList<String> names = new ArrayList<>();
		int id = 0;
		
		fw.write("package help;\n\n\n");
		fw.write("import net.minecraft.client.model.ModelBase;\nimport net.minecraft.client.model.ModelRenderer;\nimport net.minecraft.entity.Entity;\n\n");
		fw.write("public class "+ model.name + " extends ModelBase {\n\n");
		for(Cube c : model.cubes) {
			if(names.contains(c.name)) {
				c.name = "Gen" + id++;
			}
			names.add(c.name);
			fw.write("\tModelRenderer " + (prefix != null ? prefix + c.name : c.name) + ";\n");
		}
		fw.write("\n\tpublic " + model.name + "() { \n\n");
		fw.write("\t\ttextureWidth = " + model.maxX + ";\n\t\ttextureHeight = " + model.maxY + ";\n\n");
		for(Cube c : model.cubes) {
			c.name = prefix != null ? prefix + c.name : c.name;
			fw.write("\t\t" + c.name + " = new ModelRenderer(this, " + c.texU + ", " + c.texV + ");\n");
			fw.write("\t\t" + c.name + ".addBox(" + c.offX + "F, " + c.offY + "F, " + c.offZ + "F, " + c.sizeX + ", " + c.sizeY + ", " + c.sizeZ + ");\n");
			fw.write("\t\t" + c.name + ".setTextureSize(textureWidth, textureHeight);\n");
			fw.write("\t\t" + c.name + ".setRotationPoint(" + c.posX + "F, " + c.posY + "F, " + c.posZ + "F);\n");
			fw.write("\t\t" + "setRotation(" + c.name + ", " + Math.toRadians(c.rotX) + "F, "+ Math.toRadians(c.rotY) + "F, " + Math.toRadians(c.rotZ) + "F);\n");
			fw.write("\t\t" + c.name + ".mirror = " + c.mirror + ";\n\n");
		}
		fw.write("\t}\n");
		
		fw.write("\t@Override\n\tpublic void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {\n");
		for(Cube c : model.cubes) {
			fw.write("\t\t" + c.name + ".render(scale);\n");
		}
		fw.write("\t}\n");
		fw.write("\tprivate void setRotation(ModelRenderer model, float x, float y, float z){\n\t\tmodel.rotateAngleX = x;\n\t\tmodel.rotateAngleY = y;\n\t\tmodel.rotateAngleZ = z;\n\t}\n\n");

		fw.write("\t@Override\n\tpublic void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch, float scaleFactor, Entity entity){\n\t\tsuper.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netheadYaw, headPitch, scaleFactor, entity);\n\t}\n");
		fw.write("}");
		fw.close();

		System.exit(0);
	}

	public static String get(String[] s, int index) {
		return s.length > index ? s[index] : "0";
	}
	public Main() {}

	public static Model readCubes(File file) {
		System.out.println("Starting...");
		try {
			ZipFile tcn = new ZipFile(file);
			InputStream tcnIS = tcn.getInputStream(tcn.getEntry("model.xml"));
			DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
			fact.setValidating(false);
			
			DocumentBuilder build = fact.newDocumentBuilder();
			Document doc = build.parse(tcnIS);

			Model model = new Model();
			model.name = file.getName().replace(".tcn", "").trim();
			List<Cube> cubeList = new ArrayList<Cube>();
			NodeList rootList = doc.getElementsByTagName("Shape");
			for(int nodeIndex = 0; nodeIndex < rootList.getLength(); ++nodeIndex) {
				Node node = rootList.item(nodeIndex);
				Cube c = new Cube();
				c.setName(node.getAttributes().getNamedItem("name").getNodeValue());
				NodeList childNodes = node.getChildNodes();
				for(int childIndex = 0; childIndex < childNodes.getLength(); ++childIndex) {
					Node child = childNodes.item(childIndex);
					String name = child.getNodeName().replace("#text", "").trim().toLowerCase();
					if(name.equals("position")) {
						String[] pos = child.getTextContent().split(",");
						c.setPosition(Double.parseDouble(get(pos, 0)), Double.parseDouble(get(pos, 1)), Double.parseDouble(get(pos, 2)));
					}
					if(name.equals("rotation")) {
						String[] rot = child.getTextContent().split(",");
						c.setRotation(Double.parseDouble(get(rot, 0)), Double.parseDouble(get(rot, 1)), Double.parseDouble(get(rot, 2)));
					}
					if(name.equals("ismirrored")) {
						c.setMirror(Boolean.parseBoolean(child.getTextContent()));
					}
					if(name.equals("offset")) {
						String[] of = child.getTextContent().split(",");
						c.setOffset(Double.parseDouble(get(of, 0)), Double.parseDouble(get(of, 1)), Double.parseDouble(get(of, 2)));
					}
					if(name.equals("size")) {
						String[] size = child.getTextContent().split(",");
						c.setSize(Integer.parseInt(get(size, 0)), Integer.parseInt(get(size, 1)), Integer.parseInt(get(size, 2)));
					}
					if(name.equals("textureoffset")) {
						String[] to = child.getTextContent().split(",");
						c.setTexOffset(Integer.parseInt(get(to, 0)), Integer.parseInt(get(to, 1)));
					}
				}
				cubeList.add(c);
			}
			
			//Image
			Enumeration<? extends ZipEntry> entries = tcn.entries();
			while(entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				if(entry.getName().endsWith(".png")) {
					InputStream is = tcn.getInputStream(entry);
					FileOutputStream os = new FileOutputStream(new File(file.getParentFile().getAbsolutePath().toString() + "/" + file.getName().replaceAll(".tcn", "") + ".png"));
					byte[] bytes = new byte[1024];
					int len;
					while((len = is.read(bytes)) != -1) {
						os.write(bytes, 0, len);
					}
					os.flush();
					os.close();
					is.close();
				}
			}
			tcn.close();
			tcnIS.close();
			
			NodeList texSizeList = doc.getElementsByTagName("TextureSize");
			for(int tex = 0; tex < texSizeList.getLength(); ++ tex) {
				String[] size = texSizeList.item(tex).getTextContent().split(",");
				model.maxX = Integer.parseInt(get(size, 0));
				model.maxY = Integer.parseInt(get(size, 1));
			}
			model.cubes = cubeList;
			return model;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static InputStream getResource(String string) {
		return Main.getResource("/assets/" + string);
	}

}
