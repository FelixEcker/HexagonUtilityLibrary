package de.hexagonstudios.hul.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
	/**
	 * Loads a property file from the given File Name.
	 * @param fileName Path to the property file
	 * 
	 * @author Felix Eckert
	 * */
	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch(FileNotFoundException fnfe) {
	        fnfe.printStackTrace();
	    } catch(IOException ioe) {
	        ioe.printStackTrace();
	    } finally {
	        fis.close();
	    }
		return prop;
	}
}
