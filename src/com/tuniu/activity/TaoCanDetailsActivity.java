package com.tuniu.activity;

import java.util.ArrayList;
import java.util.List;

import com.json.details.taocan.Flight;
import com.json.details.taocan.Hotel;
import com.json.details.taocan.Row;
import com.json.details.taocan.XcDetailSanya;
import com.tuniu.utils.GetJosonUtil;
import com.tuniu.utils.MyBaseAdapter;
import com.tuniu.utils.SetTextUtils;
import com.tuniu.utils.UrlConstants;
import com.xinbo.utils.GsonUtils;
import com.xinbo.utils.UILUtils;
import com.xinbo.widget.ListView4ScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TaoCanDetailsActivity extends AppCompatActivity implements OnClickListener{
	/**------listview列表数据-------**/
	private ArrayList<Row> AllListData = new ArrayList<Row>();
	private MyDetailListAdapter mListAdapter;
	private View linear_tip1;
	private View linear_tip2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_taocan_detail);
		
		initUI();
		new MyAsy().execute();
	}

	private void initData() {
		//获取listview数据
		String tcUrl = UrlConstants.TC_DETAIL_SANYA;
		String tc_sanya = GetJosonUtil.getJson(TaoCanDetailsActivity.this, tcUrl);
		XcDetailSanya parseJSON = GsonUtils.parseJSON(tc_sanya, XcDetailSanya.class);
		AllListData.clear();
		AllListData.addAll(parseJSON.getData().getRows());
	}
	class MyAsy extends AsyncTask<Void, Void, Void>{
		@Override
		protected Void doInBackground(Void... params) {
			initData();
			return null;
		}
		@Override
		protected void onPostExecute(Void result) {
			mListAdapter.notifyDataSetChanged();
			super.onPostExecute(result);
		}
	}

	@SuppressLint("InflateParams")
	private void initUI() {
		//标题栏返回按钮
		findViewById(R.id.img_tc_back).setOnClickListener(this);
		//标题栏购物车按钮
		findViewById(R.id.img_tc_shopping).setOnClickListener(this);
		//标题栏更多按钮
		findViewById(R.id.img_tc_more).setOnClickListener(this);
		//找到headview1布局
		View headview1 = getLayoutInflater().inflate(R.layout.layout_tclb_head1, null);
		//找到headview2布局
		View headview2 = getLayoutInflater().inflate(R.layout.layout_tclb_head2, null);
		//找到headview3布局
		View headview3 = getLayoutInflater().inflate(R.layout.layout_tclb_head3, null);
		//找到listview布局
		ListView4ScrollView lv_tc_detail = (ListView4ScrollView) findViewById(R.id.lv_tc_detail);
		/**----初始化headview-----**/
		initHeadView1(headview1);
		initHeadView2(headview2);
		initHeadView3(headview3);
		/**----添加headview-----**/
		lv_tc_detail.addHeaderView(headview1, null, false);
		lv_tc_detail.addHeaderView(headview2, null, false);
		lv_tc_detail.addHeaderView(headview3, null, false);
		mListAdapter = new MyDetailListAdapter();
		lv_tc_detail.setAdapter(mListAdapter);
	}
	/** --------初始化设置headView1-------------
	 * @param headview1 **/
	private void initHeadView1(View headview1) {
		Intent intent = getIntent();
		boolean isSearch = intent.getBooleanExtra("isSearch", true);
		linear_tip1 = headview1.findViewById(R.id.linear_tclb_head1_tip1);
		linear_tip2 = headview1.findViewById(R.id.linear_tclb_head1_tip2);
		ImageView img1 = (ImageView) headview1.findViewById(R.id.img_tclb_head1_tip1);
		ImageView img2 = (ImageView) headview1.findViewById(R.id.img_tclb_head1_tip2);
		TextView tv1 = (TextView) headview1.findViewById(R.id.tv_tclb_head1_tip1);
		TextView tv2 = (TextView) headview1.findViewById(R.id.tv_tclb_head1_tip2);
		img1.setOnClickListener(this);
		img2.setOnClickListener(this);
		if (isSearch) {
			linear_tip2.setVisibility(View.GONE);
			linear_tip1.setOnClickListener(this);
		}else {
			linear_tip1.setVisibility(View.GONE);
		}
		
	}
	/** --------初始化设置headView2-------------
	 * @param headview1 **/
	private void initHeadView2(View headview2) {
		// TODO Auto-generated method stub
		
	}
	/** --------初始化设置headView3-------------
	 * @param headview1 **/
	private void initHeadView3(View headview3) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onClick(View v) {
		String text = "";
		switch (v.getId()) {
			//标题栏返回按钮
			case R.id.img_tc_back:
				finish();
				return;
			//标题栏购物车按钮
			case R.id.img_tc_shopping:
				text = "标题栏购物车";
				break;
			//标题栏更多按钮
			case R.id.img_tc_more:
				text = "标题栏更多";
				break;
			//查看更多
			case R.id.linear_tclb_head1_tip1:
				linear_tip1.setVisibility(View.GONE);
				linear_tip2.setVisibility(View.VISIBLE);
				return;
			//经典玩法1
			case R.id.img_tclb_head1_tip1:
				text = "经典玩法1";
				break;
			//经典玩法2
			case R.id.img_tclb_head1_tip2:
				text = "经典玩法2";
				break;
			default:
				break;
		}
		Toast.makeText(TaoCanDetailsActivity.this, text, Toast.LENGTH_SHORT).show();
	}
	/** --------设置listiew适配器-------------**/
	class MyDetailListAdapter extends MyBaseAdapter implements OnClickListener{
		@Override
		public int getCount() {
			return AllListData.size();
		}
		@SuppressLint("InflateParams")
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View layout = null;
			if (convertView == null) {
				layout = getLayoutInflater().inflate(R.layout.layout_tclb_list_item, null);
			}else{
				layout = convertView;
			}
			Row row = AllListData.get(position);
			TextView tv_tName = (TextView) layout.findViewById(R.id.tv_tclb_litem_tName);
			TextView tv_money = (TextView) layout.findViewById(R.id.tv_tcclb_litem_money);
			TextView tv_remai = (TextView) layout.findViewById(R.id.tv_tclb_litem_remai);
			TextView tv_haoping = (TextView) layout.findViewById(R.id.tv_tclb_litem_haoping);
			TextView tv_zongjia = (TextView) layout.findViewById(R.id.tv_tclb_litem_zongjia);
			TextView tv_hotelName = (TextView) layout.findViewById(R.id.tv_tclb_litem_hotelName);
			TextView tv_dengji = (TextView) layout.findViewById(R.id.tv_tclb_litem_dengji);
			TextView tv_homeName = (TextView) layout.findViewById(R.id.tv_tclb_litem_homeName);
			TextView tv_howHome = (TextView) layout.findViewById(R.id.tv_tclb_litem_howHome);
			TextView tv_startTime = (TextView) layout.findViewById(R.id.tv_tclb_litem_startTime);
			TextView tv_startEndTime = (TextView) layout.findViewById(R.id.tv_tclb_litem_startEndTime);
			TextView tv_backTime = (TextView) layout.findViewById(R.id.tv_tclb_litem_backTime);
			TextView tv_backEndTime = (TextView) layout.findViewById(R.id.tv_tclb_litem_backEndTime);
			TextView tv_tip1 = (TextView) layout.findViewById(R.id.tv_tclb_litem_tip1);
			TextView tv_tip2 = (TextView) layout.findViewById(R.id.tv_tclb_litem_tip2);
			TextView tv_planeName1 = (TextView) layout.findViewById(R.id.tv_tclb_litem_planeName1);
			TextView tv_planeName2= (TextView) layout.findViewById(R.id.tv_tclb_litem_planeName2);
			ImageView img_hotel = (ImageView) layout.findViewById(R.id.img_tclb_litem_hotelPic);
			layout.findViewById(R.id.linear_tclb_litem_fangxing).setOnClickListener(this);
			layout.findViewById(R.id.linear_tclb_litem_genghuan).setOnClickListener(this);
			layout.findViewById(R.id.tv_tclb_litem_shopping).setOnClickListener(this);
			layout.findViewById(R.id.tv_tclb_litem_buyNow).setOnClickListener(this);
			
			//设置套餐名
			tv_tName.setText(row.getPackageTitle());
			//设置单价
			SpannableString m = SetTextUtils.setStrForegroundColor(TaoCanDetailsActivity.this, "￥" +row.getSinglePrice());
			tv_money.setText(m);
			//设置评价
			List<String> labelList = row.getLabelList();
			if (labelList.size() == 0) {
				tv_remai.setVisibility(View.INVISIBLE);
				tv_haoping.setVisibility(View.INVISIBLE);
			}else if (labelList.size() == 1) {
				tv_remai.setText(labelList.get(0));
				tv_haoping.setVisibility(View.INVISIBLE);
			}else if (labelList.size() == 2) {
				tv_remai.setText(labelList.get(0));
				tv_haoping.setTag(labelList.get(1));
			}
			//设置总价
			tv_zongjia.setText("总价￥"+ row.getTotalPrice()+"\t已省￥"+row.getDiscountPrice());
			//设置酒店名
			Hotel hotel = row.getHotels().get(0);
			tv_hotelName.setText(hotel.getHotelName());
			//设置等级
			tv_dengji.setText(hotel.getStarDesc());
			//设置房间名
			tv_homeName.setText(hotel.getRoomInfo().getRoomName());
			//设置房间时长
			tv_howHome.setText(hotel.getRoomInfo().getRoomAmount()+"间"+hotel.getRoomInfo().getDays()+"晚");
			//设置房间图片
			UILUtils.displayImage(hotel.getHotelImg(), img_hotel);
			//设置出发时,飞机信息
			List<Flight> flights = row.getFlightTickets().get(0).getFlights();
			Flight flight1 = flights.get(0);
			tv_startTime.setText(flight1.getDepartureTime());
			tv_startEndTime.setText(flight1.getArrivalTime());
			tv_planeName1.setText(flight1.getAirlineCompany()+flight1.getFlightNo()+flight1.getCraftTypeName());
			if (flight1.getDays() > 0) {
				tv_tip1.setVisibility(View.VISIBLE);
				tv_tip1.setText("+" + flight1.getDays());
			}else{
				tv_tip1.setVisibility(View.INVISIBLE);
			}
			//设置返回时,飞机信息
			Flight flight2 = flights.get(1);
			tv_backTime.setText(flight2.getDepartureTime());
			tv_backEndTime.setText(flight2.getArrivalTime());
			tv_planeName2.setText(flight2.getAirlineCompany()+flight2.getFlightNo()+flight2.getCraftTypeName());
			if (flight2.getDays() > 0) {
				tv_tip2.setVisibility(View.VISIBLE);
				tv_tip2.setText("+" + flight2.getDays());
			}else{
				tv_tip2.setVisibility(View.INVISIBLE);
			}
			
			return layout;
		}
		
		@Override
		public void onClick(View v) {
			String text = "";
			switch (v.getId()) {
				//房型
				case R.id.linear_tclb_litem_fangxing:
					text = "房型";
					break;
				//更换
				case R.id.linear_tclb_litem_genghuan:
					text = "更换";
					break;
				//加入购物车
				case R.id.tv_tclb_litem_shopping:
					text = "加入购物车";
					break;
				//立即预定
				case R.id.tv_tclb_litem_buyNow:
					text = "立即预定";
					break;
				default:
					break;
			}
			Toast.makeText(TaoCanDetailsActivity.this, text, Toast.LENGTH_SHORT).show();
		}
		
	}
}
