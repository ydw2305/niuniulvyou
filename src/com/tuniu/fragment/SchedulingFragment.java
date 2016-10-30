package com.tuniu.fragment;

import java.util.ArrayList;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView.OnFloatScrollListener;
import com.json.scheduling.List;
import com.json.scheduling.SchedulingListCommon;
import com.tuniu.activity.R;
import com.tuniu.activity.ScheduMoreActivity;
import com.tuniu.activity.TaoCanDetailsActivity;
import com.tuniu.utils.Constants;
import com.tuniu.utils.GetJosonUtil;
import com.tuniu.utils.GetTimeUtils;
import com.tuniu.utils.MyBaseAdapter;
import com.tuniu.utils.UrlConstants;
import com.xinbo.utils.GsonUtils;
import com.xinbo.utils.UILUtils;
import com.xinbo.widget.GridView4ScrollView;
import com.xinbo.widget.ListView4ScrollView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class SchedulingFragment extends Fragment implements OnCheckedChangeListener, OnClickListener{
	private View view;
	private LayoutInflater inflater;
	/**----------保存listview的数据----------**/
	private ArrayList<List> dataList = new ArrayList<List>();
	private final int bg_oringe = R.drawable.seleceted_bg_oringe;
	private final int bg_none = R.drawable.seleceted_bg_none;
	private ListView4ScrollView lv_list;
	private MyViewAdapter myViewAdapter;
	private boolean isLogin = false;
	private TextView tv_endtime;
	private TextView tv_endDay;
	private int backDayTime = 3;
	private PullToRefreshScrollView ptrsv_list;
	private RadioButton rb_hainan;
	private RadioButton rb_xiamen;
	private RadioButton rb_yunnan;
	private RadioButton rb_riben;
	private RadioButton rb_xianggang;
	private RadioButton rb_hanguo;
	private RadioButton rb_hainan_float;
	private RadioButton rb_xiamen_float;
	private RadioButton rb_yunnan_float;
	private RadioButton rb_riben_float;
	private RadioButton rb_xianggang_float;
	private RadioButton rb_hanguo_float;

	public SchedulingFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		this.inflater = inflater;
		if (view == null) {
			view = inflater.inflate(R.layout.fragment_scheduling, container, false);
			initData();
			initUI();
		}
		return view;
	}

	private void initData() {
		//初始化下载海南的list数据
		String hainanUrl = UrlConstants.XC_HAINAN;
		getListData(hainanUrl);
		
		//TODO 判断是否是登录状态
		isLogin = false;
		
	}
	/**------获取list的数据------**/
	private void getListData(String url) {
		String xcJson = GetJosonUtil.getJson(getContext(), url);
		SchedulingListCommon parseJSON = GsonUtils.parseJSON(xcJson, SchedulingListCommon.class);
		dataList.clear();
		dataList.addAll(parseJSON.getData().getList());
		
		Log.e("DataList", "getTitle" + dataList.get(0).getTitle());

	}
	
	@SuppressLint("InflateParams")
	private void initUI() {
		ptrsv_list = (PullToRefreshScrollView) view.findViewById(R.id.ptrsv_scheduling);
		//找到头部布局
		View headview0 = view.findViewById(R.id.linear_scheduling_head_wodexc);
		//默认为透明
		headview0.setAlpha(0);
		//找到悬浮的horizontalScrollView
		View sv_float = view.findViewById(R.id.horizontalScrollView_float);
		//找到右下角"更多"图标按钮
		view.findViewById(R.id.img_scheduling_openMore).setOnClickListener(this);
		//找到各个headview布局
		View headview1 = view.findViewById(R.id.layout1);
		View headview2 = view.findViewById(R.id.layout2);
		View headview3 = view.findViewById(R.id.layout3);
		View headview4 = view.findViewById(R.id.layout4);
		View headview5 = inflater.inflate(R.layout.layout_scheduling_head4, null, false);
		//找到listview控件
		lv_list = (ListView4ScrollView) view.findViewById(R.id.lv_scheduling_list);
		//初始化headview
		initHeadView1(headview1);
		initHeadView2(headview2);
		initHeadView3(headview3);
		initHeadView4(headview4);
		initHeadView5(headview5);
		//添加headview
		lv_list.addHeaderView(headview5);
		//设置listview适配器
		initListView();
		//设置listview的滑动事件
		setListviewMove(headview0, sv_float);
	}
	/**----------设置listview的适配器-----------**/
	private void initListView() {
		int count = dataList.size();
		myViewAdapter = new MyViewAdapter(count, false);
		lv_list.setAdapter(myViewAdapter);
		myViewAdapter.notifyDataSetChanged();
		
		// 设置下拉刷新
		ptrsv_list.setOnRefreshListener(new OnRefreshListener<ScrollView>() {

			@Override
			public void onRefresh(PullToRefreshBase<ScrollView> refreshView) {
				new GetDataTask().execute();
			}
		});
		
	}
	/**----------设置listview的滑动显示隐藏头部控件-----------
	 * @param headview0 
	 * @param sv_float  **/
	private void setListviewMove(final View headview0, final View sv_float) {
		final float height_img = 150f;
		final float height_sv = 2546f;
		ptrsv_list.setOnFloatScrollListener(new OnFloatScrollListener() {
			@Override
			public void onFloatScroll(int scrollY) {
				// TODO 显示隐藏悬浮栏
				Log.e("height", "y:" + scrollY);
				if (scrollY >= height_img) {
					headview0.setAlpha(1);
				}else{
					headview0.setAlpha(scrollY/height_img);
				}
				if (scrollY >= height_sv) {
					sv_float.setVisibility(View.VISIBLE);
				}else{
					sv_float.setVisibility(View.GONE);
				}
			}
		});
	}

	/**----------顶部开头-----------
	 * @param headview1 **/
	private void initHeadView1(View headview1) {
		//是否登录的显示文本
		TextView tv_iflogin = (TextView) headview1.findViewById(R.id.tv_scheduling_iflogin);
		//登录按钮
		TextView tv_login = (TextView) headview1.findViewById(R.id.tv_scheduling_login);
		//出发地
		TextView tv_start = (TextView) headview1.findViewById(R.id.tv_scheduling_start);
		//出发时间
		TextView tv_starttime = (TextView) headview1.findViewById(R.id.tv_scheduling_starttime);
		//目的地
		TextView tv_end = (TextView) headview1.findViewById(R.id.tv_scheduling_end);
		//减按钮
		TextView tv_sub = (TextView) headview1.findViewById(R.id.tv_scheduling_sub);
		//加按钮
		TextView tv_add = (TextView) headview1.findViewById(R.id.tv_scheduling_add);
		//几天后返回
		tv_endtime = (TextView) headview1.findViewById(R.id.tv_scheduling_endtime);
		//返回时间
		tv_endDay = (TextView) headview1.findViewById(R.id.tv_scheduling_endDay);
		//搜索自由行套餐
		TextView tv_search = (TextView) headview1.findViewById(R.id.tv_scheduling_search);
		
		if (isLogin) {
			tv_iflogin.setText("xxxxx行程");
			tv_login.setVisibility(View.GONE);
		}else{
			tv_iflogin.setText("如果您有行程,请先登录");
			tv_login.setVisibility(View.VISIBLE);
		}
		//获取当前时间
		String timeNow = GetTimeUtils.getXCTime(0);
		String timeBack = GetTimeUtils.getXCTime(backDayTime);
		//初始化默认出行时间
		tv_starttime.setText(timeNow);
		tv_endDay.setText(timeBack + "\t返回");
		
		tv_login.setOnClickListener(this);
		tv_start.setOnClickListener(this);
		tv_starttime.setOnClickListener(this);
		tv_end.setOnClickListener(this);
		tv_sub.setOnClickListener(this);
		tv_add.setOnClickListener(this);
		tv_search.setOnClickListener(this);
		
	}
	/**----------点击事件-----------
	 * @param v **/
	@Override
	public void onClick(View v) {
		String text = null;
		switch (v.getId()) {
			//"更多"图标按钮
			case R.id.img_scheduling_openMore:
//				text = "更多";
				Intent intent = new Intent(getActivity(), ScheduMoreActivity.class);
				startActivity(intent);
				return;
			//登录按钮
			case R.id.tv_scheduling_login:
				text = "现在登录";
				break;
			//出发地
			case R.id.tv_scheduling_start:
				text = "出发地";
				break;
			//出发时间
			case R.id.tv_scheduling_starttime:
				text = "出发时间";
				break;
			//目的地
			case R.id.tv_scheduling_end:
				text = "目的地";
				break;
			//减按钮
			case R.id.tv_scheduling_sub:
//				text = "减按钮";
				if (backDayTime > 0) {
					backDayTime--;
					String timeBack = GetTimeUtils.getXCTime(backDayTime);
					tv_endtime.setText("" + backDayTime);
					tv_endDay.setText(timeBack + "\t返回");
				}
				return;
			//加按钮
			case R.id.tv_scheduling_add:
//				text = "加按钮";
				
				if (backDayTime < 366) {
					backDayTime++;
					String timeBack = GetTimeUtils.getXCTime(backDayTime);
					tv_endtime.setText("" + backDayTime);
					tv_endDay.setText(timeBack + "\t返回");
				}
				return;
			//搜索自由行套餐
			case R.id.tv_scheduling_search:
//				text = "搜索自由行套餐";
				Intent intent2 = new Intent(getActivity(), TaoCanDetailsActivity.class);
				startActivity(intent2);
				return;
			//新发现 新玩法
			case R.id.linear_scheduling_xinfaxian:
				text = "新发现新玩法";
				break;
			default:
				break;
		}
		Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
	}
	/**----------国内热门-----------
	 * @param headview2 **/
	private void initHeadView2(View headview2) {
		String title = Constants.guoNeiReMen.TITLE;//标题名
		String[] name = Constants.guoNeiReMen.NAME;//地名
		int[] num = Constants.guoNeiReMen.NUM;//玩法次数
		String[] imgs = Constants.guoNeiReMen.getImgUrl();//图片
		
		setGridHeadView(headview2, title, name, num, imgs);
	}
	
	/**----------境外热门-----------
	 * @param headview3 **/
	private void initHeadView3(View headview3) {
		String title = Constants.chuJingReMen.TITLE;//标题名
		String[] name = Constants.chuJingReMen.NAME;//地名
		int[] num = Constants.chuJingReMen.NUM;//玩法次数
		String[] imgs = Constants.chuJingReMen.getImgUrl();//图片
		
		setGridHeadView(headview3, title, name, num, imgs);
		
	}
	/**----------设置gridview-----------
	 * @param headview
	 * @param title
	 * @param name
	 * @param num **/
	private void setGridHeadView(final View headview, final String title, final String[] name, final int[] num, final String[] imgs) {
		int count = name.length;//总个数
		TextView tvTitle = (TextView) headview.findViewById(R.id.tv_scheduling_headtitle_remen);
		tvTitle.setText(title);//设置标题
		GridView4ScrollView mGridView = (GridView4ScrollView) headview.findViewById(R.id.gridView_scheduling_remen);
		MyViewAdapter gridAdapter = new MyViewAdapter(count ,true);
		//设置数据
		gridAdapter.setGridData(name, num, imgs);
		mGridView.setAdapter(gridAdapter);
		gridAdapter.notifyDataSetChanged();
		//设置点击事件
		mGridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(getContext(), name[position], Toast.LENGTH_SHORT).show();
			}
		});
	}

	/**----------新发现-----------
	 * @param headview4 **/
	private void initHeadView4(View headview4) {
		headview4.findViewById(R.id.linear_scheduling_xinfaxian).setOnClickListener(this);
	}
	/**----------横向滑动栏-----------
	 * @param headview5 **/
	private void initHeadView5(View headview5) {
		/**-------内部栏------**/
		RadioGroup rg = (RadioGroup) headview5.findViewById(R.id.radioGroup1);
		rg.setOnCheckedChangeListener(this);
		//设置海南按钮
		rb_hainan = (RadioButton) headview5.findViewById(R.id.radio0);
		//设置厦门按钮
		rb_xiamen = (RadioButton) headview5.findViewById(R.id.radio1);
		//设置云南按钮
		rb_yunnan = (RadioButton) headview5.findViewById(R.id.radio2);
		//设置日本按钮
		rb_riben = (RadioButton) headview5.findViewById(R.id.radio3);
		//设置香港按钮
		rb_xianggang = (RadioButton) headview5.findViewById(R.id.radio4);
		//设置韩国按钮
		rb_hanguo = (RadioButton) headview5.findViewById(R.id.radio5);
		
		/**-------悬浮栏------**/
		RadioGroup rg2 = (RadioGroup) view.findViewById(R.id.radioGroup2);
		rg2.setOnCheckedChangeListener(this);
		//设置海南按钮
		rb_hainan_float = (RadioButton) view.findViewById(R.id.radio0_float);
		//设置厦门按钮
		rb_xiamen_float = (RadioButton) view.findViewById(R.id.radio1_float);
		//设置云南按钮
		rb_yunnan_float = (RadioButton) view.findViewById(R.id.radio2_float);
		//设置日本按钮
		rb_riben_float = (RadioButton) view.findViewById(R.id.radio3_float);
		//设置香港按钮
		rb_xianggang_float = (RadioButton) view.findViewById(R.id.radio4_float);
		//设置韩国按钮
		rb_hanguo_float = (RadioButton) view.findViewById(R.id.radio5_float);
		
		/**-------设置初始背景------**/
		setRadioBackgroud(bg_oringe, bg_none, bg_none, bg_none, bg_none, bg_none);
	}
	/**--------横向滑动栏文本焦点改变监听事件--------**/
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		String url = null;
		switch (checkedId) {
			case R.id.radio0:case R.id.radio0_float:
				url = UrlConstants.XC_HAINAN;
				setRadioBackgroud(bg_oringe, bg_none, bg_none, bg_none, bg_none, bg_none);
				break;
			case R.id.radio1:case R.id.radio1_float:
				url = UrlConstants.XC_XIAMEN;
				setRadioBackgroud(bg_none, bg_oringe, bg_none, bg_none, bg_none, bg_none);
				break;
			case R.id.radio2:case R.id.radio2_float:
				url = UrlConstants.XC_YUNNAN;
				setRadioBackgroud(bg_none, bg_none, bg_oringe, bg_none, bg_none, bg_none);
				break;
			case R.id.radio3:case R.id.radio3_float:
				url = UrlConstants.XC_RIBEN;
				setRadioBackgroud(bg_none, bg_none, bg_none, bg_oringe, bg_none, bg_none);
				break;
			case R.id.radio4:case R.id.radio4_float:
				url = UrlConstants.XC_XIANGGAN;
				setRadioBackgroud(bg_none, bg_none, bg_none, bg_none, bg_oringe, bg_none);
				break;
			case R.id.radio5:case R.id.radio5_float:
				url = UrlConstants.XC_HANGUO;
				setRadioBackgroud(bg_none, bg_none, bg_none, bg_none, bg_none, bg_oringe);
				break;
			default:
				break;
		}
		if (url != null) {
			/**---------获取数据--------**/
			getListData(url);
			myViewAdapter.notifyDataSetChanged();
		}
	}
	/**----------设置radioButton的背景---------**/
	private void setRadioBackgroud(int bgR0,int bgR1,int bgR2,int bgR3,int bgR4,int bgR5) {
//		TODO
		/**--------设置内部横向滚动栏---------**/
		rb_hainan.setBackgroundResource(bgR0);
		rb_xiamen.setBackgroundResource(bgR1);
		rb_yunnan.setBackgroundResource(bgR2);
		rb_riben.setBackgroundResource(bgR3);
		rb_xianggang.setBackgroundResource(bgR4);
		rb_hanguo.setBackgroundResource(bgR5);
		
		/**--------设置悬浮横向滚动栏---------**/
		rb_hainan_float.setBackgroundResource(bgR0);
		rb_xiamen_float.setBackgroundResource(bgR1);
		rb_yunnan_float.setBackgroundResource(bgR2);
		rb_riben_float.setBackgroundResource(bgR3);
		rb_xianggang_float.setBackgroundResource(bgR4);
		rb_hanguo_float.setBackgroundResource(bgR5);
	}
	
	/**----------listview和GridView的适配器---------**/
	class MyViewAdapter extends MyBaseAdapter{
		private boolean isGrid;
		private int count;
		private String[] tName;
		private int[] tNum;
		private String[] imgs;
		
		public MyViewAdapter(int count, boolean isGrid) {
			this.count = count;
			this.isGrid = isGrid;
		}
		//设置grid数据
		public void setGridData(String[] tName, int[] tNum, String[] imgs){
			this.tName = tName;
			this.tNum = tNum;
			this.imgs = imgs;
		}
		
		@Override
		public int getCount() {
			return count;
		}

		@SuppressLint("InflateParams")
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View layout = null;
			if (convertView == null) {
				if (isGrid) {
					layout = inflater.inflate(R.layout.layout_scheduling_grid_item, null);
				}else {
					layout = inflater.inflate(R.layout.layout_scheduling_list_item, null);
				}
			}else{
				layout = convertView;
			}
			if (isGrid) {
				TextView tvName = (TextView) layout.findViewById(R.id.tv_scheduling_remen_tname);
				TextView tvNum = (TextView) layout.findViewById(R.id.tv_scheduling_remen_tnum);
				ImageView img_grid = (ImageView) layout.findViewById(R.id.img_scheduling_remen);
				tvName.setText(tName[position]);
				tvNum.setText(tNum[position] + "种玩法");
				UILUtils.displayImage(imgs[position%imgs.length], img_grid);
			}else{
				ImageView img_list = (ImageView) layout.findViewById(R.id.img_scheduling_list_item);
				TextView tvTitle = (TextView) layout.findViewById(R.id.tv_scheduling_list_title);
				TextView tvFeature = (TextView) layout.findViewById(R.id.tv_scheduling_list_feature);
				List list = dataList.get(position);
				tvTitle.setText(list.getTitle());
				tvFeature.setText(list.getFeature());
				tvFeature.setTextColor(Color.WHITE);
				UILUtils.displayImage(list.getImage(), img_list);
			}
			
			return layout;
		}
	}
	/**
	 * *************************************************************************
	 * 设置下拉刷新异步任务
	 * *************************************************************************
	 */
	private class GetDataTask extends AsyncTask<Void, Void, String[]> {
		@Override
		protected String[] doInBackground(Void... params) {
			// Simulates a background job.
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {}
			return null;
		}
		@Override
		protected void onPostExecute(String[] result) {
			// Call onRefreshComplete when the list has been refreshed.
			ptrsv_list.onRefreshComplete();
			super.onPostExecute(result);
		}
	}
	
}
