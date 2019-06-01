package com.example.learnopencv.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class MyRL extends RelativeLayout {
    private Rect mRect;
    private Paint mRectPaint;
    private Rect mRealRect;
    private void init(){
        mRectPaint=new Paint();
        mRectPaint.setColor(Color.GREEN);
        mRectPaint.setStyle(Paint.Style.STROKE);
        mRect=new Rect(100,100,300,200);
    }
    public MyRL(Context context) {
        super(context);
        init();
    }

    public MyRL(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyRL(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int left=getLeft()+(getMeasuredWidth()-800)/2+mRect.left;
        int top=getTop()+(getMeasuredHeight()-600)/2+mRect.top;
        mRealRect=new Rect(left
                            ,top
                            ,left+mRect.width()
                            ,top+mRect.height()
        );
    }


    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (mRealRect!=null){
            canvas.drawRect(mRealRect,mRectPaint);
        }
    }
}
