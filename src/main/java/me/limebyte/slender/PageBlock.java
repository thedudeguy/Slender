package me.limebyte.slender;

import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

/**
 * Represents a paper block.
 */
public class PageBlock extends GenericCustomBlock {
	
	/**
	 * The block this block is based off.
	 */
	private static final int BASE_BLOCK = 68;
	
	/**
	 * Creates a new place-able piece of paper.
	 */
	public PageBlock() {
		super(Slender.getInstance(), "Page Block", BASE_BLOCK, false);
		setItemDrop(new SpoutItemStack(new PageItem(), 1));
		setBlockDesign(new PageBlockDesign()).setHardness(MaterialData.sugarCaneBlock.getHardness());
	}

}
