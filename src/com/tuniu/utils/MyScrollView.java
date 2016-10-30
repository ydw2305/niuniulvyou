package com.tuniu.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class MyScrollView extends ScrollView
{

	public MyScrollView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}
	
	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt)
	{
		if (listener != null)
		{
			listener.OnFloatScroll(t, oldt);
		}
		super.onScrollChanged(l, t, oldl, oldt);
	}
	
	public interface OnFloatScrollListenter
	{
		void OnFloatScroll(int height, int oldheight);
	}
	
	private OnFloatScrollListenter listener; 
	
	public void setOnFloatScrollListenter(OnFloatScrollListenter l)
	{
		listener = l;
	}

}
