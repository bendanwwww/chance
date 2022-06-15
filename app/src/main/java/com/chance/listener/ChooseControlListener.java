package com.chance.listener;

import java.util.List;

import com.chance.view.ChooseControlView;

/**
 * 选择控件监听器
 *
 * @author lsy
 */
public class ChooseControlListener extends AbstractListener {

    /** 控件实体 */
    private ChooseControlView chooseControlView;

    public ChooseControlListener(List<float[]> buttonX, List<float[]> buttonY, ChooseControlView chooseControlView) {
        super(buttonX, buttonY);
        this.chooseControlView = chooseControlView;
    }

    @Override
    public void downAction(int i, float downX, float downY) {
        if (i == 0) {
            chooseControlView.reduceNumber();
        }
        if (i == 1) {
            chooseControlView.addNumber();
        }
    }

    @Override
    public ListenerType listenerType() {
        return ListenerType.CLICK;
    }
}
