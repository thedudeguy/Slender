package me.limebyte.slender;

import org.getspout.spoutapi.material.item.GenericCustomItem;

public class LanternItem extends GenericCustomItem {
	
	public LanternItem() {
		super(Slender.getInstance(), "Lantern");
		turnOn();
	}
	
	public LanternItem(boolean on) {
		super(Slender.getInstance(), "Lantern");
		
		if (on) turnOn();
		else turnOff();
	}
	
	public void turnOn() {
		setTexture(Textures.LANTERN_ON_URL);
	}
	
	public void turnOff() {
		setTexture(Textures.LANTERN_OFF_URL);
	}

}
