package com.tuniu.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class ScheduMoreActivity extends AppCompatActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schedu_more);
		initUI();
	}

	private void initUI() {
		//设置字体
		Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/hanyixikai.ttf");
		TextView tv_title1 = (TextView) findViewById(R.id.tv_schedu_more_title1);
		TextView tv_title2 = (TextView) findViewById(R.id.tv_schedu_more_title2);
		tv_title1.setTypeface(typeface);
		tv_title2.setTypeface(typeface);
		
		findViewById(R.id.linear_schedu_more_jingdianwf).setOnClickListener(this);
		findViewById(R.id.linear_schedu_more_shengxintc).setOnClickListener(this);
		findViewById(R.id.linear_schedu_more_jipiao).setOnClickListener(this);
		findViewById(R.id.linear_schedu_more_jiudian).setOnClickListener(this);
		findViewById(R.id.linear_schedu_more_huochep).setOnClickListener(this);
		findViewById(R.id.linear_schedu_more_dangdiwl).setOnClickListener(this);
		findViewById(R.id.linear_schedu_more_menpiao).setOnClickListener(this);
		findViewById(R.id.img_schedu_more_close).setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		String text = null;
		switch (v.getId()) {
			//经典玩法
			case R.id.linear_schedu_more_jingdianwf:
				text = "经典玩法";
				break;
			//省心套餐
			case R.id.linear_schedu_more_shengxintc:
				text = "省心套餐";
				break;
			//机票
			case R.id.linear_schedu_more_jipiao:
				text = "机票";
				break;
			//酒店
			case R.id.linear_schedu_more_jiudian:
				text = "酒店";
				break;
			//火车票
			case R.id.linear_schedu_more_huochep:
				text = "火车票";
				break;
			//当地玩乐
			case R.id.linear_schedu_more_dangdiwl:
				text = "当地玩乐";
				break;
			//门票
			case R.id.linear_schedu_more_menpiao:
				text = "门票";
				break;
			//关闭按钮
			case R.id.img_schedu_more_close:
				finish();
				return;
			default:
				break;
		}
		Toast.makeText(ScheduMoreActivity.this, text, Toast.LENGTH_SHORT).show();
	}
	
}
