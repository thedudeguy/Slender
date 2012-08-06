package me.limebyte.slender;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

/**
 * Represents a paper block.
 */
public class PaperBlock extends GenericCuboidCustomBlock {

	/**
	 * The size of the texture image in pixels.
	 */
	private static final int TEXTURE_SIZE = 16;
	
	/**
	 * The depth of the block.
	 */
	private static final float BLOCK_DEPTH = 0.1F;
	
	/**
	 * Creates a new place-able piece of paper.
	 * 
	 * @param plugin The JavaPlugin making this block
	 */
	public PaperBlock(final Plugin plugin) {
		super(plugin,
			  "PaperBlock",
			  Slender.TEXTURE_URL + "note.png", TEXTURE_SIZE,
			  0F, 0F, 0F, BLOCK_DEPTH, 1F, 1F, true);
		
		this.setItemDrop(new ItemStack(Material.PAPER, 1));
		this.setOpaque(true);
	}

}
