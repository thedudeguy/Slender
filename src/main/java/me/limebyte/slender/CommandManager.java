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

    // Get Main Class
    private static Slender plugin;
    public CommandManager(final Slender instance) {
        plugin = instance;
    }
	
	@Override
	public final boolean onCommand(CommandSender sender, Command command, String label, String[] arg) {
		if (sender instanceof SpoutPlayer && ((SpoutPlayer) sender).isSpoutCraftEnabled()) {
			if (arg[0].equalsIgnoreCase("join")) {
				SpoutPlayer player = (SpoutPlayer) sender;
				player.setGameMode(GameMode.SURVIVAL);
				player.getMainScreen().getHungerBar().setVisible(false);
				player.getWorld().setTime(18000);
				SpoutManager.getSkyManager().setFogColor(player, new Color(0, 0, 0));
				SpoutManager.getSkyManager().setCloudsVisible(player, false);
				player.setRenderDistance(RenderDistance.TINY);
				player.setMinimumRenderDistance(RenderDistance.TINY);
				player.setMaximumRenderDistance(RenderDistance.TINY);
				player.setExp(1F);
			}
		} else {
			sender.sendMessage("[Slender] You need to be using Spoutcraft to play.");
		}
		return true;
	}

}
