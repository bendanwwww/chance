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
 * 角色模型视图
 *
 * @author lsy
 */
public class BodyView extends View {

    /** 画笔 */
    private Paint paint;

    /** 身体id */
    private int bodyId;
    /** 服装id */
    private int clothId;
    /** 嘴巴id */
    private int mouId;
    /** 头发id */
    private int hairId;
    /** 刘海id */
    private int fHairId;
    /** 眉毛id */
    private int browId;

    // TODO
    public static final int[] BODIES = {R.drawable.c3_body1, R.drawable.c3_body4, R.drawable.c3_body5,
            R.drawable.c3_body6, R.drawable.c3_body7, R.drawable.c3_body8, R.drawable.c3_body9};

    public static final int[] BROWS = {R.drawable.c3_brow0, R.drawable.c3_brow1, R.drawable.c3_brow2,
            R.drawable.c3_brow3, R.drawable.c3_brow4, R.drawable.c3_brow5, R.drawable.c3_brow6, R.drawable.c3_brow7,
            R.drawable.c3_brow8, R.drawable.c3_brow9, R.drawable.c3_brow10};

    public static final int[] MOUS = {R.drawable.c3_mou0, R.drawable.c3_mou2, R.drawable.c3_mou3, R.drawable.c3_mou4, R.drawable.c3_mou5,
            R.drawable.c3_mou6, R.drawable.c3_mou7, R.drawable.c3_mou9,
            R.drawable.c3_mou10, R.drawable.c3_mou11, R.drawable.c3_mou12, R.drawable.c3_mou13, R.drawable.c3_mou14, R.drawable.c3_mou15,
            R.drawable.c3_mou16, R.drawable.c3_mou17, R.drawable.c3_mou18, R.drawable.c3_mou19, R.drawable.c3_mou20, R.drawable.c3_mou21,
            R.drawable.c3_mou22, R.drawable.c3_mou23, R.drawable.c3_mou24};

    public static final int[] HAIRS = {R.drawable.c3_bhair0, R.drawable.c3_bhair1, R.drawable.c3_bhair2, R.drawable.c3_bhair5,
            R.drawable.c3_bhair6, R.drawable.c3_bhair7, R.drawable.c3_bhair8, R.drawable.c3_bhair9, R.drawable.c3_bhair10,
            R.drawable.c3_bhair11, R.drawable.c3_bhair12, R.drawable.c3_bhair13, R.drawable.c3_bhair14, R.drawable.c3_bhair15,
            R.drawable.c3_bhair16, R.drawable.c3_bhair17};

    public static final int[] F_HAIR = {R.drawable.c3_fhair1, R.drawable.c3_fhair2, R.drawable.c3_fhair3, R.drawable.c3_fhair4,
            R.drawable.c3_fhair5, R.drawable.c3_fhair8,
            R.drawable.c3_fhair10, R.drawable.c3_fhair11, R.drawable.c3_fhair12, R.drawable.c3_fhair13,
            R.drawable.c3_fhair16, R.drawable.c3_fhair17, R.drawable.c3_fhair18, R.drawable.c3_fhair19};

    public static final int[] CLOTHS = {R.drawable.c3_cloth2, R.drawable.c3_cloth3, R.drawable.c3_cloth4,
            R.drawable.c3_cloth5, R.drawable.c3_cloth13, R.drawable.c3_cloth15,
            R.drawable.c3_cloth18, R.drawable.c3_cloth21,
            R.drawable.c3_cloth27, R.drawable.c3_cloth28,
            R.drawable.c3_cloth33,
            R.drawable.c3_cloth47, R.drawable.c3_cloth51, R.drawable.c3_cloth52};

    public BodyView(Context context) {
        super(context);
    }

    public BodyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BodyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BodyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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
        } else if (widthMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(10, height);
        } else if (heightMode == MeasureSpec.AT_MOST) {
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
        // 基础图像大小
        float bodyWidth = BitmapUtil.getBitMapWidth(getResources(), R.drawable.c3_body1);
        float bodyHeight = BitmapUtil.getBitMapHeight(getResources(), R.drawable.c3_body1);
        // 修正画布宽度
        width = width > height ? height * bodyWidth / bodyHeight : width;
        // 图像放大倍数
        float multiple = width / bodyWidth;
        // 图像居中
        float gap = (getWidth() - width) / 2;
        // 组件 bitmap
        Bitmap body = BitmapUtil.getBitMapWithWidth(getResources(), BODIES[bodyId], width);
        Bitmap cloth = BitmapUtil.getBitMapWithMultiple(getResources(), CLOTHS[clothId], multiple);
        Bitmap ear = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_ear0, multiple);
        Bitmap eye = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_eye0, multiple);
        Bitmap eyeb = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_eyeb0, multiple);
        Bitmap mou = BitmapUtil.getBitMapWithMultiple(getResources(), MOUS[mouId], multiple);
        Bitmap hair = BitmapUtil.getBitMapWithMultiple(getResources(), HAIRS[hairId], multiple);
        Bitmap fhair = BitmapUtil.getBitMapWithMultiple(getResources(), F_HAIR[fHairId], multiple);
        Bitmap brow = BitmapUtil.getBitMapWithMultiple(getResources(), BROWS[browId], multiple);
        // 绘图
        // width: 1080 height: 1450 body height: 1245
        canvas.drawBitmap(body, gap + width * 0.083F, 0, paint);
        canvas.drawBitmap(cloth, gap + width * 0.056F, body.getHeight() - cloth.getHeight(), paint);
        canvas.drawBitmap(eye, gap + width * 0.111F, body.getHeight() * 0.385F, paint);
        canvas.drawBitmap(eyeb, gap + width * 0.157F, body.getHeight() * 0.393F, paint);
        canvas.drawBitmap(mou, gap + width * 0.222F, body.getHeight() * 0.642F, paint);
        canvas.drawBitmap(brow, gap + width * 0.093F, body.getHeight() * 0.313F, paint);
        canvas.drawBitmap(hair, gap + width * 0.074F, 0, paint);
        canvas.drawBitmap(ear, gap + width * 0.083F, body.getHeight() * 0.337F, paint);
        canvas.drawBitmap(fhair, gap, body.getHeight() * 0.048F, paint);
    }

    public void setBodyId(int bodyId) {
        this.bodyId = bodyId;
    }

    public void setClothId(int clothId) {
        this.clothId = clothId;
    }

    public void setMouId(int mouId) {
        this.mouId = mouId;
    }

    public void setHairId(int hairId) {
        this.hairId = hairId;
    }

    public void setBrowId(int browId) {
        this.browId = browId;
    }

    public void setfHairId(int fHairId) {
        this.fHairId = fHairId;
    }
}
