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
		
		setQuadNumber(6);
		
		setBoundingBox(PIXEL_SIZE * 2, PIXEL_SIZE * 2, 0F, 1F - PIXEL_SIZE * 2, 1F - PIXEL_SIZE * 2, PIXEL_SIZE);
		
		setTexture(plugin, texture.getTexture());
		setMinBrightness(1F).setMaxBrightness(1F);
		
		SubTexture frontTex = texture.getSubTexture(0);
		SubTexture backTex = texture.getSubTexture(1);
		SubTexture sideTex = texture.getSubTexture(2);
		SubTexture topTex = texture.getSubTexture(3);
		
		Quad frontFace = new Quad(0, frontTex);
		frontFace.addVertex(0, 1F, 0F, PIXEL_SIZE);		// Bottom Right
		frontFace.addVertex(1, 1F, 1F, PIXEL_SIZE);		// Top Right
		frontFace.addVertex(2, 0F, 1F, PIXEL_SIZE);		// Top Left
		frontFace.addVertex(3, 0F, 0F, PIXEL_SIZE);		// Bottom Left
		
		Quad backFace = new Quad(1, backTex);
		backFace.addVertex(0, 0F, 0F, 0F);				// Bottom Right
		backFace.addVertex(1, 0F, 1F, 0F);				// Top Right
		backFace.addVertex(2, 1F, 1F, 0F);				// Top Left
		backFace.addVertex(3, 1F, 0F, 0F);				// Bottom Left
		
		Quad leftFace = new Quad(2, sideTex);
		leftFace.addVertex(0, 0F, 0F, PIXEL_SIZE);		// Bottom Right
		leftFace.addVertex(1, 0F, 1F, PIXEL_SIZE);		// Top Right
		leftFace.addVertex(2, 0F, 1F, 0F);				// Top Left
		leftFace.addVertex(3, 0F, 0F, 0F);				// Bottom Left
		
		Quad rightFace = new Quad(3, sideTex);
		rightFace.addVertex(0, 1F, 0F, 0F);				// Bottom Right
		rightFace.addVertex(1, 1F, 1F, 0F);				// Top Right
		rightFace.addVertex(2, 1F, 1F, PIXEL_SIZE);		// Top Left
		rightFace.addVertex(3, 1F, 0F, PIXEL_SIZE);		// Bottom Left
		
		Quad topFace = new Quad(4, topTex);
		topFace.addVertex(0, 1F, 1F, PIXEL_SIZE);		// Bottom Right
		topFace.addVertex(1, 1F, 1F, 0F);				// Top Right
		topFace.addVertex(2, 0F, 1F, 0F);				// Top Left
		topFace.addVertex(3, 0F, 1F, PIXEL_SIZE);		// Bottom Left
		
		Quad bottomFace = new Quad(5, topTex);
		bottomFace.addVertex(0, 1F, 0F, 0F);			// Bottom Right
		bottomFace.addVertex(1, 1F, 0F, PIXEL_SIZE);	// Top Right
		bottomFace.addVertex(2, 0F, 0F, PIXEL_SIZE);	// Top Left
		bottomFace.addVertex(3, 0F, 0F, 0F);			// Bottom Left
	
		
	    setQuad(frontFace).setQuad(backFace);
	    setQuad(leftFace).setQuad(rightFace);
	    setQuad(topFace).setQuad(bottomFace);
	}

}
