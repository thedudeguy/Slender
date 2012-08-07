package me.limebyte.slender;

import org.getspout.spoutapi.block.design.Texture;

/**
 * Holds Texture Information.
 */
public final class Textures {

	/**
	 * The raw GitHub repository URL Slender textures are stored in.
	 */
	private static final String REPO_URL = "https://raw.github.com/LimeByte/Slender/";
	
	/**
	 * The branch and folder path Slender textures are stored in.
	 */
	private static final String BASE_URL = "master/images/textures/";
	
	/**
	 * The common place where Slender block textures are stored.
	 */
	private static final String BLOCKS_URL = REPO_URL + BASE_URL + "blocks.png";
	
	/**
	 * The size of the Slender block textures image in pixels.
	 */
	private static final int BLOCKS_SIZE = 128;
	
	/**
	 * The image size of a single Slender block in pixels.
	 */
	private static final int BLOCK_SIZE = 16;
	
	/**
	 * The common place where Slender item textures are stored.
	 */
	private static final String ITEMS_URL = REPO_URL + BASE_URL + "items.png";
	
	/**
	 * The size of the Slender item textures image in pixels.
	 */
	private static final int ITEMS_SIZE = 128;
	
	/**
	 * The image size of a single Slender item in pixels.
	 */
	private static final int ITEM_SIZE = 16;
	
	/**
	 * The Slender block textures.
	 */
	public static final Texture BLOCKS = new Texture(Slender.getInstance(),
			                                         BLOCKS_URL,
			                                         BLOCKS_SIZE, BLOCKS_SIZE,
			                                         BLOCK_SIZE);
	
	/**
	 * The Slender item textures.
	 */
	public static final Texture ITEMS = new Texture(Slender.getInstance(),
			                                        ITEMS_URL,
			                                        ITEMS_SIZE, ITEMS_SIZE,
			                                        ITEM_SIZE);
	
	/**
	 * Blocks instances.
	 */
	private Textures() { }
	
}
