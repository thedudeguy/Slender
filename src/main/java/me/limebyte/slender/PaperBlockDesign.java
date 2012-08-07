package me.limebyte.slender;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCuboidBlockDesign;
import org.getspout.spoutapi.block.design.Texture;

/**
 * Represents a paper block design.
 */
public class PaperBlockDesign extends GenericCuboidBlockDesign {

	/**
	 * The depth of the block.
	 */
	private static final float BLOCK_DEPTH = 0.05F;
	
	/**
	 * The size of the individual texture in pixels.
	 */
	private static final int TEXTURE_SIZE = 16;
	
	/**
	 * The size of the texture file in pixels.
	 */
	private static final int TEXTURE_WIDTH = 16;
	
	/**
	 * The size of the texture file in pixels.
	 */
	private static final int TEXTURE_HEIGHT = 16;
	
	/**
	 * Creates a new PaperBlock design.
	 * 
	 * @param plugin The JavaPlugin making this design
	 */
	public PaperBlockDesign(final Plugin plugin) {
		super(plugin,
			  new Texture(
					  plugin, Slender.TEXTURE_URL + "note.png",
					  TEXTURE_WIDTH, TEXTURE_HEIGHT, TEXTURE_SIZE),
			  new int[]{0, 0, 0, 0, 0, 0},
			  0F, 0F, 0F, 1F, 1F, BLOCK_DEPTH);
		this.setBoundingBox(0F, 0F, 0F, 1F, 1F, BLOCK_DEPTH);
	}

}
