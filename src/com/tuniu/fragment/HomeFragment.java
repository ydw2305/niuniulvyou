package com.tuniu.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.json.home.header.Advertise;
import com.json.home.header.Content;
import com.json.home.header.Content_;
import com.json.home.header.Data;
import com.json.home.header.FindBeautyRight;
import com.json.home.header.HomeHeader;
import com.json.home.header.Module;
import com.json.home.header.RecommendForYou;
import com.json.home.header.RegistrationLeft;
import com.json.home.header.Service;
import com.json.home.header.Service_;
import com.json.home.more.HomeMore;
import com.json.home.more.Product;
import com.tuniu.activity.CityActivity;
import com.tuniu.activity.HomeListDetailActivity;
import com.tuniu.activity.R;
import com.tuniu.fragment.home_childs.ViewPagerFragment;
import com.tuniu.superAdater.util.SuperAdapter;
import com.tuniu.superAdater.util.ViewHolder;
import com.tuniu.utils.Constants;
import com.tuniu.utils.CustomIndictor;
import com.tuniu.utils.GetJosonUtil;
import com.tuniu.utils.PreferenceUtil;
import com.tuniu.utils.UrlConstants;
import com.xinbo.utils.GsonUtils;
import com.xinbo.utils.UILUtils;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * A simple {@link Fragment} subclass.
 *
 */
