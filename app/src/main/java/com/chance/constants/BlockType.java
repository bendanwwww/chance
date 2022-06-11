package com.chance.constants;

import java.util.Objects;

/**
 * 组件类型
 */
public enum BlockType {
    BODY(Body.values()),
    CLOTH(Cloth.values()),
    MOU(Mou.values()),
    HAIR(Hair.values()),
    F_HAIR(HairF.values()),
    BROW(Brow.values()),
    EAR,
    EYE,
    EYE_B,
    ;

    private Enum[] source;

    BlockType() { }

    BlockType(Enum[] source) {
        this.source = source;
    }

    public int sourceIndex() {
        if (Objects.isNull(source)) {
            return 0;
        }
        return source.length;
    }
}
