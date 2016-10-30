package com.tuniu.utils;

import java.util.ArrayList;

import com.tuniu.activity.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class letterBarCustom extends View
{

	private Paint mPaint;
	private Paint mPaint1;
	private ArrayList<String> letterlist = new ArrayList<String>();
	private int height;
	private int index;
	private int textSize;
	private TextView mtv;
	private int moColor;
	private int touchColor;
	private boolean isTouch;
	private Runnable Action = new Runnable()
	{
		public void run()
		{
			mtv.setVisibility(View.INVISIBLE);
		}
	};
	

	public void setTouchDialog(TextView mtv)
	{
		this.mtv = mtv;
	}

	@SuppressLint("Recycle")
	public letterBarCustom(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.letterBarCustom);
		textSize = typedArray.getInteger(R.styleable.letterBarCustom_textSize, 30);
		moColor = typedArray.getColor(R.styleable.letterBarCustom_moColor, Color.BLACK);
		touchColor = typedArray.getColor(R.styleable.letterBarCustom_touchColor, Color.BLACK);
		
		initData();
		initPaint();
	}

	private void initData()
	{
		letterlist.add("#");
		for (char i = 'A'; i <= 'Z'; i++)
		{
			letterlist.add(i + "");
		}
	}

	private void initPaint()
	{
		mPaint = new Paint();
		mPaint.setStyle(Paint.Style.STROKE);
		mPaint.setTextAlign(Align.CENTER);
		mPaint.setTextSize(textSize);
		mPaint.setColor(moColor);
		mPaint.setAntiAlias(true);

		mPaint1 = new Paint();
		mPaint1.setStyle(Paint.Style.FILL_AND_STROKE);
		mPaint1.setTextAlign(Align.CENTER);
		mPaint1.setTextSize(textSize + 4);
		mPaint1.setStrokeWidth(2);
		mPaint1.setColor(touchColor);
		mPaint1.setAntiAlias(true);
	}

	@SuppressLint("ClickableViewAccessibility")
	@Override
	public boolean onTouchEvent(MotionEvent event)
	{
		float y2 = event.getY();
		//获得触碰字母下标
		index = (int) (y2 / (height / letterlist.size()));
		int action = event.getAction();
		if (index < 0)
		{
			index = 0;
		}
		if (index > letterlist.size() - 1)
		{
			index = letterlist.size() - 1;
		}
		switch (action)
		{
		case MotionEvent.ACTION_DOWN:
			isTouch = true;
			mtv.removeCallbacks(Action);
			mtv.setVisibility(View.VISIBLE);
			mtv.setText(letterlist.get(index));
			break;
		case MotionEvent.ACTION_MOVE:
			isTouch = true;
			mtv.removeCallbacks(Action);
			mtv.setVisibility(View.VISIBLE);
			mtv.setText(letterlist.get(index));
			listener.onSelect(letterlist.get(index));
			break;
		case MotionEvent.ACTION_UP:
			isTouch = false;
			listener.onSelect(letterlist.get(index));
			mtv.postDelayed(Action, 1000);
			break;

		default:
			break;
		}
		invalidate();
		return true;
	}

	@Override
	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		int width = canvas.getWidth();
		height = canvas.getHeight();
		canvas.translate(width/2, 30);
		for (int i = 0; i < letterlist.size(); i++)
		{

			if (isTouch)
			{
				if (i == index)
				{
					canvas.drawText(letterlist.get(index), 0, (height/letterlist.size())*index, mPaint1);
				}
				else
				{
					canvas.drawText(letterlist.get(i), 0, (height/letterlist.size())*i, mPaint);
				}
			}
			else
			{
				canvas.drawText(letterlist.get(i), 0, (height/letterlist.size())*i, mPaint);
			}
		}
		if (isTouch)
		{
			canvas.drawText(letterlist.get(index), 0, (height/letterlist.size())*index, mPaint1);
		}
	}
	
	public interface OnTouchLetterListener
	{
		void onSelect(String s);
	}
	private OnTouchLetterListener listener;
	
	public void SetOnTouchLetterListener(OnTouchLetterListener l)
	{
		if (l != null)
		{
			listener = l;
		}
	}

}
