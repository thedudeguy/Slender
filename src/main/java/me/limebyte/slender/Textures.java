package me.limebyte.slender;

import org.getspout.spoutapi.block.design.Texture;

/**
 * Holds Texture Information.
 */
public final class Textures {
	
	/**
	 * The default image size of a single Slender material in pixels.
	 */
	private static final int DEFAULT_SIZE = 16;
	
	/**
	 * The base URL Slender textures are stored in.
	 */
	private static final String BASE_URL = "https://raw.github.com/LimeByte/Slender/master/images/textures/";
	
	/**
	 * The place where the PageBlock texture is stored.
	 */
	public static final String PAGEBLOCK_URL = BASE_URL + "PageBlock.png";
	public static final Texture PAGEBLOCK = new Texture(Slender.getInstance(), PAGEBLOCK_URL, 64, 64, DEFAULT_SIZE);
	
	/**
	 * The place where the PageBlock texture is stored.
	 */
	public static final String PAGEITEM_URL = BASE_URL + "PageItem.png";
	
	/**
	 * Blocks instances.
	 */
	private Textures() { }
	
}
