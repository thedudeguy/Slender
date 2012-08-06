package me.limebyte.slender;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.gui.Color;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.player.RenderDistance;
import org.getspout.spoutapi.player.SpoutPlayer;

/**
 * Represents the Slender JavaPlugin.
 */
public class Slender extends JavaPlugin implements Listener {
	
	/**
	 * Represents a paper block.
	 */
	private static CustomBlock paperBlock;
	
	/**
	 * The console Logger for Slender.
	 */
	private Logger log;
	
	@Override
	public final void onEnable() {
		log = this.getLogger();
		this.getServer().getPluginManager().registerEvents(this, this);
		
		// Register Blocks
		paperBlock = new PaperBlock(this);
	}
	
	/**
	 * Fired when a player joins the server.
	 * Current contents is merely for testing.
	 * 
	 * @param event The event thrown
	 */
	@EventHandler
	public final void onPlayerJoin(final PlayerJoinEvent event) {
		SpoutPlayer player = (SpoutPlayer) event.getPlayer();
		SpoutManager.getSkyManager().setFogColor(player, new Color(0, 0, 0));
		SpoutManager.getSkyManager().setCloudsVisible(player, false);
		player.setMaximumRenderDistance(RenderDistance.TINY);
		log().info("Slender enabled for " + player.getName() + ".");
		player.getInventory().addItem(new SpoutItemStack(paperBlock, 1));
	}
	
	/**
	 * Gets the console Logger for this JavaPlugin.
	 * 
	 * @return The Logger
	 */
	public final Logger log() {
		return log;
	}
	
}
