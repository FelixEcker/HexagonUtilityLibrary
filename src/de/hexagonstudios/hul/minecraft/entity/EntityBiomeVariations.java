package de.hexagonstudios.hul.minecraft.entity;

import java.util.HashMap;
import java.util.Random;

/**
 * This class is used to store Variation Numbers,
 * together with the appropriate Biome, to create
 * a Map of Entity Variations according to their Biomes.
 * 
 * @author Felix Eckert
 * */
public class EntityBiomeVariations {
	private HashMap<String, Integer[]> types;
	
	public EntityBiomeVariations() {
		this.types = new HashMap<String, Integer[]>();
	}
	
	/**
	 * Used to add a Variation for a Biome.
	 * 
	 * @param biome The biome for which the variations should be added
	 * @param vars An array of Integers containing the Entity Variant IDs.
	 * 
	 * @author Felix Eckert
	 * */
	public void addVariation(String biome, Integer[] vars) {
		this.types.put(biome, vars);
	}
	
	/**
	 * Gets the According Entity Type IDs according to the
	 * Biome given
	 * 
	 * @param biome The Biome the Entity Spawns in
	 * @return -1 if the Biome isnt contained. Else it will return the according id
	 * 
	 * @author Felix Eckert
	 * */
	public Integer[] getVariationsOfBiome(String biome) {
		if (this.types.containsKey(biome))
			return (Integer[]) this.types.get(biome);
		
		return new Integer[] {-1};
	}
	
	/**
	 * Gets a random entity type id, from the given
	 * biome.
	 * 
	 * @param biome The Biome the Entity Spawns in
	 * @return -1 if the Biome isnt contained. Else it will return the random id
	 * 
	 * @author Felix Eckert
	 */
	public int getRandomVariationOfBiome(String biome) {
		if (!this.types.containsKey(biome))
			return -1;
		
		Random r = new Random();
		int type;
		Integer[] entityTypes = types.get(biome);
		type = entityTypes[r.nextInt(entityTypes.length)];
		
		return type;
	}
	
	public boolean hasVariationForBiome(String biome) {
		if (this.types.containsKey(biome))
			return true;
		
		return false;
	}
}
