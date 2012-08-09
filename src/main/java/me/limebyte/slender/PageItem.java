package me.limebyte.slender;

import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class PageItem extends GenericCustomItem {

	public PageItem() {
		super(Slender.getInstance(), "Page", Textures.PAGEITEM_URL);
		this.setStackable(false);
	}

	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {
		SpoutBlock sb = (SpoutBlock) block.getRelative(face, 1);
		sb.setCustomBlock(new PageBlock());
		return true;
	}

}
