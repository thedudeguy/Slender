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
	 * The common place where Slender textures are stored.
	 */
	public static final String TEXTURE_URL = "https://raw.github.com/LimeByte/Slender/master/images/textures/";
	
	@Override
	public final void onEnable() {
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