@SuppressLint("InflateParams")
public class HomeFragment extends Fragment
		implements OnCheckedChangeListener, OnItemClickListener, OnScrollListener, OnClickListener {
	private View view;
	private LayoutInflater inflater;
	private ListViewAdapter lAdapter;
	private PagerAdapter pAdapter;
	private GridViewAdapter gAdapter;
	private GridViewAdapter gAdapter_head;
	private smallCategorygridAdapter scgadapter;
	private hotRecommendgridAdapter hrdapter;
	private findBeautygridAdapter fbgadapter;
	private int BigNum = 10000;
	private int Gposition;// gridView选中行
	private int radioButton;// radioButton选中项
	private boolean isDrag;// 是否手动滑动ViewPager
	private HashMap<Integer, Integer> map;// 用于保存更多精彩选中项

	// banner画廊
	private ViewPager pager;
	private CustomIndictor c;
	private ArrayList<Advertise> avList = new ArrayList<Advertise>();
	// 小品类
	GridView grid_smallCategory;
	ArrayList<Content> cList = new ArrayList<Content>();
	// 签到
	private int child;
	private String rtimgUrl;
	private String rturl;
	private ImageView iv_signin_snatch;
	private ViewFlipper vf_qiandao;
	private ArrayList<RegistrationLeft> rtList = new ArrayList<RegistrationLeft>();
	// 手机专享
	private LinearLayout line_specials;
	private TextView tv_specials;
	private ImageView iv_temai0;
	private ImageView iv_temai1;
	private ImageView iv_temai2;
	private TextView tv_temai1_title;
	private TextView tv_temai1_price;
	private ListView mListView;
	private ArrayList<Content_> sList = new ArrayList<Content_>();
	// 热门推荐
	private String hrTitle;
	private TextView tv_hotRecommend;
	private GridView grid_hotRecommend;
	private ArrayList<Service> hrList = new ArrayList<Service>();
	// 发现精彩
	private String fbTitle;
	private TextView tv_findbeauty;
	private GridView grid_findBeauty;
	private ViewFlipper vf_findbeauty;
	private ImageView iv_signIn;
	private String fbimgUrl;
	private String fburl;
	private int child1;
	private ArrayList<Service_> fbList = new ArrayList<Service_>();
	private ArrayList<FindBeautyRight> fbrList = new ArrayList<FindBeautyRight>();
	// 当地门市
	private String oiTitle;
	private TextView tv_offline;
	// 更多精彩
	private GridView grid_recommendForYou;
	private RadioGroup mradioGroup1;
	private RadioButton radio_recommendforyou0;
	private RadioButton radio_recommendforyou1;
	private RadioButton radio_recommendforyou2;
	private RadioButton radio_recommendforyou3;
	private ArrayList<RecommendForYou> rfList = new ArrayList<RecommendForYou>();
	private List<Module> mList = new ArrayList<Module>();
	// 更多精彩商品
	private List<Product> pList = new ArrayList<Product>();
	// 悬浮
	private GridView grid_head_recommendForYou;
	private RadioGroup mradioGroup;
	private RadioButton radio_head_recommendforyou0;
	private RadioButton radio_head_recommendforyou1;
	private RadioButton radio_head_recommendforyou2;
	private RadioButton radio_head_recommendforyou3;
	private RelativeLayout rela_head_radioGroup;
	private float y;
	// 顶部
	private TextView tv_city;
	// 回到顶部
	private ImageView iv_backtop;

	public HomeFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		if (view == null) {
			this.inflater = inflater;
			view = inflater.inflate(R.layout.fragment_home, container, false);
			initUI();
			initData();
		}
		return view;
	}

	@SuppressLint("InflateParams")
	private void initUI() {
		// TODO
		tv_city = (TextView) view.findViewById(R.id.tv_house_city);
		iv_backtop = (ImageView) view.findViewById(R.id.iv_house_backtop);
		iv_backtop.setOnClickListener(this);
		// 初始化城市
		String city = PreferenceUtil.readCity(getContext(), Constants.SELECTCITY);
		tv_city.setText(city);
		tv_city.setOnClickListener(this);
		rela_head_radioGroup = (RelativeLayout) view.findViewById(R.id.rela_house_head_radioGroup);
		mradioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
		radio_head_recommendforyou0 = (RadioButton) view.findViewById(R.id.radio_house_head_recommendforyou0);
		radio_head_recommendforyou1 = (RadioButton) view.findViewById(R.id.radio_house_head_recommendforyou1);
		radio_head_recommendforyou2 = (RadioButton) view.findViewById(R.id.radio_house_head_recommendforyou2);
		radio_head_recommendforyou3 = (RadioButton) view.findViewById(R.id.radio_house_head_recommendforyou3);
		grid_head_recommendForYou = (GridView) view.findViewById(R.id.grid_house_head_recommendForYou);
		PullToRefreshListView pListView = (PullToRefreshListView) view.findViewById(R.id.pullrefresh_list_house);
		// 转换ListView
		mListView = pListView.getRefreshableView();

		View inflate1 = inflater.inflate(R.layout.layout_house_header1, null);
		// 设置不可整行选中，可监听每个控件
		mListView.addHeaderView(inflate1, null, false);
		// banner画廊
		c = (CustomIndictor) inflate1.findViewById(R.id.customIndictor);
		pager = (ViewPager) inflate1.findViewById(R.id.pager_house_list_head);
		// 小品类
		grid_smallCategory = (GridView) inflate1.findViewById(R.id.grid_house_smallCategory);
		// 签到
		vf_qiandao = (ViewFlipper) inflate1.findViewById(R.id.vf_house_signin_snatch);
		iv_signin_snatch = (ImageView) inflate1.findViewById(R.id.iv_signin_snatch);
		// 手机专享
		line_specials = (LinearLayout) inflate1.findViewById(R.id.line_house_specials);
		tv_specials = (TextView) inflate1.findViewById(R.id.tv_house_specials);
		iv_temai0 = (ImageView) inflate1.findViewById(R.id.iv_house_temai0);
		iv_temai1 = (ImageView) inflate1.findViewById(R.id.iv_house_temai1);
		iv_temai2 = (ImageView) inflate1.findViewById(R.id.iv_house_temai2);
		tv_temai1_title = (TextView) inflate1.findViewById(R.id.tv_house_temai1_title);
		tv_temai1_price = (TextView) inflate1.findViewById(R.id.tv_house_temai1_price);

		View inflate2 = inflater.inflate(R.layout.layout_house_header2, null);
		mListView.addHeaderView(inflate2, null, false);
		// 热门推荐
		tv_hotRecommend = (TextView) inflate2.findViewById(R.id.tv_house_hotRecommend);
		grid_hotRecommend = (GridView) inflate2.findViewById(R.id.grid_house_hotRecommend);
		// 发现精彩
		tv_findbeauty = (TextView) inflate2.findViewById(R.id.tv_house_findbeauty);
		grid_findBeauty = (GridView) inflate2.findViewById(R.id.grid_house_findBeauty);
		vf_findbeauty = (ViewFlipper) inflate2.findViewById(R.id.vf_house_findbeauty);
		iv_signIn = (ImageView) inflate2.findViewById(R.id.iv_house_signIn);
		// 当地门市
		tv_offline = (TextView) inflate2.findViewById(R.id.tv_house_offline_title);

		View inflate3 = inflater.inflate(R.layout.layout_house_header3, null);
		mListView.addHeaderView(inflate3, null, false);
		mradioGroup1 = (RadioGroup) inflate3.findViewById(R.id.radioGroup1);
		radio_recommendforyou0 = (RadioButton) inflate3.findViewById(R.id.radio_house_recommendforyou0);
		radio_recommendforyou1 = (RadioButton) inflate3.findViewById(R.id.radio_house_recommendforyou1);
		radio_recommendforyou2 = (RadioButton) inflate3.findViewById(R.id.radio_house_recommendforyou2);
		radio_recommendforyou3 = (RadioButton) inflate3.findViewById(R.id.radio_house_recommendforyou3);
		grid_recommendForYou = (GridView) inflate3.findViewById(R.id.grid_house_recommendForYou);
	}

	private void initData() {
		/** ----------下载首页头部的数据---------- **/
		String homeheaderUrl = UrlConstants.HOMEHEADER;
		String homeheaderJson = GetJosonUtil.getJson(getContext(), homeheaderUrl);
		HomeHeader homeHeader = GsonUtils.parseJSON(homeheaderJson, HomeHeader.class);
		Data data = homeHeader.getData();
		// banner画廊
		avList.clear();
		avList.addAll(data.getAdvertises());
		c.setNum(avList.size());
		// 小品类
		cList.clear();
		cList.addAll(data.getSmallCategory().getContent());
		// 签到
		rtList.clear();
		rtList.addAll(data.getRegistration().getRegistrationLeft());
		rtimgUrl = data.getRegistration().getRegistrationRight().getImgUrl();
		rturl = data.getRegistration().getRegistrationRight().getUrl();
		// 手机专享
		sList.clear();
		sList.addAll(data.getSpecials().getContent());
		// 热门推荐
		hrList.clear();
		hrList.addAll(data.getHotRecommend().getServices());
		// 热门推荐标题
		hrTitle = data.getHotRecommend().getTitle();
		// 发现精彩
		fbList.clear();
		fbList.addAll(data.getFindBeauty().getServices());
		fbrList.clear();
		fbrList.addAll(data.getFindBeautyRight());
		fbimgUrl = data.getSignIn().getImgUrl();
		fburl = data.getSignIn().getUrl();
		// 发现精彩标题
		fbTitle = data.getFindBeauty().getTitle();
		// 当地门市标题
		oiTitle = data.getOfflineInfo().getTitle();
		// 更多精彩
		rfList.clear();
		rfList.addAll(data.getRecommendForYou());
		mList.clear();
		mList.addAll(rfList.get(0).getModules());

		initViewPager();
		initHeaderView1();
		initHeaderView2();
		initHeaderView3();
		pAdapter.notifyDataSetChanged();
		gAdapter.notifyDataSetChanged();
		gAdapter_head.notifyDataSetChanged();
		scgadapter.notifyDataSetChanged();
		hrdapter.notifyDataSetChanged();
		fbgadapter.notifyDataSetChanged();

		pager.setCurrentItem(avList.size() * BigNum / 2);

		/** ----------下载首页"更多"的数据---------- **/
		String homemoreUrl = UrlConstants.HOMEMORE;
		String homemoreJson = GetJosonUtil.getJson(getContext(), homemoreUrl);
		HomeMore more = GsonUtils.parseJSON(homemoreJson, HomeMore.class);
		pList.clear();
		pList.addAll(more.getData().getProducts());
		initListView();
		lAdapter.notifyDataSetChanged();
	}
	/** ------设置头部1------- **/
	private void initHeaderView1() {
		// TODO 小品类
		scgadapter = new smallCategorygridAdapter(getContext(), cList, R.layout.item_house_grid_smallcategory);
		grid_smallCategory.setAdapter(scgadapter);
		grid_smallCategory.setOnItemClickListener(this);
		// 签到
		vf_qiandao.setInAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.push_up_in));
		vf_qiandao.setOutAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.push_up_out));
		for (int i = 0; i < rtList.size(); i++) {
			View view = inflater.inflate(R.layout.layout_house_qiandao_viewfipper, null);
			ImageView miv = (ImageView) view.findViewById(R.id.iv_layout_house_qiandao_viewfipper);
			TextView mtv = (TextView) view.findViewById(R.id.tv_layout_house_qiandao_viewfipper);
			mtv.setOnClickListener(this);
			UILUtils.displayImage(rtList.get(i).getImgUrl(), miv);
			mtv.setText(rtList.get(i).getTitle());
			vf_qiandao.addView(view);
		}
		vf_qiandao.startFlipping();
		// 获得当前滚动数
		child = vf_qiandao.getDisplayedChild();
		// ******-------TODO
		// UILUtils.displayImage(rtimgUrl, iv_signin_snatch);
		iv_signin_snatch.setOnClickListener(this);

		// 手机专享
		tv_specials.setText(sList.get(0).getTitle());
		UILUtils.displayCircleImage(sList.get(0).getImgUrl(), iv_temai0);
		UILUtils.displayImage(sList.get(1).getImgUrl(), iv_temai1);
		UILUtils.displayImage(sList.get(2).getImgUrl(), iv_temai2);
		tv_temai1_title.setText((String) sList.get(0).getPromotionName());
		tv_temai1_price.setText("¥" + sList.get(0).getPromotionPrice() + "起");
		line_specials.setOnClickListener(this);
		iv_temai1.setOnClickListener(this);
		iv_temai2.setOnClickListener(this);
	}
	/** ------设置头部2------- **/
	private void initHeaderView2() {
		// 热门推荐
		tv_hotRecommend.setText(hrTitle);
		hrdapter = new hotRecommendgridAdapter(getContext(), hrList, R.layout.item_house_hotrecommend);
		grid_hotRecommend.setAdapter(hrdapter);
		grid_hotRecommend.setOnItemClickListener(this);

		// 发现精彩
		tv_findbeauty.setText(fbTitle);
		fbgadapter = new findBeautygridAdapter(getContext(), fbList, R.layout.item_house_grid_findbeauty);
		grid_findBeauty.setAdapter(fbgadapter);
		grid_findBeauty.setOnItemClickListener(this);
		// 发现精彩右
		vf_findbeauty.setInAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.push_up_in));
		vf_findbeauty.setOutAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.push_up_out));
		for (int i = 0; i < fbrList.size(); i++) {
			View view = inflater.inflate(R.layout.layout_house_findbeauty_viewflipper, null);
			ImageView miv = (ImageView) view.findViewById(R.id.iv_layout_house_findbeauty_viewfipper);
			TextView mtv = (TextView) view.findViewById(R.id.tv_layout_house_findbeauty_viewfipper);
			mtv.setOnClickListener(this);
			UILUtils.displayCircleImage(fbrList.get(i).getImgUrl(), miv);
			mtv.setText(fbrList.get(i).getTitle());
			vf_findbeauty.addView(view);
		}
		vf_findbeauty.startFlipping();
		child1 = vf_findbeauty.getDisplayedChild();
		// 点我领券
		// *********--------TODO
		// UILUtils.displayImage(fbimgUrl, iv_signIn);
		iv_signIn.setOnClickListener(this);

		// 当地门市
		tv_offline.setText(oiTitle);
	}
	/** ------设置头部3------- **/
	@SuppressLint("UseSparseArrays")
	private void initHeaderView3() {
		mradioGroup1.setOnCheckedChangeListener(this);
		radio_recommendforyou0.setText(rfList.get(0).getTitle());
		radio_recommendforyou1.setText(rfList.get(1).getTitle());
		radio_recommendforyou2.setText(rfList.get(2).getTitle());
		radio_recommendforyou3.setText(rfList.get(3).getTitle());
		gAdapter = new GridViewAdapter(getContext(), mList, R.layout.item_house_grid_recommendforyou);
		grid_recommendForYou.setAdapter(gAdapter);
		grid_recommendForYou.setOnItemClickListener(this);

		mradioGroup.setOnCheckedChangeListener(this);
		radio_head_recommendforyou0.setText(rfList.get(0).getTitle());
		radio_head_recommendforyou1.setText(rfList.get(1).getTitle());
		radio_head_recommendforyou2.setText(rfList.get(2).getTitle());
		radio_head_recommendforyou3.setText(rfList.get(3).getTitle());
		gAdapter_head = new GridViewAdapter(getContext(), mList, R.layout.item_house_grid_recommendforyou);
		grid_head_recommendForYou.setAdapter(gAdapter);
		grid_head_recommendForYou.setOnItemClickListener(this);
		map = new HashMap<Integer, Integer>();
	}
	/** ------设置发现精彩的适配器------- **/
	class findBeautygridAdapter extends SuperAdapter<Service_> {

		public findBeautygridAdapter(Context context, List<Service_> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, Service_ item, int position) {
			ImageView iv_findBeauty = helper.getView(R.id.iv_house_findBeauty);
			UILUtils.displayImage(item.getImgUrl(), iv_findBeauty);
			helper.setText(R.id.tv_house_findBeauty, item.getTitle());
		}

	}
	/** ------设置热门推荐的适配器------- **/
	class hotRecommendgridAdapter extends SuperAdapter<Service> {

		public hotRecommendgridAdapter(Context context, List<Service> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, Service item, int position) {
			ImageView iv_hotRecommend = helper.getView(R.id.iv_house_hotRecommend);
			UILUtils.displayImage(item.getImgUrl(), iv_hotRecommend);

		}

	}
	/** ------设置小品的适配器------- **/
	class smallCategorygridAdapter extends SuperAdapter<Content> {

		public smallCategorygridAdapter(Context context, List<Content> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, Content item, int position) {
			ImageView iv_smallCategory = helper.getView(R.id.iv_house_smallCategory);
			UILUtils.displayImage(item.getImgUrl(), iv_smallCategory);
			helper.setText(R.id.tv_house_smallCategory, item.getTitle());
		}

	}
	/** ------设置gridview的适配器------- **/
	class GridViewAdapter extends SuperAdapter<Module> {

		public GridViewAdapter(Context context, List<Module> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, Module item, int position) {
			helper.setText(R.id.tv_house_grid_modules, item.getTitle());
			if (Gposition == position) {
				helper.setTextColor(R.id.tv_house_grid_modules, Color.WHITE);
				helper.setBackgroundResource(R.id.tv_house_grid_modules,
						R.drawable.background_house_grid_recommendforyou);
			} else {
				helper.setTextColor(R.id.tv_house_grid_modules, Color.BLACK);
				helper.setBackgroundResource(R.id.tv_house_grid_modules, 0);
			}
		}

	}
	/** ------设置viewpager------- **/
	private void initViewPager() {
		pAdapter = new PagerAdapter(getChildFragmentManager());
		pager.setAdapter(pAdapter);
		pager.addOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				c.move(arg0 % avList.size(), arg1);
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				switch (arg0) {
					case ViewPager.SCROLL_STATE_DRAGGING:// 值为1:拖拽
						isDrag = true;
						break;

					case ViewPager.SCROLL_STATE_IDLE:// 值为0:静止
						isDrag = false;
						break;

					case ViewPager.SCROLL_STATE_SETTLING:// 值为2:停止拖拽
						isDrag = false;
						break;

					default:
						break;
				}
			}
		});
		pager.postDelayed(new Runnable() {
			public void run() {
				// 触碰时不自动滑动
				if (!isDrag) {
					int currentItem = pager.getCurrentItem();
					pager.setCurrentItem(currentItem + 1);
				}
				pager.postDelayed(this, 6000);
			}
		}, 6000);
	}
	/** ------设置viewpager的适配器------- **/
	class PagerAdapter extends FragmentPagerAdapter {

		public PagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int arg0) {
			ViewPagerFragment fragment = new ViewPagerFragment();
			Bundle bundle = new Bundle();
			String image = avList.get(arg0 % avList.size()).getImage();
			bundle.putSerializable(Constants.IMGSRC, image);
			String url = avList.get(arg0 % avList.size()).getUrl();
			bundle.putSerializable(Constants.IMGURL, url);
			fragment.setArguments(bundle);
			return fragment;
		}

		@Override
		public int getCount() {
			return avList.size() * BigNum;
		}

	}

	/** -----------初始化listview----------- **/
	private void initListView() {
		lAdapter = new ListViewAdapter(getContext(), pList, R.layout.item_house_list_recommendforyou);
		mListView.setAdapter(lAdapter);
		mListView.setOnScrollListener(this);
		// TODO ListView行点击
		mListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				/** ------跳转listview的详情界面------ **/
				Intent intent = new Intent(getContext(), HomeListDetailActivity.class);
				startActivity(intent);
			}
		});
	}

	class ListViewAdapter extends SuperAdapter<Product> {

		public ListViewAdapter(Context context, List<Product> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, Product item, int position) {
			ImageView iv_more = helper.getView(R.id.iv_house_more);
			UILUtils.displayImage(item.getImgUrl(), iv_more);
			helper.setText(R.id.tv_house_more_typename, item.getProductTypeName());
			helper.setText(R.id.tv_house_more_cityname, item.getDepartCityName() + "出发");
			helper.setText(R.id.tv_house_more_price, "¥" + item.getPromotionPrice() + "起");
			helper.setText(R.id.tv_house_more_desc, item.getPromotionDesc());
			helper.setText(R.id.tv_house_more_satisfaction, item.getSatisfaction() + "满意");
			helper.setText(R.id.tv_house_more_peopleCount, item.getPeopleCount() + "人出游");
			helper.setText(R.id.tv_house_more_title, item.getTitle());
			helper.setText(R.id.tv_house_more_subtitle, item.getSubTitle());
			ImageView iv_activityIconUrl = helper.getView(R.id.iv_house_more_activityIconUrl);

			String iconUrl = item.getActivityIconUrl();
			if (iconUrl == "") {
				iv_activityIconUrl.setVisibility(View.GONE);
			} else {
				iv_activityIconUrl.setVisibility(View.VISIBLE);
				UILUtils.displayImage(iconUrl, iv_activityIconUrl);
			}

		}

	}

	// TODO radioGroup选择改变监听
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		mList.clear();
		switch (checkedId) {
			case R.id.radio_house_recommendforyou0:
				mList.addAll(rfList.get(0).getModules());
				radioButton = 0;
				radio_head_recommendforyou0.setChecked(true);
				// 定位滑动到更多精彩
				mListView.setSelection(3);
				break;
			case R.id.radio_house_recommendforyou1:
				mList.addAll(rfList.get(1).getModules());
				radioButton = 1;
				radio_head_recommendforyou1.setChecked(true);
				mListView.setSelection(3);
				break;
			case R.id.radio_house_recommendforyou2:
				mList.addAll(rfList.get(2).getModules());
				radioButton = 2;
				radio_head_recommendforyou2.setChecked(true);
				mListView.setSelection(3);
				break;
			case R.id.radio_house_recommendforyou3:
				mList.addAll(rfList.get(3).getModules());
				radioButton = 3;
				radio_head_recommendforyou3.setChecked(true);
				mListView.setSelection(3);
				break;

			default:
				break;
		}

		switch (checkedId) {
			case R.id.radio_house_head_recommendforyou0:
				mList.addAll(rfList.get(0).getModules());
				radioButton = 0;
				radio_recommendforyou0.setChecked(true);
				break;
			case R.id.radio_house_head_recommendforyou1:
				mList.addAll(rfList.get(1).getModules());
				radioButton = 1;
				radio_recommendforyou1.setChecked(true);
				break;
			case R.id.radio_house_head_recommendforyou2:
				mList.addAll(rfList.get(2).getModules());
				radioButton = 2;
				radio_recommendforyou2.setChecked(true);
				break;
			case R.id.radio_house_head_recommendforyou3:
				mList.addAll(rfList.get(3).getModules());
				radioButton = 3;
				radio_recommendforyou3.setChecked(true);
				break;

			default:
				break;
		}
		if (map.get(radioButton) == null) {
			grid_recommendForYou.setSelection(0);
			grid_head_recommendForYou.setSelection(0);
			Gposition = 0;
		} else {
			grid_recommendForYou.setSelection(map.get(radioButton));
			grid_head_recommendForYou.setSelection(map.get(radioButton));
			Gposition = map.get(radioButton);
		}
		gAdapter.notifyDataSetChanged();
		gAdapter_head.notifyDataSetChanged();

	}

	// gridView行点击
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// Intent intent = new Intent();
		switch (parent.getId()) {
			case R.id.grid_house_recommendForYou:
				Gposition = position;
				// 定位滑动到更多精彩
				mListView.setSelection(3);
				map.remove(radioButton);
				map.put(radioButton, position);
				gAdapter.notifyDataSetChanged();
				gAdapter_head.notifyDataSetChanged();
				break;

			case R.id.grid_house_head_recommendForYou:
				Gposition = position;
				map.remove(radioButton);
				map.put(radioButton, position);
				gAdapter.notifyDataSetChanged();
				gAdapter_head.notifyDataSetChanged();
				break;

			case R.id.grid_house_smallCategory:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL, cList.get(position).getUrl());
				// startActivity(intent);
				break;

			case R.id.grid_house_hotRecommend:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL,
				// hrList.get(position).getMUrl());
				// startActivity(intent);
				break;
			default:
				break;
		}
	}

	// TODO ListView滑动监听
	@Override
	public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
		int count = mListView.getHeaderViewsCount();
		if (firstVisibleItem >= count - 1) {
			rela_head_radioGroup.setVisibility(View.VISIBLE);
			iv_backtop.setVisibility(View.VISIBLE);
			if (firstVisibleItem >= count + 1) {
				// 属性动画
				final ObjectAnimator up = ObjectAnimator.ofFloat(rela_head_radioGroup, "translationY", 0, -300);
				up.setDuration(500);

				final ObjectAnimator down = ObjectAnimator.ofFloat(rela_head_radioGroup, "translationY", -300, 0);
				down.setDuration(500);
				mListView.setOnTouchListener(new OnTouchListener() {

					@SuppressLint("ClickableViewAccessibility")
					@Override
					public boolean onTouch(View v, MotionEvent event) {
						float my = 0;
						switch (event.getAction()) {
							case MotionEvent.ACTION_DOWN:
								y = event.getY();
								Log.e("y", y + "");
								break;

							case MotionEvent.ACTION_MOVE:
								my = event.getY();
								if (my - y > 0) {
									if (rela_head_radioGroup.getTranslationY() == -300) {
										down.start();
									}
								} else if (my - y < 0) {
									if (rela_head_radioGroup.getTranslationY() == 0) {
										up.start();
									}
								}
								break;

							default:
								break;
						}
						return false;
					}
				});
			}

		} else {
			rela_head_radioGroup.setVisibility(View.INVISIBLE);
			iv_backtop.setVisibility(View.INVISIBLE);
		}

	}

	@Override
	public void onScrollStateChanged(AbsListView view, int scrollState) {

	}

	// TODO 回调
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		String string = "";
		// 回调为空
		if (data == null) {
			string = PreferenceUtil.readCity(getContext(), Constants.SELECTCITY);
		} else {
			if (requestCode == Constants.REQUESTCODE_CITY) {
				if (resultCode == Constants.RESULTCODE_CITY) {
					string = data.getStringExtra(Constants.CITY);
				} else if (resultCode == Constants.RESULTCODE_SCITY) {
					string = data.getStringExtra(Constants.SCITY);
				} else if (resultCode == Constants.RESULTCODE_HOTCITY) {
					string = data.getStringExtra(Constants.HOTCITY);
				}
			}
		}
		// 改变城市名
		tv_city.setText(string);
		PreferenceUtil.writeCity(getContext(), string, Constants.SELECTCITY);
	}

	// 点击事件
	@Override
	public void onClick(View v) {
		int id = v.getId();
		Intent intent = new Intent();
		switch (id) {
			case R.id.tv_house_city:
				 intent.setClass(getContext(), CityActivity.class);
				 startActivityForResult(intent, Constants.REQUESTCODE_CITY);
				break;

			case R.id.iv_house_backtop:
				// 返回顶部
				mListView.setSelection(0);
				break;

			case R.id.tv_layout_house_qiandao_viewfipper:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL, rtList.get(child).getUrl());
				// startActivity(intent);
				break;

			case R.id.iv_signin_snatch:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL, rturl);
				// startActivity(intent);
				break;

			case R.id.line_house_specials:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL, sList.get(0).getUrl());
				// startActivity(intent);
				break;
			case R.id.iv_house_temai1:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL, sList.get(1).getUrl());
				// startActivity(intent);
				break;
			case R.id.iv_house_temai2:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL, sList.get(2).getUrl());
				// startActivity(intent);
				break;

			case R.id.grid_house_findBeauty:
				break;

			case R.id.tv_layout_house_findbeauty_viewfipper:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL,
				// fbrList.get(child1).getMUrl());
				// startActivity(intent);
				break;

			case R.id.iv_house_signIn:
				// intent.setClass(getContext(), WebActivity.class);
				// intent.putExtra(Constants.URL, fburl);
				// startActivity(intent);
				break;
			default:
				break;
		}
	}

}
