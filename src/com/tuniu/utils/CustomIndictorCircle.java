package com.tuniu.utils;

import com.tuniu.activity.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.View;

public class CustomIndictorCircle extends View
{

	private Paint mPaint;
	private Paint mPaint1;
	private int num;
	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}

	private int mRadius;
	private int position;
	private float arg1;
	private int backgroundcolor;
	private int srccolor;

	public CustomIndictorCircle(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		initPaint();
		TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomIndictorCircle);
		mRadius = typedArray.getInteger(R.styleable.CustomIndictorCircle_cradius, 20);
		backgroundcolor = typedArray.getColor(R.styleable.CustomIndictorCircle_cBackGroundColor, Color.BLACK);
		srccolor = typedArray.getColor(R.styleable.CustomIndictorCircle_cSrcColor, Color.BLACK);
		typedArray.recycle();
	}

	private void initPaint()
	{
		mPaint = new Paint();
		mPaint.setAntiAlias(true);
		mPaint.setStyle(Paint.Style.FILL);
		mPaint.setStrokeWidth(2);
		mPaint.setTextAlign(Align.CENTER);
		
		mPaint1 = new Paint();
		mPaint1.setAntiAlias(true);
		mPaint1.setStyle(Paint.Style.FILL);
		mPaint1.setTextAlign(Align.CENTER);
	}
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		int width = canvas.getWidth();
		int height = canvas.getHeight();
		canvas.translate(width/2, height/2);
		mPaint.setColor(backgroundcolor);
		for (int i = 0; i < num; i++)
		{
			canvas.drawCircle((float) (-(num - 1)*1.5*mRadius + i*3*mRadius), 0, mRadius, mPaint);
		}
		mPaint1.setColor(srccolor);
		canvas.drawCircle((float) (-(num - 1)*1.5*mRadius) + (position+arg1)*3*mRadius, 0, mRadius, mPaint1);
	}
	
	public void move(int position, float arg1)
	{
		this.position = position;
		this.arg1 = arg1;
		if (position == num -1)
		{
			this.arg1 = 0;
		}
		invalidate();
	}

}
