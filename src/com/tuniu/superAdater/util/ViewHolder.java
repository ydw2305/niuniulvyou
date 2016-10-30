package com.tuniu.superAdater.util;


import com.xinbo.utils.UILUtils;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author gjy
 * 
 *  通用的ViewHolder
 * 
 * **/
public class ViewHolder {

    //存放绑定的控件的容器
    private final SparseArray<View> mViews;
    //item视图
    private    View mConvertView;

    private  ViewHolder(Context context,ViewGroup parent,int layoutId,int position) 
    {
	this.mViews=new SparseArray<View>();
	//初始化视图
	mConvertView=LayoutInflater.from(context).inflate(layoutId, parent,false);
	//绑定Tag
	mConvertView.setTag(this);
    }


    /**
     *  获取Viewholder的对象  为类的入口
     *  @param Context 上下文
     *  @param convertview item视图
     *  @param layoutId item布局的id
     *  @param position 当前item的position
     *  
     * */
    public static ViewHolder get(Context context,View convertview,ViewGroup parent,int layoutId,int position)
    {

	if (convertview==null) {

	    return new ViewHolder(context, parent, layoutId, position);
	}


	return  (ViewHolder) convertview.getTag();

    }
    /**
     *  通过控件的id获取对于控件，如果没有加入view
     * */
    @SuppressWarnings("unchecked")
    public <T extends View>T getView(int viewId)
    {
	View view=mViews.get(viewId);
	if (view == null) {

	    view=mConvertView.findViewById(viewId);
	    mViews.put(viewId, view);

	}

	return (T)view;
    }
    /***
     * 为TextView 设置字符串
     * **/
    public ViewHolder setText(int viewId,String text)
    {
	TextView view=getView(viewId);
	view.setText(text);
	return this;
    }
    /***
     * 为TextView 设置字体颜色
     * **/
    public ViewHolder setTextColor(int viewId,int colorId)
    {
	TextView view=getView(viewId);
	view.setTextColor(colorId);
	return this;
    }
    /***
     * 为TextView 设置背景
     * **/
    public ViewHolder setBackgroundResource(int viewId,int drawableId)
    {
    	TextView view=getView(viewId);
    	view.setBackgroundResource(drawableId);
    	return this;
    }
    /***
     * 为ImageView 设置图片资源
     * **/
    public ViewHolder setImageResource(int viewId,int drawableId)
    {
	ImageView img=getView(viewId);
	img.setImageResource(drawableId);
	return this;
    }
    /***
     * 为ImageView 通过URL访问图片
     * **/
    public ViewHolder setImageResource(int viewId,String url)
    {
	ImageView img=getView(viewId);
	UILUtils.displayImageNoAnim(url, img);
	return this;
    }
    /***
     *  隐藏或ImageView 
     * **/
    public ViewHolder setImageisShow(int viewId,int type)
    {

	ImageView img=getView(viewId);
	if (type==View.INVISIBLE)
	{
	    img.setVisibility(type);
	}else if (type==View.VISIBLE)
	{
	    img.setVisibility(View.VISIBLE);
	}else {
	    img.setVisibility(View.GONE);
	}
	return this;
    }
    /***
     * 为Button 设置text
     * **/
    public ViewHolder setButtonText(int viewId,String txt)
    {
	Button btn=getView(viewId);
	btn.setText(txt);
	return this;
    }
    public  ViewHolder setButtonOncli(int viewId,OnClickListener listener)
    {

	Button button = getView(viewId);
	button.setOnClickListener(listener);
	return  this;
    }

    public  ViewHolder setImgeViewOncli(int viewId,OnClickListener listener)
    {

	ImageView img = getView(viewId);
	img.setOnClickListener(listener);
	return  this;
    }
    public  ImageView getImageView(int viewId)
    {

	ImageView img = getView(viewId);
	return  img;
    }

    public View getConvertview()
    {
	return mConvertView;
    }
}
