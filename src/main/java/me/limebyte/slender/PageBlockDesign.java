package me.limebyte.slender;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

/**
 * Represents a page block design.
 */
public class PageBlockDesign extends GenericBlockDesign {
	
	/**
	 * The size of one pixel.
	 */
	private static final float PIXEL_SIZE = 0.0625F;
	
	/**
	 * Creates a new PaperBlock design.
	 */
	public PageBlockDesign() {
		Slender plugin = Slender.getInstance();
		Texture texture = Textures.PAGEBLOCK;
		
		setQuadNumber(0);
		
		setTexture(plugin, texture.getTexture());
		setMinBrightness(1F).setMaxBrightness(1F);
		
		SubTexture frontTex = texture.getSubTexture(6);
		SubTexture backTex = texture.getSubTexture(8);
		
		Quad frontFace = new Quad(0, frontTex);
		frontFace.addVertex(0, 1F, 0F, PIXEL_SIZE);
		frontFace.addVertex(1, 1F, 1F, PIXEL_SIZE);
		frontFace.addVertex(2, 0F, 1F, PIXEL_SIZE);
		frontFace.addVertex(3, 0F, 0F, PIXEL_SIZE);
		
		Quad backFace = new Quad(0, backTex);
		backFace.addVertex(0, 1F, 0F, 0F);
		backFace.addVertex(1, 1F, 1F, 0F);
		backFace.addVertex(2, 0F, 1F, 0F);
		backFace.addVertex(3, 0F, 0F, 0F);
		
	    setQuad(frontFace).setQuad(backFace);
	}

}