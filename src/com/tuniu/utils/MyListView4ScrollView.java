package com.tuniu.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class MyListView4ScrollView extends ListView {
	public MyListView4ScrollView(Context context) {
		super(context);
	}

	public MyListView4ScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyListView4ScrollView(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}
	
	/**
	 * 重写该方法，重新计算ListView高度
	 * 累计所有行，计算出ListView的最大高度
	 */
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
	
	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt) {
		// TODO Auto-generated method stub
		if (listener != null)
		{
			listener.OnMyScroll(t, oldt);
		}
		super.onScrollChanged(l, t, oldl, oldt);
	}
	
	public interface OnMyScrollListenter
	{
		void OnMyScroll(int height, int oldheight);
	}
	
	private OnMyScrollListenter listener; 
	
	public void setOnFloatScrollListenter(OnMyScrollListenter l)
	{
		listener = l;
	}
	
}
