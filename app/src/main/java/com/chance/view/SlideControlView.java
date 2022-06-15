package com.chance.view;

import java.util.ArrayList;
import java.util.List;

import com.chance.R;
import com.chance.listener.SlideControlListener;
import com.chance.utils.BitmapUtil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/**
 * 滑动空间视图
 *
 * @author lsy
 */
public class SlideControlView extends View {

    /** 画笔 */
    private Paint paint;
    /** 滑动条边距间隔 */
    private float slideTopGap;
    /** 滑动条粗细比例 */
    private float slideThicknessProportions;
    /** 滑块相对滑动条的比例 */
    private float slideRectProportions;
    /** 滑块当前位置 */
    private float slideRectLocation;
    /** 重绘标识 */
    private boolean refresh;

    public SlideControlView(Context context) {
        super(context);
    }

    public SlideControlView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SlideControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SlideControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void drawSlideThickness(Canvas canvas) {
        paint.setPathEffect(null);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        // 绘制滚动条
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.slide_background);
        NinePatch ninePatch = new NinePatch(bitmap, bitmap.getNinePatchChunk(), null);
        float slideWidth = getWidth() * slideThicknessProportions;
        RectF rectF = new RectF((getWidth() - slideWidth) / 2f , slideTopGap, (getWidth() + slideWidth) / 2f, getHeight() - slideTopGap);
        ninePatch.draw(canvas, rectF);
    }

    private void drawSlideRect(Canvas canvas) {
        // 点击坐标
        List<float[]> buttonXs = new ArrayList<>();
        List<float[]> buttonYs = new ArrayList<>();
        // 滑动条宽度
        float slideWidth = getWidth() * slideThicknessProportions;
        // 绘制滑块
        float slideRectWidth = slideWidth * slideRectProportions;
        Bitmap slideRect = BitmapUtil.getBitMapWithWidth(getResources(), R.drawable.input_field_background, slideRectWidth);
        canvas.drawBitmap(slideRect, (getWidth() - slideRectWidth) / 2f, getHeight() - slideTopGap - slideRect.getHeight() - slideRectLocation, paint);
        buttonXs.add(new float[] {(getWidth() - slideRectWidth) / 2f, (getWidth() + slideRectWidth) / 2f});
        buttonYs.add(new float[] {getHeight() - slideTopGap - slideRect.getHeight() - slideRectLocation, getHeight() - slideTopGap - slideRectLocation});
        // 添加监听器
        if (!refresh) {
            this.setOnTouchListener(new SlideControlListener(buttonXs, buttonYs, slideTopGap, getHeight() - slideTopGap, this));
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.paint = new Paint();
        // 绘制控件
        drawSlideThickness(canvas);
        drawSlideRect(canvas);
    }

    public void moveSlideRect(float location) {
        this.slideRectLocation = location;
        this.refresh = true;
        this.invalidate();
    }

    public void setSlideTopGap(float slideTopGap) {
        this.slideTopGap = slideTopGap;
    }

    public void setSlideThicknessProportions(float slideThicknessProportions) {
        this.slideThicknessProportions = slideThicknessProportions;
    }

    public void setSlideRectProportions(float slideRectProportions) {
        this.slideRectProportions = slideRectProportions;
    }

    public void setSlideRectLocation(float slideRectLocation) {
        this.slideRectLocation = slideRectLocation;
    }
}
