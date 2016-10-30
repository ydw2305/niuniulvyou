package com.tuniu.superAdater.util;



import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class SuperAdapter<T> extends BaseAdapter {


	protected LayoutInflater mInflater;
	protected Context context;
	protected List<T> mDatas;
	protected final int mLayoutId;
	protected List<Integer> mLayouts;


	public SuperAdapter(Context context,List<T> mdaList,int mLayoutId) {

		this.context=context;
		this.mDatas=mdaList;
		this.mInflater = LayoutInflater.from(context);
		this.mLayoutId=mLayoutId;
	}
	 
	 

 

	@Override
	public int getCount() {
		 
		return mDatas.size();
	}

	@Override
	public T getItem(int position) {
		// TODO Auto-generated method stub
		return mDatas.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

 
		//更改传进去的布局即可
		final ViewHolder viewHolder=getViewHolder(position, convertView, parent);
		//抽象一个方法出去 方便进行实现  控件的数据绑定
		convert(viewHolder, getItem(position),position);

		 
		return viewHolder.getConvertview();
	}
	/**
	 * 对控件进行操作
	 * */
	public  abstract void convert(ViewHolder helper,T item,int position);
 

	private  ViewHolder getViewHolder(int position,View converView,ViewGroup parent)
	{
		return ViewHolder.get(context, converView, parent,mLayoutId, position);
	}
}
