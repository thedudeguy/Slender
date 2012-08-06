package me.limebyte.slender;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;
import org.getspout.spoutapi.sound.SoundEffect;

/**
 * Represents a paper block.
 */
public class PaperBlock extends GenericCuboidCustomBlock {
	
	/**
	 * Creates a new place-able piece of paper.
	 * 
	 * @param plugin The JavaPlugin making this block
	 */
	public PaperBlock(final Plugin plugin) {
		super(plugin, "Paper Block", true);
		this.setBlockDesign(new PaperBlockDesign(plugin));
		this.setItemDrop(new ItemStack(Material.PAPER, 1));
		this.setStepSound(SoundEffect.CLOTH);
	}
	
//	public PaperBlock(final Plugin plugin) {
//		super(plugin,
//			  "Paper Block",
//			  Slender.TEXTURE_URL + "note.png", TEXTURE_SIZE,
//			  0F, 0F, 0F, 1F, 1F, BLOCK_DEPTH, false);
//		
//		this.setItemDrop(new ItemStack(Material.PAPER, 1));
//		this.setOpaque(true);
//		this.setStepSound(SoundEffect.CLOTH);
//	}

}
