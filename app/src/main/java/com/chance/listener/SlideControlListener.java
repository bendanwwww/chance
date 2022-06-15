package com.chance.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.chance.view.ChooseControlView;
import com.chance.view.SlideControlView;

/**
 * 滑块控件监听器
 *
 * @author lsy
 */
public class SlideControlListener extends AbstractListener {

    /** 控件实体 */
    private SlideControlView slideControlView;
    /** 滑动条头部y坐标*/
    private float slideThicknessTopY;
    /** 滑动条底部y坐标 */
    private float slideThicknessBottomY;

    public SlideControlListener(List<float[]> buttonX, List<float[]> buttonY,
                                float slideThicknessTopY, float slideThicknessBottomY, SlideControlView slideControlView) {
        super(buttonX, buttonY);
        this.slideThicknessTopY = slideThicknessTopY;
        this.slideThicknessBottomY = slideThicknessBottomY;
        this.slideControlView = slideControlView;
    }

    @Override
    public void moveAction(int i, float currentX, float currentY, float firstX, float firstY) {
        // 计算滑动距离
        float rectLocation = firstY - currentY;
        // 判断滑动范围
        if (initButtonYs.get(i)[0] - rectLocation < slideThicknessTopY
                || initButtonYs.get(i)[1] - rectLocation > slideThicknessBottomY) {
            return;
        }
        slideControlView.moveSlideRect(slideThicknessBottomY - initButtonYs.get(i)[1] + rectLocation);
        // 修改监听范围
        buttonYs.get(i)[0] = initButtonYs.get(i)[0] - rectLocation;
        buttonYs.get(i)[1] = initButtonYs.get(i)[1] - rectLocation;
    }

    @Override
    public ListenerType listenerType() {
        return ListenerType.MOVE;
    }
}
