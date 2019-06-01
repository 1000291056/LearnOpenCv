package com.example.learnopencv.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class DrawRectView extends View {
    private Paint mRectPaint;
    private Rect mRect;
    private void init(){
        mRectPaint=new Paint();
        mRectPaint.setColor(Color.GREEN);
        mRectPaint.setStyle(Paint.Style.STROKE);
        mRect=new Rect(100,100,300,200);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.RED);
        mRectPaint.setColor(Color.BLUE);
        canvas.drawCircle(50,50,50,mRectPaint);
        mRectPaint.setColor(Color.GREEN);
//        canvas.drawRect(mRect,mRectPaint);
    }

    public DrawRectView(Context context) {
        super(context);
        init();
    }

    public DrawRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawRectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width=800;
        int height=600;
        setMeasuredDimension(width,height);
    }
}
