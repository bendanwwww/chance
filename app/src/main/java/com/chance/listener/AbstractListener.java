package com.chance.listener;

import java.util.List;
import java.util.stream.Collectors;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

/**
 * 监听器抽象
 *
 * @author lsy
 */
public abstract class AbstractListener implements View.OnTouchListener {

    protected List<float[]> buttonXs;
    protected List<float[]> buttonYs;

    /** 初始热区 */
    protected List<float[]> initButtonXs;
    protected List<float[]> initButtonYs;

    /** 按下坐标 */
    private PointF startPoint = new PointF();
    /** 离开的坐标 */
    private PointF endPoint = new PointF();

    public AbstractListener(List<float[]> buttonXs, List<float[]> buttonYs) {
        this.buttonXs = buttonXs;
        this.buttonYs = buttonYs;
        this.initButtonXs = buttonXs.stream().map(fs -> new float[] {fs[0], fs[1]}).collect(Collectors.toList());
        this.initButtonYs = buttonYs.stream().map(fs -> new float[] {fs[0], fs[1]}).collect(Collectors.toList());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        float downX = event.getX();
        float downY = event.getY();
        int index;
        if ((index = inCoordinate(downX, downY)) < 0 && ListenerType.CLICK.equals(listenerType())) {
            return true;
        }
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startPoint.set(event.getX(), event.getY());
                downAction(index, downX, downY);
                break;
            case MotionEvent.ACTION_MOVE:
                if (ListenerType.MOVE.equals(listenerType())
                        && (index = inMoveCoordinate(startPoint.x, startPoint.y)) >= 0) {
                    moveAction(index, downX, downY, startPoint.x, startPoint.y);
                }
                break;
            case MotionEvent.ACTION_UP:
                endPoint.set(event.getX(), event.getY());
                this.initButtonXs = buttonXs.stream().map(fs -> new float[] {fs[0], fs[1]}).collect(Collectors.toList());
                this.initButtonYs = buttonYs.stream().map(fs -> new float[] {fs[0], fs[1]}).collect(Collectors.toList());
                upAction(index, downX, downY);
                break;
            default:
                break;
        }
        return true;
    }

    public int inCoordinate(float downX, float downY) {
        for (int i = 0 ; i < buttonXs.size() ; i++) {
            float[] buttonX = buttonXs.get(i);
            float[] buttonY = buttonYs.get(i);
            if (downX >= buttonX[0] && downX <= buttonX[1] && downY >= buttonY[0] && downY <= buttonY[1]) {
                return i;
            }
        }
        return -1;
    }

    public int inMoveCoordinate(float downX, float downY) {
        for (int i = 0 ; i < initButtonXs.size() ; i++) {
            float[] buttonX = initButtonXs.get(i);
            float[] buttonY = initButtonYs.get(i);
            if (downX >= buttonX[0] && downX <= buttonX[1] && downY >= buttonY[0] && downY <= buttonY[1]) {
                return i;
            }
        }
        return -1;
    }

    public void downAction(int i, float downX, float downY) { };

    public void moveAction(int i, float currentX, float currentY, float firstX, float firstY) { };

    public void upAction(int i, float downX, float downY) { };

    public abstract ListenerType listenerType();

    public enum ListenerType {
        MOVE,
        CLICK,
        ;
    }
}
