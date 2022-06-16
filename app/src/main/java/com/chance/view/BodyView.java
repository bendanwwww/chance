package com.chance.view;

import com.chance.R;
import com.chance.constants.BlockType;
import com.chance.constants.Body;
import com.chance.constants.Brow;
import com.chance.constants.Cloth;
import com.chance.constants.Hair;
import com.chance.constants.HairF;
import com.chance.constants.Mou;
import com.chance.entities.BlockVO;
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
        // 获取组件
        BlockVO bodyVO = Body.getByIndex(bodyId);
        BlockVO clothVO = Cloth.getByIndex(clothId);
        BlockVO mouVO = Mou.getByIndex(mouId);
        BlockVO hariVO = Hair.getByIndex(hairId);
        BlockVO hariFVO = HairF.getByIndex(fHairId);
        BlockVO browVO = Brow.getByIndex(browId);
        // 基础图像大小
        float bodyWidth = BitmapUtil.getBitMapWidth(getResources(), bodyVO.getBlockId());
        float bodyHeight = BitmapUtil.getBitMapHeight(getResources(), bodyVO.getBlockId());
        // 修正画布宽度
        width = width > height ? height * bodyWidth / bodyHeight : width;
        // 图像放大倍数
        float multiple = width / bodyWidth;
        // 图像居中
        float gap = (getWidth() - width) / 2;
        // 组件 bitmap
        Bitmap body = BitmapUtil.getBitMapWithWidth(getResources(), bodyVO.getBlockId(), width);
        Bitmap cloth = BitmapUtil.getBitMapWithMultiple(getResources(), clothVO.getBlockId(), multiple);
        Bitmap ear = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_ear0, multiple);
        Bitmap eye = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_eye0, multiple);
        Bitmap eyeb = BitmapUtil.getBitMapWithMultiple(getResources(), R.drawable.c3_eyeb0, multiple);
        Bitmap mou = BitmapUtil.getBitMapWithMultiple(getResources(), mouVO.getBlockId(), multiple);
        Bitmap hair = BitmapUtil.getBitMapWithMultiple(getResources(), hariVO.getBlockId(), multiple);
        Bitmap fhair = BitmapUtil.getBitMapWithMultiple(getResources(), hariFVO.getBlockId(), multiple);
        Bitmap brow = BitmapUtil.getBitMapWithMultiple(getResources(), browVO.getBlockId(), multiple);
        // 绘图
        // width: 1080 height: 1450 body height: 1245
        canvas.drawBitmap(body, gap + width * 0.083F + width * bodyVO.getLeftOffset(), 0F + height * bodyVO.getTopOffset(), paint);
        canvas.drawBitmap(eye, gap + width * 0.111F, body.getHeight() * 0.385F, paint);
        canvas.drawBitmap(eyeb, gap + width * 0.157F, body.getHeight() * 0.393F, paint);
        canvas.drawBitmap(mou, gap + width * 0.222F + width * mouVO.getLeftOffset(), body.getHeight() * 0.642F + height * mouVO.getTopOffset(), paint);
        canvas.drawBitmap(brow, gap + width * 0.093F + width * browVO.getLeftOffset(), body.getHeight() * 0.313F + height * browVO.getTopOffset(), paint);
        canvas.drawBitmap(hair, gap + width * 0.074F + width * hariVO.getLeftOffset(), 0F + height * hariVO.getTopOffset(), paint);
        canvas.drawBitmap(ear, gap + width * 0.090F, body.getHeight() * 0.376F, paint);
        canvas.drawBitmap(fhair, gap + width * hariFVO.getLeftOffset(), body.getHeight() * 0.048F + height * hariFVO.getTopOffset(), paint);
        canvas.drawBitmap(cloth, gap + width * 0.056F + width * clothVO.getLeftOffset(), body.getHeight() - cloth.getHeight() + height * clothVO.getTopOffset(), paint);
    }

    public void setViewId(BlockType type, int id) {
        switch (type) {
            case BODY:
                this.bodyId = id;
                return;
            case CLOTH:
                this.clothId = id;
                return;
            case MOU:
                this.mouId = id;
                return;
            case HAIR:
                this.hairId = id;
                return;
            case BROW:
                this.browId = id;
                return;
            case F_HAIR:
                this.fHairId = id;
                return;
            default:
                return;
        }
    }
}
