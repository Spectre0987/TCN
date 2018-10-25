package net.spectre;

import java.awt.Dimension;
import java.awt.datatransfer.DataFlavor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.TransferHandler;

public class UI extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public UI() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("TCN to Java Converter");
		this.setSize(new Dimension(500, 500));
		this.setLocationRelativeTo(null);
		this.setTransferHandler(new TransferHandler() {
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
							Main.writeJava(model.cubes, model.name);
						}
						System.exit(0);
					}
				}
				catch(Exception e) {}
				return false;
			}
			
			
		});
	}

}
