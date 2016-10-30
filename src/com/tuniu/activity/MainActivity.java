package com.tuniu.activity;

import com.tuniu.fragment.DestinationFragment;
import com.tuniu.fragment.FoundFragment;
import com.tuniu.fragment.HomeFragment;
import com.tuniu.fragment.MineFragment;
import com.tuniu.fragment.SchedulingFragment;
import com.tuniu.utils.Constants;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
	private FragmentTabHost mTabHost;
	
//	private int[] imgs = new int[]{R.drawable.tab_home, R.drawable.tab_destination, R.drawable.tab_found, R.drawable.tab_scheduling, R.drawable.tab_mine};
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
	        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
	        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

	        mTabHost.addTab(mTabHost.newTabSpec("首页").setIndicator(getIndicator(0)),
	                HomeFragment.class, null);
	        mTabHost.addTab(mTabHost.newTabSpec("目的地").setIndicator(getIndicator(1)),
	                DestinationFragment.class, null);
	        mTabHost.addTab(mTabHost.newTabSpec("发现").setIndicator(getIndicator(2)),
	                FoundFragment.class, null);
	        mTabHost.addTab(mTabHost.newTabSpec("行程玩法").setIndicator(getIndicator(3)),
	        		SchedulingFragment.class, null);
	        mTabHost.addTab(mTabHost.newTabSpec("我的").setIndicator(getIndicator(4)),
	                MineFragment.class, null);

	}
	
	@SuppressLint("InflateParams")
	private View getIndicator(int index)
	{
		View view = getLayoutInflater().inflate(R.layout.layout_main_tab, null);
		ImageView mImageView = (ImageView) view.findViewById(R.id.img_main_tab);
		TextView mTextView = (TextView) view.findViewById(R.id.tv_main_tab);
		mImageView.setImageResource(Constants.TABSIMG[index]);
		mTextView.setText(Constants.TABSNAME[index]);
		return view;
	}

}
