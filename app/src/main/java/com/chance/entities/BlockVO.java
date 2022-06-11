package com.chance.entities;

import com.chance.constants.BlockType;

/**
 * 组件对象
 *
 * @author lsy
 */
public class BlockVO {
    /** 组件类型 */
    private BlockType blockType;
    /** 组件序号 */
    private int blockId;
    /** 顶部偏移量 (默认: 0) */
    private float topOffset;
    /** 左侧偏移量 (默认: 0) */
    private float leftOffset;

    private BlockVO() { }

    public BlockVO(BlockType blockType, int blockIndex) {
        this(blockType, blockIndex, 0F, 0F);
    }

    public BlockVO(BlockType blockType, int blockId, float topOffset, float leftOffset) {
        this.blockType = blockType;
        this.blockId = blockId;
        this.topOffset = topOffset;
        this.leftOffset = leftOffset;
    }

    public BlockType getBlockType() {
        return blockType;
    }

    public int getBlockId() {
        return blockId;
    }

    public float getTopOffset() {
        return topOffset;
    }

    public float getLeftOffset() {
        return leftOffset;
    }
}
