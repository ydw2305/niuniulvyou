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

public class CustomIndictor extends View
{

	private Paint mPaint;
	private Paint mPaint1;
	private int num = 5;
	private double near = 0.2;//两条线中间间隔
	private int mRadius;
	private int mWidth;
	private int position;
	private float arg1;
	private int backgroundcolor;
	private int srccolor;

	public CustomIndictor(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		initPaint();
		TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomIndictor);
		mRadius = typedArray.getInteger(R.styleable.CustomIndictor_radius, 20);
		mWidth = typedArray.getInteger(R.styleable.CustomIndictor_strokewidth, 20);
		backgroundcolor = typedArray.getColor(R.styleable.CustomIndictor_BackGroundColor, Color.BLACK);
		srccolor = typedArray.getColor(R.styleable.CustomIndictor_SrcColor, Color.BLACK);
		typedArray.recycle();
	}

	private void initPaint()
	{
		mPaint = new Paint();
		mPaint.setAntiAlias(true);
		mPaint.setStyle(Paint.Style.FILL);
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
		mPaint.setStrokeWidth(mWidth);
		mPaint.setColor(backgroundcolor);
		for (int i = 0; i < num; i++)
		{
			canvas.drawLine((float) (-(num + 2)*mRadius + i*3*mRadius), 0, (float) (-num*mRadius + (i + near)*3*mRadius), 0, mPaint);
		}
		mPaint1.setStrokeWidth(mWidth);
		mPaint1.setColor(srccolor);
		canvas.drawLine((float) (-(num + 2)*mRadius + (position+arg1)*3*mRadius), 0, (float) (-num*mRadius + (position + arg1 + near)*3*mRadius), 0, mPaint1);
	}

	public void move(int position, float arg1)
	{
		this.position = position;
		this.arg1 = arg1;
		//当为最后一个数时，跳回第一个
		if (position == num -1)
		{
			this.arg1 = 0;
		}
		invalidate();
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}


}
