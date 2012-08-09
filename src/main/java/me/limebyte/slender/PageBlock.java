package me.limebyte.slender;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

/**
 * Represents a paper block.
 */
public class PageBlock extends GenericCustomBlock {
	
	/**
	 * The block this block is based off.
	 */
	private static final int BASE_BLOCK = 38;
	
	/**
	 * Creates a new place-able piece of paper.
	 */
	public PageBlock() {
		super(Slender.getInstance(), "Page Block", BASE_BLOCK, false);
		this.setBlockDesign(new PageBlockDesign()).setHardness(MaterialData.sugarCaneBlock.getHardness());
	}

    public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) { }
    
    public void onBlockPlace(World world, int x, int y, int z) { }
 
    public void onBlockPlace(World world, int x, int y, int z, LivingEntity living) { }
 
    public void onBlockDestroyed(World world, int x, int y, int z) {
    	world.dropItemNaturally(new Location(world, x, y, z), new SpoutItemStack(new PageItem(), 1));
    }
 
    public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
        return true;
    }
 
    public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) { }
 
    public void onBlockClicked(World world, int x, int y, int z, SpoutPlayer player) { }
 
    public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
 
    public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
}
