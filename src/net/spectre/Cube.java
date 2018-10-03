package net.spectre;

public class Cube {
	
	public double posX = 0, posY = 0, posZ = 0; // Pos
	public double offX = 0, offY = 0, offZ = 0; // Offset
	public double rotX = 0, rotY = 0, rotZ = 0; // Rotation 
	public int sizeX = 0, sizeY = 0, sizeZ = 0; // Shape
	public int texU = 0, texV = 0; // Texture U/Vs
	public String name = "NONAME"; // Shape name
	public boolean mirror = false; //Where this shape has a mirror texture
	
	public Cube() {}
	
	public void setPosition(double x, double y, double z) {
		posX = x;
		posY = y;
		posZ = z;
	}
	
	public void setOffset(double x, double y, double z) {
		offX = x;
		offY = y;
		offZ = z;
	}
	
	public void setRotation(double x, double y, double z) {
		rotX = x;
		rotY = y;
		rotZ = z;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTexOffset(int u, int v) {
		this.texU = u;
		this.texV = v;
	}

	public void setSize(int x, int y, int z) {
		this.sizeX = x;
		this.sizeY = y;
		this.sizeZ = z;
	}
	
	public void setMirror(boolean mirrored) {
		this.mirror = mirrored;
	}

}
