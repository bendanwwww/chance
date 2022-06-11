package com.chance.view;

import java.util.ArrayList;
import java.util.List;

import com.chance.R;
import com.chance.constants.BlockType;
import com.chance.listener.ChooseControlListener;
import com.chance.utils.BitmapUtil;
import com.chance.utils.TextUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/**
 * 选择控件视图
 *
 * @author lsy
 */
public class ChooseControlView extends View {

    /** 画笔 */
    private Paint paint;
    /** 文字画笔 */
    private Paint textPaint;

    /** 矩形边距间隔 */
    private float rectTopGap;
    /** 矩形间隔 */
    private float rectGap;
    /** 人物视图 */
    private BodyView bodyView;
    /** 资源类型 */
    private BlockType blockType;
    /** 数值 */
    private int number;

    public ChooseControlView(Context context) {
        super(context);
    }

    public ChooseControlView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ChooseControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ChooseControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void drawRect(Canvas canvas) {
        paint.setPathEffect(null);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        // 点击坐标
        List<float[]> buttonXs = new ArrayList<>();
        List<float[]> buttonYs = new ArrayList<>();
        // tab 宽度
        float tabWidth = (getWidth() - 2 * rectGap - 2 * rectTopGap) / 3f;
        float rectWidth = getWidth() / 3f;
        float gap = (rectWidth - tabWidth) / 2f;
        // 左向箭头
        Bitmap leftArrow = BitmapUtil.getBitMapWithWidth(getResources(), R.drawable.arrowl, tabWidth);
        canvas.drawBitmap(leftArrow, rectTopGap, (getHeight() - leftArrow.getHeight()) / 2, paint);
        buttonXs.add(new float[] {0, rectWidth});
        buttonYs.add(new float[] {0, getHeight()});
        // 右向箭头
        Bitmap rightArrow = BitmapUtil.getBitMapWithWidth(getResources(), R.drawable.arrowr, tabWidth);
        canvas.drawBitmap(rightArrow, getWidth() - rightArrow.getWidth() - rectTopGap, (getHeight() - leftArrow.getHeight()) / 2, paint);
        buttonXs.add(new float[] {rectWidth * 2, getWidth()});
        buttonYs.add(new float[] {0, getHeight()});
        // 绘制文字
        drawText(canvas, "" + number);
        // 添加监听器
        this.setOnTouchListener(new ChooseControlListener(buttonXs, buttonYs, this));
    }

    private void drawText(Canvas canvas, String i) {
//        Typeface lineFont = Typeface.createFromAsset(getContext().getAssets(), "fonts/title.ttf");
        float textSize = 44f;
//        textPaint.setTypeface(lineFont);
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(textSize);
        canvas.drawText(i, (getWidth() - textSize * TextUtils.textLength(i)) / 2f, (getHeight() + textSize) / 2f, textPaint);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.paint = new Paint();
        this.textPaint = new Paint();
        // 绘制控件
        drawRect(canvas);
    }

    private void refreshBodyView(int number) {
        bodyView.setViewId(blockType, number);
        bodyView.invalidate();
    }

    public void setRectTopGap(float rectTopGap) {
        this.rectTopGap = rectTopGap;
    }

    public void setRectGap(float rectGap) {
        this.rectGap = rectGap;
    }

    public void setBodyView(BodyView bodyView) {
        this.bodyView = bodyView;
    }

    public void setBlockType(BlockType blockType) {
        this.blockType = blockType;
    }

    public void addNumber() {
        if (this.number >= blockType.sourceIndex() - 1) {
            return;
        }
        this.number++;
        this.invalidate();
        refreshBodyView(number);
    }

    public void reduceNumber() {
        if (this.number <= 0) {
            return;
        }
        this.number--;
        this.invalidate();
        refreshBodyView(number);
    }
}
