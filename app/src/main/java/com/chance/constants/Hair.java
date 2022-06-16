package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 头发组件
 *
 * @author lsy
 */
public enum Hair {

    HAIR_0(R.drawable.c3_bhair0, -11F / 465F, 0F / 401.03174F),
    HAIR_1(R.drawable.c3_bhair1, -11F / 465F, 0F / 401.03174F),
    HAIR_2(R.drawable.c3_bhair2, -11F / 465F, 0F / 401.03174F),
    HAIR_3(R.drawable.c3_bhair3, -4F / 465F, -13F / 401.03174F),
    HAIR_4(R.drawable.c3_bhair4, -4F / 465F, -13F / 401.03174F),
    HAIR_5(R.drawable.c3_bhair5, -11F / 465F, 0F / 401.03174F),
    HAIR_6(R.drawable.c3_bhair6, -11F / 465F, 0F / 401.03174F),
    HAIR_7(R.drawable.c3_bhair7, -11F / 465F, 0F / 401.03174F),
    HAIR_8(R.drawable.c3_bhair8, -11F / 465F, 0F / 401.03174F),
    HAIR_9(R.drawable.c3_bhair9, -11F / 465F, 0F / 401.03174F),
    HAIR_10(R.drawable.c3_bhair10, -11F / 465F, 0F / 401.03174F),
    HAIR_11(R.drawable.c3_bhair11, -11F / 465F, 0F / 401.03174F),
    HAIR_12(R.drawable.c3_bhair12, -11F / 465F, 0F / 401.03174F),
    HAIR_13(R.drawable.c3_bhair13, -11F / 465F, 0F / 401.03174F),
    HAIR_14(R.drawable.c3_bhair14, -11F / 465F, 0F / 401.03174F),
    HAIR_15(R.drawable.c3_bhair15, -11F / 465F, 0F / 401.03174F),
    HAIR_16(R.drawable.c3_bhair16, -11F / 465F, 0F / 401.03174F),
    HAIR_17(R.drawable.c3_bhair17, -11F / 465F, 0F / 401.03174F),
    ;

    private BlockVO block;

    Hair(int id) {
        this(id, 0F / 465F, 0F);
    }

    Hair(int index, float topOffset, float leftOffset) {
        this.block = new BlockVO(BlockType.HAIR, index, topOffset, leftOffset);
    }

    public static int size() {
        return Hair.values().length;
    }

    public static BlockVO getByIndex(int index) {
        Hair[] hairs = Hair.values();
        if (index < 0 || index >= hairs.length) {
            return hairs[0].block;
        }
        return hairs[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}
