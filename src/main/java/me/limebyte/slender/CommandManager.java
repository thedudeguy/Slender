package me.limebyte.slender;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.gui.Color;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.RenderDistance;
import org.getspout.spoutapi.player.SpoutPlayer;

/**
 * Represents the class which manages the Slender command.
 */
public class CommandManager implements CommandExecutor {
	
	/**
	 * The Server time value for night.
	 */
	private static final int NIGHT_TIME = 18000;
	
	@Override
	public final boolean onCommand(final CommandSender sender, final Command command,
			                       final String label, final String[] arg) {
		if (sender instanceof SpoutPlayer && ((SpoutPlayer) sender).isSpoutCraftEnabled()) {
			if (arg[0].equalsIgnoreCase("join")) {
				SpoutPlayer player = (SpoutPlayer) sender;
				
				// Atmosphere
				player.getWorld().setTime(NIGHT_TIME);
				SpoutManager.getSkyManager().setFogColor(player, new Color(0, 0, 0));
				SpoutManager.getSkyManager().setCloudsVisible(player, false);
				player.setRenderDistance(RenderDistance.TINY);
				player.setMinimumRenderDistance(RenderDistance.TINY);
				player.setMaximumRenderDistance(RenderDistance.TINY);
				
				// HUD
				player.setGameMode(GameMode.SURVIVAL);
				player.getInventory().clear();
				
				// Lantern
				Lantern lantern = new Lantern();
				lantern.equip(player).start();
				
				player.getMainScreen().getHungerBar().setVisible(false);
			}
			
			if (arg[0].equalsIgnoreCase("build")) {
				SpoutPlayer player = (SpoutPlayer) sender;
				player.setGameMode(GameMode.CREATIVE);
				player.getWorld().setTime(0);
				SpoutManager.getSkyManager().setFogColor(player, new Color("ffffff"));
				SpoutManager.getSkyManager().setCloudsVisible(player, true);
				player.setRenderDistance(RenderDistance.NORMAL);
				player.setMinimumRenderDistance(RenderDistance.TINY);
				player.setMaximumRenderDistance(RenderDistance.FAR);
				player.getInventory().clear();
				player.getInventory().addItem(new SpoutItemStack(new PageItem(), 1));
			}
		} else {
			sender.sendMessage("[Slender] You need to be using Spoutcraft to play.");
		}
		return true;
	}

}
