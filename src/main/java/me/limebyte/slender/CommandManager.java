package me.limebyte.slender;

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
				SpoutManager.getSkyManager().setFogColor(player, new Color(0, 0, 0));
				SpoutManager.getSkyManager().setCloudsVisible(player, false);
				player.setRenderDistance(RenderDistance.TINY);
				player.setMinimumRenderDistance(RenderDistance.TINY);
				player.setMaximumRenderDistance(RenderDistance.TINY);
				player.getInventory().addItem(new SpoutItemStack(new PaperBlock(plugin), 1));
				player.getMainScreen().getHungerBar().setVisible(false);
			}
		} else {
			sender.sendMessage("[Slender] You need to be using Spoutcraft to play.");
		}
		return true;
	}

}
