package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 衣服组件
 *
 * @author lsy
 */
public enum Cloth {

    CLOTH_1(R.drawable.c3_cloth1, 0F, -18F / 401.03174F),
    CLOTH_2(R.drawable.c3_cloth2, 0F, -4F / 401.03174F),
    CLOTH_3(R.drawable.c3_cloth3, 0F, -4F / 401.03174F),
    CLOTH_4(R.drawable.c3_cloth4),
    CLOTH_5(R.drawable.c3_cloth5, 0F, -3F / 401.03174F),
    CLOTH_6(R.drawable.c3_cloth6, 0F, 30F / 401.03174F),
    CLOTH_7(R.drawable.c3_cloth7, 0F, 15F / 401.03174F),
    CLOTH_8(R.drawable.c3_cloth8, 0F, 37F / 401.03174F),
    CLOTH_9(R.drawable.c3_cloth9, 0F, 42F / 401.03174F),
    CLOTH_10(R.drawable.c3_cloth10, 0F, 36F / 401.03174F),
    CLOTH_11(R.drawable.c3_cloth11, 0F, 18F / 401.03174F),
    CLOTH_12(R.drawable.c3_cloth12, 0F, 22F / 401.03174F),
    CLOTH_13(R.drawable.c3_cloth13, 0F, 4F / 401.03174F),
    CLOTH_14(R.drawable.c3_cloth14, 0F, 13F / 401.03174F),
    CLOTH_15(R.drawable.c3_cloth15, 0F, 12F / 401.03174F),
    CLOTH_16(R.drawable.c3_cloth16, 0F, -18F / 401.03174F),
    CLOTH_17(R.drawable.c3_cloth17, 0F, 15F / 401.03174F),
    CLOTH_18(R.drawable.c3_cloth18, 0F, -5F / 401.03174F),
    CLOTH_19(R.drawable.c3_cloth19, 0F, 44F / 401.03174F),
    CLOTH_20(R.drawable.c3_cloth20, 0F, -16F / 401.03174F),
    CLOTH_21(R.drawable.c3_cloth21, 0F, -3F / 401.03174F),
    CLOTH_22(R.drawable.c3_cloth22, 0F, 12F / 401.03174F),
    CLOTH_23(R.drawable.c3_cloth23, 0F, -21F / 401.03174F),
    CLOTH_24(R.drawable.c3_cloth24, 0F, 14F / 401.03174F),
    CLOTH_25(R.drawable.c3_cloth25, 0F, -8F / 401.03174F),
    CLOTH_26(R.drawable.c3_cloth26, 0F, 20F / 401.03174F),
    CLOTH_27(R.drawable.c3_cloth27, 0F, 4F / 401.03174F),
    CLOTH_28(R.drawable.c3_cloth28, 0F, 6F / 401.03174F),
    CLOTH_29(R.drawable.c3_cloth29, 0F, 100F / 401.03174F),
    CLOTH_30(R.drawable.c3_cloth30, 0F, -26F / 401.03174F),
    CLOTH_31(R.drawable.c3_cloth31, 0F, -26F / 401.03174F),
    CLOTH_32(R.drawable.c3_cloth32, 0F, -34F / 401.03174F),
    CLOTH_33(R.drawable.c3_cloth33, 0F, -8F / 401.03174F),
    CLOTH_34(R.drawable.c3_cloth34, 0F, 20F / 401.03174F),
    CLOTH_35(R.drawable.c3_cloth35, 0F, 16F / 401.03174F),
    CLOTH_36(R.drawable.c3_cloth36, 0F, 22F / 401.03174F),
    CLOTH_37(R.drawable.c3_cloth37, 0F, 20F / 401.03174F),
    CLOTH_38(R.drawable.c3_cloth38, 0F, 30F / 401.03174F),
    CLOTH_39(R.drawable.c3_cloth39, 0F, 28F / 401.03174F),
    CLOTH_40(R.drawable.c3_cloth40, 0F, 20F / 401.03174F),
    CLOTH_41(R.drawable.c3_cloth41, 0F, 20F / 401.03174F),
    CLOTH_42(R.drawable.c3_cloth42, 0F, 24F / 401.03174F),
    CLOTH_43(R.drawable.c3_cloth43, 0F, 24F / 401.03174F),
    CLOTH_44(R.drawable.c3_cloth44, 0F, 50F / 401.03174F),
    CLOTH_45(R.drawable.c3_cloth45, 0F, 54F / 401.03174F),
    CLOTH_46(R.drawable.c3_cloth46, 0F, 12F / 401.03174F),
    CLOTH_47(R.drawable.c3_cloth47, 0F, 14F / 401.03174F),
    CLOTH_48(R.drawable.c3_cloth48, 0F, 22F / 401.03174F),
    CLOTH_49(R.drawable.c3_cloth49, 0F, 30F / 401.03174F),
    CLOTH_50(R.drawable.c3_cloth50, 0F, -17F / 401.03174F),
    CLOTH_51(R.drawable.c3_cloth51, 0F, 22F / 401.03174F),
    CLOTH_52(R.drawable.c3_cloth52, 0F, 4F / 401.03174F),
    CLOTH_53(R.drawable.c3_cloth53, 0F, 52F / 401.03174F),
    CLOTH_54(R.drawable.c3_cloth54, 0F, -18F / 401.03174F),
    CLOTH_55(R.drawable.c3_cloth55, 0F, 16F / 401.03174F),
    CLOTH_56(R.drawable.c3_cloth56, 0F, 18F / 401.03174F),
    CLOTH_57(R.drawable.c3_cloth57, 0F, 40F / 401.03174F),
    CLOTH_58(R.drawable.c3_cloth58, 0F, 60F / 401.03174F),
    CLOTH_59(R.drawable.c3_cloth59, 0F, 16F / 401.03174F),
    CLOTH_60(R.drawable.c3_cloth60, 0F, 40F / 401.03174F),
    CLOTH_61(R.drawable.c3_cloth61, 0F, 40F / 401.03174F),
    ;

    private BlockVO block;

    Cloth(int id) {
        this(id, 0F, 0F);
    }

    Cloth(int index, float topOffset, float leftOffset) {
        this.block = new BlockVO(BlockType.CLOTH, index, topOffset, leftOffset);
    }

    public static int size() {
        return Cloth.values().length;
    }

    public static BlockVO getByIndex(int index) {
        Cloth[] cloths = Cloth.values();
        if (index < 0 || index >= cloths.length) {
            return cloths[0].block;
        }
        return cloths[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}
