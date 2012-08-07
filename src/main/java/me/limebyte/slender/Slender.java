package me.limebyte.slender;

import java.util.logging.Logger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Represents the Slender JavaPlugin.
 */
public class Slender extends JavaPlugin implements Listener {
	
	/**
	 * The console Logger for Slender.
	 */
	private Logger log;
	
	public static Slender instance;
	
	@Override
	public final void onEnable() {
		instance = this;
		
		log = this.getLogger();
		this.getServer().getPluginManager().registerEvents(this, this);
		
        // Load command class
        CommandManager cmdExecutor = new CommandManager(this);
        getCommand("slender").setExecutor(cmdExecutor);
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
