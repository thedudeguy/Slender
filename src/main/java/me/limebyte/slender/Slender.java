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
	
	/**
	 * The current running Slender instance.
	 */
	private static Slender instance;
	
	@Override
	public final void onEnable() {
		instance = this;
		
		log = this.getLogger();
		this.getServer().getPluginManager().registerEvents(this, this);
		
        // Load command class
        getCommand("slender").setExecutor(new CommandManager());
	}
	
	/**
	 * Gets the console Logger for this JavaPlugin.
	 * 
	 * @return The Logger
	 */
	public final Logger log() {
		return log;
	}
	
	/**
	 * Gets the current running Slender instance.
	 * 
	 * @return The instance
	 */
	public static final Slender getInstance() {
		return instance;
	}
	
}
