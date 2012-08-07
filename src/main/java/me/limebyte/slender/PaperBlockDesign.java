package me.limebyte.slender;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

/**
 * Represents a paper block design.
 */
public class PaperBlockDesign extends GenericBlockDesign {

	/**
	 * The depth of the block.
	 */
	private static final float BLOCK_DEPTH = 0.1F;
	
	/**
	 * Creates a new PaperBlock design.
	 * 
	 * @param blockTextureLocation The texture position on the Block texture image
	 */
	public PaperBlockDesign(final int blockTextureLocation) {
		Slender plugin = Slender.getInstance();
		Texture texture = Textures.BLOCKS;
		
		setQuadNumber(1);
		
		setTexture(plugin, texture.getTexture());
		setMinBrightness(1F).setMaxBrightness(1F);
		
		SubTexture subTex = texture.getSubTexture(blockTextureLocation);
		
		Quad frontFace = new Quad(0, subTex);
		frontFace.addVertex(0, 1F, 0F, BLOCK_DEPTH);
		frontFace.addVertex(1, 1F, 1F, BLOCK_DEPTH);
		frontFace.addVertex(2, 0F, 1F, BLOCK_DEPTH);
		frontFace.addVertex(3, 0F, 0F, BLOCK_DEPTH);
		
	    setQuad(frontFace);
	}

}
