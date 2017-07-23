package com.koo.mycustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/23.
 */

public class PieChartView extends View {
    public PieChartView(Context context) {
        super(context);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int
            defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    Paint paintTv = new Paint(Paint.ANTI_ALIAS_FLAG);

    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint4 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint5 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint6 = new Paint(Paint.ANTI_ALIAS_FLAG);

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path1 = new Path();
    Path path2 = new Path();
    Path path3 = new Path();
    Path path4 = new Path();
    Path path5 = new Path();
    Path path6 = new Path();
    Path path7 = new Path();


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        //泥黄色
        paint1.setColor(Color.parseColor("#FF9933"));
        canvas.drawArc(150,30,750,650,-50,50,true,paint1);
        //紫红色
        paint2.setColor(Color.parseColor("#663399"));
        canvas.drawArc(150,30,750,650,2,8,true,paint2);
        //浅灰色
        paint3.setColor(Color.parseColor("#808080"));
        canvas.drawArc(150,30,750,650,12,7,true,paint3);
        //深绿色
        paint4.setColor(Color.parseColor("#009933"));
        canvas.drawArc(150,30,750,650,21,60,true,paint4);
        //天蓝色
        paint5.setColor(Color.parseColor("#00CCFF"));
        canvas.drawArc(150,30,750,650,83,95,true,paint5);
        //红色
        paint6.setColor(Color.parseColor("#FF0000"));
        canvas.drawArc(140,15,740,635,180,125,true,paint6);

        paintTv.setColor(Color.WHITE);
        paintTv.setTextSize(30);
        canvas.drawText("饼图",400,getHeight(),paintTv);


        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);

        path1.moveTo(120,50);
        path1.lineTo(250,50);
        path1.rLineTo(20,20);
        canvas.drawPath(path1,paint);
        canvas.drawText("Lollipop",5, 50, paintTv);

        path2.moveTo(120,600);
        path2.lineTo(230,600);
        path2.rLineTo(20,-20);
        canvas.drawPath(path2,paint);
        canvas.drawText("Kitkat",10,600,paintTv);

        path3.moveTo(840,150);
        path3.lineTo(750,150);
        path3.rLineTo(-40,30);
        canvas.drawPath(path3,paint);
        canvas.drawText("Marshmallow",850,150,paintTv);

        path4.moveTo(840,350);
        path4.lineTo(750,350);
        canvas.drawPath(path4,paint);
        canvas.drawText("Froyo",850,350,paintTv);

        path5.moveTo(840,400);
        path5.lineTo(810,400);
        path5.lineTo(780,380);
        path5.rLineTo(-30,0);
        canvas.drawPath(path5,paint);
        canvas.drawText("GingerBread",850,410,paintTv);

        path6.moveTo(840,460);
        path6.lineTo(810,460);
        path6.lineTo(780,430);
        path6.rLineTo(-35,0);
        canvas.drawPath(path6,paint);
        canvas.drawText("lce Cream Sandwich",850,470,paintTv);

        path7.moveTo(840,600);
        path7.lineTo(750,600);
        path7.rLineTo(-80,-40);
        canvas.drawPath(path7,paint);
        canvas.drawText("Jelly Bean",850,600,paintTv);

    }
}

