package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 眉毛组件
 *
 * @author lsy
 */
public enum Brow {

    BROW_0(R.drawable.c3_brow0),
    BROW_1(R.drawable.c3_brow1),
    BROW_2(R.drawable.c3_brow2),
    BROW_3(R.drawable.c3_brow3),
    BROW_4(R.drawable.c3_brow4),
    BROW_5(R.drawable.c3_brow5),
    BROW_6(R.drawable.c3_brow6, -0.0086F, 0F),
    BROW_7(R.drawable.c3_brow7),
    BROW_8(R.drawable.c3_brow8),
    BROW_9(R.drawable.c3_brow9),
    BROW_10(R.drawable.c3_brow10),
    ;

    private BlockVO block;

    Brow(int id) {
        this(id, 0F, 0F);
    }

    Brow(int index, float topOffset, float leftOffset) {
        this.block = new BlockVO(BlockType.BROW, index, topOffset, leftOffset);
    }

    public static int size() {
        return Brow.values().length;
    }

    public static BlockVO getByIndex(int index) {
        Brow[] brows = Brow.values();
        if (index < 0 || index >= brows.length) {
            return brows[0].block;
        }
        return brows[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}
