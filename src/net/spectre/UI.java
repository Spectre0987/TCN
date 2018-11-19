package net.spectre;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;


public class UI extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public Image icon;
	JTextField field = new JTextField();

	public UI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("TCN to Java Converter");
		this.setSize(new Dimension(500, 500));
		this.setLocationRelativeTo(null);
		this.setLayout(new CardLayout(20, 20));
		try {
			this.setIconImage(icon = ImageIO.read(this.getClass().getResourceAsStream("/assets/icon/Icon.png")));
			this.background = ImageIO.read(this.getClass().getResourceAsStream("/assets/images/background.jpg"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setTransferHandler(new DragTransferHandler());
		this.add(panel);
		
		panel.add(field);
		
		this.revalidate();
		this.repaint();
		
		this.setVisible(true);
		
	}
	
	Image background;
	ImageObserverStatic observer = new ImageObserverStatic();

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(g != null && this.background != null) {
			g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), observer);
			if(this.getFont() != null && this.getFontMetrics(this.getFont()) != null)
				field.setSize(this.getWidth() / 2, this.getFontMetrics(this.getFont()).getHeight() * 2);
			field.setLocation(this.getWidth() / 4, 0);
		}
		else super.paint(g);
	}

	public static class DragTransferHandler extends TransferHandler{
		
		private static final long serialVersionUID = 1L;

		@Override
		public boolean canImport(TransferSupport support) {
			for(DataFlavor flav : support.getDataFlavors()) {
				if(flav.equals(DataFlavor.javaFileListFlavor))
					return true;
			}
			return false;
		}

		@Override
		public boolean importData(TransferSupport support) {
			try {
				Object list = support.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
				if(list instanceof List<?>) {
					List<Model> models = new ArrayList<Model>();
					for(Object file : (List<?>)list) {
						if(file instanceof File) {
							File file1 = (File)file;
							if(!file1.getName().endsWith(".tcn")) return false;
							Model model = Main.readCubes(file1);
							if(model != null)
								models.add(model);
						}
					}
					for(Model model : models) {
						Main.writeJava(model, Main.ui.field.getText());
					}
					System.exit(0);
				}
			}
			catch(Exception e) {}
			return false;
		}
		
	}
	
	public static class ImageObserverStatic implements ImageObserver{

		@Override
		public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
			return false;
		}
		
	}
}
