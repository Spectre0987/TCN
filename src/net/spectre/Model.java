package net.spectre;

import java.util.List;

public class Model {

	public List<Cube> cubes;
	public String name;
	
	public int maxX = 0, maxY = 0;
	
	public Model() {
		
	}
	
	public Model(String name, List<Cube> cubes) {
		this.name = name;
		this.cubes = cubes;
	}
}
