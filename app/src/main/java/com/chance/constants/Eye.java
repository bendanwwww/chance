package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 眼睛组件
 *
 * @author lsy
 */
public enum Eye {

    EYE_1(R.drawable.c3_eye0),
    ;

    private BlockVO block;

    Eye(int id) {
        this(id, 0L, 0L);
    }

    Eye(int index, long topOffset, long leftOffset) {
        this.block = new BlockVO(BlockType.EYE, index, topOffset, leftOffset);
    }

    public static int size() {
        return Eye.values().length;
    }

    public static BlockVO getByIndex(int index) {
        Eye[] eyes = Eye.values();
        if (index < 0 || index >= eyes.length) {
            return eyes[0].block;
        }
        return eyes[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}
