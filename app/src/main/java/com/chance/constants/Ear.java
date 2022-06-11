package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 耳朵组件
 *
 * @author lsy
 */
public enum Ear {

    EAR_1(R.drawable.c3_ear0),
    ;

    private BlockVO block;

    Ear(int id) {
        this(id, 0L, 0L);
    }

    Ear(int index, long topOffset, long leftOffset) {
        this.block = new BlockVO(BlockType.EAR, index, topOffset, leftOffset);
    }

    public static int size() {
        return Ear.values().length;
    }

    public static BlockVO getByIndex(int index) {
        Ear[] ears = Ear.values();
        if (index < 0 || index >= ears.length) {
            return ears[0].block;
        }
        return ears[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}
