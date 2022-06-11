package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 嘴巴组件
 *
 * @author lsy
 */
public enum Mou {

    MOU_0(R.drawable.c3_mou0),
    MOU_1(R.drawable.c3_mou1, -10F / 465F, -10F / 401.03174F),
    MOU_2(R.drawable.c3_mou2),
    MOU_3(R.drawable.c3_mou3),
    MOU_4(R.drawable.c3_mou4, 4F / 465F, 0F / 401.03174F),
    MOU_5(R.drawable.c3_mou5),
    MOU_6(R.drawable.c3_mou6, 2F / 465F, 0F / 401.03174F),
    MOU_7(R.drawable.c3_mou7),
    MOU_8(R.drawable.c3_mou8, 0F / 465F, -2F / 401.03174F),
    MOU_9(R.drawable.c3_mou9, 0F / 465F, -2F / 401.03174F),
    MOU_10(R.drawable.c3_mou10, -4F / 465F, 8F / 401.03174F),
    MOU_11(R.drawable.c3_mou11, 2F / 465F, -6F / 401.03174F),
    MOU_12(R.drawable.c3_mou12),
    MOU_13(R.drawable.c3_mou13, 6F / 465F, 0F / 401.03174F),
    MOU_14(R.drawable.c3_mou14, 4F / 465F, 0F / 401.03174F),
    MOU_15(R.drawable.c3_mou15, 8F / 465F, 0F / 401.03174F),
    MOU_16(R.drawable.c3_mou16, 6F / 465F, 0F / 401.03174F),
    MOU_17(R.drawable.c3_mou17),
    MOU_18(R.drawable.c3_mou18, 6F / 465F, 0F / 401.03174F),
    MOU_19(R.drawable.c3_mou19, 4F / 465F, 2F / 401.03174F),
    MOU_20(R.drawable.c3_mou20, 6F / 465F, 0F / 401.03174F),
    MOU_21(R.drawable.c3_mou21),
    MOU_22(R.drawable.c3_mou22),
    MOU_23(R.drawable.c3_mou23),
    MOU_24(R.drawable.c3_mou24, 0F / 465F, 4F / 401.03174F),
    ;

    private BlockVO block;

    Mou(int id) {
        this(id, 0F / 465F, 0F);
    }

    Mou(int index, float topOffset, float leftOffset) {
        this.block = new BlockVO(BlockType.MOU, index, topOffset, leftOffset);
    }

    public static int size() {
        return Mou.values().length;
    }

    public static BlockVO getByIndex(int index) {
        Mou[] mous = Mou.values();
        if (index < 0 || index >= mous.length) {
            return mous[0].block;
        }
        return mous[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}
