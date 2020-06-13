package de.hexagonstudios.hul;

public class HUL {
	public static final int
		VER_MAJOR = 0,
		VER_MINOR = 1,
		VER_REV = 0;
	
	public static final String VERSION = VER_MAJOR + "." + VER_MINOR + "." + VER_REV;
	
	public static void main(String[] args) {
		System.out.println("HUL Version "+VERSION+" by Felix Eckert");
	}
}
