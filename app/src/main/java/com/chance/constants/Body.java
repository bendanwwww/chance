package com.chance.constants;

import com.chance.R;
import com.chance.entities.BlockVO;

/**
 * 身体组件
 *
 * @author lsy
 */
public enum Body {

    BODY_0(R.drawable.c3_body0),
    BODY_1(R.drawable.c3_body1),
    BODY_2(R.drawable.c3_body2, 0F, -10.5F),
    BODY_3(R.drawable.c3_body3, 0F, -10.5F),
    BODY_4(R.drawable.c3_body4),
    BODY_5(R.drawable.c3_body5),
    BODY_6(R.drawable.c3_body6),
    BODY_7(R.drawable.c3_body7),
    BODY_8(R.drawable.c3_body8),
    BODY_9(R.drawable.c3_body9),
    ;

    private BlockVO block;

    Body(int id) {
        this(id, 0F, 0F);
    }

    Body(int index, float topOffset, float leftOffset) {
        this.block = new BlockVO(BlockType.BODY, index, topOffset, leftOffset);
    }

    public static int size() {
        return Body.values().length;
    }

    public static BlockVO getByIndex(int index) {
        Body[] bodies = Body.values();
        if (index < 0 || index >= bodies.length) {
            return bodies[0].block;
        }
        return bodies[index].block;
    }

    public static int getIdByIndex(int index) {
        return getByIndex(index).getBlockId();
    }
}
