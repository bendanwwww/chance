package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 刘海组件
 *
 * @author lsy
 */
public enum HairF {

    HAIR_F_0(R.drawable.c3_fhair0, 10F, -15F),
    HAIR_F_1(R.drawable.c3_fhair1),
    HAIR_F_2(R.drawable.c3_fhair2),
    HAIR_F_3(R.drawable.c3_fhair3, 0F, 3F),
    HAIR_F_4(R.drawable.c3_fhair4, -10F, 16F),
    HAIR_F_5(R.drawable.c3_fhair5, 16F, 0F),
    HAIR_F_6(R.drawable.c3_fhair6, -10F, -24F),
    HAIR_F_7(R.drawable.c3_fhair7, 18F, 10F),
    HAIR_F_8(R.drawable.c3_fhair8, 5F, 6F),
    HAIR_F_9(R.drawable.c3_fhair9, -16F, -46F),
    HAIR_F_10(R.drawable.c3_fhair10, -14F, -8F),
    HAIR_F_11(R.drawable.c3_fhair11, 2F, 2F),
    HAIR_F_12(R.drawable.c3_fhair12),
    HAIR_F_13(R.drawable.c3_fhair13),
    HAIR_F_14(R.drawable.c3_fhair14, 20F, 20F),
    HAIR_F_15(R.drawable.c3_fhair15, -20F, -26F),
    HAIR_F_16(R.drawable.c3_fhair16, -18F, -2F),
    HAIR_F_17(R.drawable.c3_fhair17, 0F, 4F),
    HAIR_F_18(R.drawable.c3_fhair18),
    HAIR_F_19(R.drawable.c3_fhair19, -22F, 6F),
    ;

    private BlockVO block;

    HairF(int id) {
        this(id, 0F, 0F);
    }

    HairF(int index, float topOffset, float leftOffset) {
        this.block = new BlockVO(BlockType.F_HAIR, index, topOffset, leftOffset);
    }

    public static int size() {
        return HairF.values().length;
    }

    public static BlockVO getByIndex(int index) {
        HairF[] hairFs = HairF.values();
        if (index < 0 || index >= hairFs.length) {
            return hairFs[0].block;
        }
        return hairFs[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}