package com.chance.listener;

import java.util.List;

import com.chance.view.ChooseControlView;

/**
 * 日程编辑按钮监听器
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
    public void downAction(int i) {
        if (i == 0) {
            chooseControlView.reduceNumber();
        }
        if (i == 1) {
            chooseControlView.addNumber();
        }
    }

    @Override
    public void moveAction(int i) {

    }

    @Override
    public void upAction(int i) {

    }
}
