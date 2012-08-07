package me.limebyte.slender;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

/**
 * Represents a paper block design.
 */
public class PaperBlockDesign extends GenericBlockDesign {

	/**
	 * The depth of the block.
	 */
	private static final float BLOCK_DEPTH = 0.1F;
	
	/**
	 * The width of the block.
	 */
	private static final float BLOCK_WIDTH = 0.5F;
	
	/**
	 * The height of the block.
	 */
	private static final float BLOCK_HEIGHT = 0.8F;
	
	/**
	 * The calculated vertical bounding box margin.
	 */
	private static final float VERT_MARGIN = (1F - BLOCK_HEIGHT) / 2F;
	
	/**
	 * The calculated horizontal bounding box margin.
	 */
	private static final float HORZ_MARGIN = (1F - BLOCK_WIDTH) / 2F;
	
	/**
	 * Creates a new PaperBlock design.
	 * 
	 * @param blockTextureLocation The texture position on the Block texture image
	 */
	public PaperBlockDesign(final int blockTextureLocation) {
		setRenderPass(1);
		setBoundingBox(1F - BLOCK_DEPTH, VERT_MARGIN, HORZ_MARGIN,
				            1F, 1F - VERT_MARGIN, 1F - HORZ_MARGIN);
		
		SubTexture subTex = Textures.BLOCKS.getSubTexture(blockTextureLocation);
		
		Quad frontFace = new Quad(0, subTex);
		frontFace.addVertex(0, 1F - BLOCK_DEPTH, VERT_MARGIN, HORZ_MARGIN);
		frontFace.addVertex(1, 1F - BLOCK_DEPTH, VERT_MARGIN, 1F - HORZ_MARGIN);
		frontFace.addVertex(2, 1F - BLOCK_DEPTH, 1F - VERT_MARGIN, HORZ_MARGIN);
		frontFace.addVertex(3, 1F - BLOCK_DEPTH, 1F - VERT_MARGIN, 1F - HORZ_MARGIN);
		
		setQuadNumber(1).setQuad(frontFace);
	}

}
