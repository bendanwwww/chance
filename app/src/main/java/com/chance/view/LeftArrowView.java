package com.chance.view;

import com.chance.R;
import com.chance.utils.BitmapUtil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/**
 * 左箭头视图
 *
 * @author lsy
 */
public class LeftArrowView extends View {

    /** 画笔 */
    private Paint paint;
    /** 上下边框间距 */
    private float topGap;

    public LeftArrowView(Context context) {
        super(context);
    }

    public LeftArrowView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LeftArrowView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LeftArrowView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        if (widthMode == MeasureSpec.AT_MOST && heightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(10, 10);
        }else if (widthMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(10, height);
        }else if (heightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(width, 10);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        // 画布长宽
        float width = getWidth();
        float height = getHeight();
        // 基础图像宽度
        float bodyWidth = BitmapUtil.getBitMapWidth(getResources(), R.drawable.c3_body1);
        // 其他图像放大倍数
        float multiple = width / bodyWidth;
        // 组件 bitmap
//        Bitmap body = BitmapUtil.getBitMapWithWidth(getResources(), BODIES[bodyId], width);
//        Bitmap cloth = BitmapUtil.getBitMapWithMultiple(getResources(), CLOTHS[clothId], multiple);
//        Bitmap ear = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_ear0, multiple);
//        Bitmap eye = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_eye0, multiple);
//        Bitmap eyeb = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_eyeb0, multiple);
//        Bitmap mou = BitmapUtil.getBitMapWithMultiple(getResources(), MOUS[mouId], multiple);
//        Bitmap hair = BitmapUtil.getBitMapWithMultiple(getResources(), HAIRS[hairId], multiple);
//        Bitmap fhair = BitmapUtil.getBitMapWithMultiple(getResources(), F_HAIR[fHairId], multiple);
//        Bitmap brow = BitmapUtil.getBitMapWithMultiple(getResources(), BROWS[browId], multiple);
//        // 绘图
//        // width: 1080 height: 1450 body height: 1245
//        canvas.drawBitmap(body, width * 0.083F, 0, paint);
//        canvas.drawBitmap(cloth, width * 0.056F, body.getHeight() - cloth.getHeight(), paint);
//        canvas.drawBitmap(eye, width * 0.111F, body.getHeight() * 0.385F, paint);
//        canvas.drawBitmap(eyeb, width * 0.157F, body.getHeight() * 0.393F, paint);
//        canvas.drawBitmap(mou, width * 0.222F, body.getHeight() * 0.642F, paint);
//        canvas.drawBitmap(brow, width * 0.093F, body.getHeight() * 0.313F, paint);
//        canvas.drawBitmap(hair, width * 0.074F, 0, paint);
//        canvas.drawBitmap(ear, width * 0.083F, body.getHeight() * 0.337F, paint);
//        canvas.drawBitmap(fhair, 0, body.getHeight() * 0.048F, paint);
    }

    public float getTopGap() {
        return topGap;
    }

    public void setTopGap(float topGap) {
        this.topGap = topGap;
    }
}
