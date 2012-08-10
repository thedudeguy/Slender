package me.limebyte.slender;

import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

public class Lantern {

	private SpoutPlayer player; 
	private static final int BATTERY_LIFE = 60;
	private LanternItem lantern;
	
	public Lantern equip(SpoutPlayer player) {
		this.player = player;
		this.lantern = new LanternItem(true);
		player.getInventory().setItem(0, new SpoutItemStack(lantern, 1));
		player.setExp(1F);
		return this;
	}
	
	public void start() {
		Slender.getInstance().getServer().getScheduler().scheduleSyncRepeatingTask(Slender.getInstance(), new Runnable() {

			@Override
			public void run() {
				drain();
			}
			
		}, (BATTERY_LIFE / 100) * 20, BATTERY_LIFE);
		
		lantern.turnOff();
	}
	
	private void drain() {
		player.setExp(player.getExp() - 0.01F);
	}
	
	

	
}
