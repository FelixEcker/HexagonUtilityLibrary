package de.hexagonstudios.hul.misc;

public class HexagonLogger {
	private HexagonLogger logger;
	private String name;
	
	public HexagonLogger(String name) {
		this.name = name;
	}

	/**
	 * Returns a new Instance of this class with the give name
	 * 
	 * @param name The name of the logger
	 * @return HexagonLogger the new HexagonLogger instance
	 * 
	 * @author Felix Eckert
	 * */
	public HexagonLogger getLogger(String name) {
		logger = new HexagonLogger(name);
		return logger;
	}
	
	/**
	 * Prints a message of the type info
	 * 
	 * @param msg The message to be printed
	 * 
	 * @author Felix Eckert
	 * */
	public void info(String msg) {
		System.out.println("["+name+"] (info) "+msg);
	}
	
	/**
	 * Prints a message of the type warning
	 * 
	 * @param msg The message to be printed
	 * 
	 * @author Felix Eckert
	 * */
	public void warn(String msg) {
		System.out.println("["+name+"] (warn) "+msg);
	}
	
	/**
	 * Prints a message of the type error
	 * 
	 * @param msg The message to be printed
	 * 
	 * @author Felix Eckert
	 * */
	public void error(String msg) {
		System.out.println("["+name+"] (error) "+msg);
	}
}
