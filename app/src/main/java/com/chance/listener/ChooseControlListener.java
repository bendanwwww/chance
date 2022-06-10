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
    /** 资源数组 */
    private int[] source;

    public ChooseControlListener(List<float[]> buttonX, List<float[]> buttonY, ChooseControlView chooseControlView, int[] source) {
        super(buttonX, buttonY);
        this.chooseControlView = chooseControlView;
        this.source = source;
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
