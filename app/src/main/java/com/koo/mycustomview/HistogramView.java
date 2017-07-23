package com.koo.mycustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/23.
 */

public class HistogramView extends View {
    public HistogramView(Context context) {
        super(context);
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int
            defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    Paint paintL = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paintR = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paintTv = new Paint(Paint.ANTI_ALIAS_FLAG);

    int left = 130;
    int right = left + 100;
    int top = 490;


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //绘制线条
        paintL.setStyle(Paint.Style.STROKE);
        paintL.setColor(Color.WHITE);
        paintL.setStrokeWidth(2);
        canvas.drawLine(120, 20, 120, 500, paintL);
        canvas.drawLine(120, 500, 950, 500, paintL);

        //绘制矩形
        paintR.setColor(Color.GREEN);
        paintR.setStyle(Paint.Style.FILL);
        canvas.drawRect(left, top, right, 500, paintR);
        canvas.drawRect(245, 450, 345, 500, paintR);
        canvas.drawRect(360, 450, 460, 500, paintR);
        canvas.drawRect(475, 250, 575, 500, paintR);
        canvas.drawRect(590, 120, 690, 500, paintR);
        canvas.drawRect(705, 70, 805, 500, paintR);
        canvas.drawRect(820, 280, 920, 500, paintR);

        //绘制文字
        paintTv.setColor(Color.WHITE);
        paintTv.setTextSize(30);
        canvas.drawText("Froyo", 140, 530, paintTv);
        canvas.drawText("GB", 265, 530, paintTv);
        canvas.drawText("ICS", 385, 530, paintTv);
        canvas.drawText("JB", 505, 530, paintTv);
        canvas.drawText("KitKat", 605, 530, paintTv);
        canvas.drawText("L", 745, 530, paintTv);
        canvas.drawText("M", 865, 530, paintTv);
    }

}
