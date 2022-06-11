package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 眼珠组件
 *
 * @author lsy
 */
public enum EyeB {

    EYE_B_1(R.drawable.c3_eyeb0),
    ;

    private BlockVO block;

    EyeB(int id) {
        this(id, 0L, 0L);
    }

    EyeB(int index, long topOffset, long leftOffset) {
        this.block = new BlockVO(BlockType.EYE_B, index, topOffset, leftOffset);
    }

    public static int size() {
        return EyeB.values().length;
    }

    public static BlockVO getByIndex(int index) {
        EyeB[] eyeBs = EyeB.values();
        if (index < 0 || index >= eyeBs.length) {
            return eyeBs[0].block;
        }
        return eyeBs[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}
