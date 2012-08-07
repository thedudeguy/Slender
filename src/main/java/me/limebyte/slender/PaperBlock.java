package me.limebyte.slender;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.sound.SoundEffect;

/**
 * Represents a paper block.
 */
public class PaperBlock extends GenericCustomBlock {
	
	/**
	 * The block this block is based off.
	 */
	private static final int BASE_BLOCK = 68;
	
	/**
	 * Creates a new place-able piece of paper.
	 */
	public PaperBlock() {
		super(Slender.getInstance(), "Paper Block", BASE_BLOCK, true);
		setBlockDesign(new PaperBlockDesign(0)).setOpaque(false);
		setHardness(MaterialData.sugarCaneBlock.getHardness());
		setItemDrop(new ItemStack(Material.PAPER, 1)).setStepSound(SoundEffect.CLOTH);
	}

}
