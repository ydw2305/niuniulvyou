package com.tuniu.activity;

import java.util.ArrayList;
import java.util.List;

import com.json.home.detail.header.CompList;
import com.json.home.detail.header.Data;
import com.json.home.detail.header.DetailHeader;
import com.json.home.detail.header.Image;
import com.json.home.detail.xiangguan.DetailXiangguan;
import com.json.home.detail.xingcheng.CostExclude;
import com.json.home.detail.xingcheng.CostInclude;
import com.json.home.detail.xingcheng.DefaultJourneyDetail;
import com.json.home.detail.xingcheng.DetailXingcheng;
import com.json.home.detail.xingcheng.JourneyDetailList;
import com.tuniu.fragment.home_childs.ViewPagerFragment;
import com.tuniu.superAdater.util.SuperAdapter;
import com.tuniu.superAdater.util.ViewHolder;
import com.tuniu.utils.Constants;
import com.tuniu.utils.CustomIndictorCircle;
import com.tuniu.utils.GetJosonUtil;
import com.tuniu.utils.MyScrollView;
import com.tuniu.utils.MyScrollView.OnFloatScrollListenter;
import com.tuniu.utils.UrlConstants;
import com.xinbo.utils.GsonUtils;
import com.xinbo.utils.UILUtils;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class HomeListDetailActivity extends AppCompatActivity implements OnCheckedChangeListener, OnClickListener {

	private int BigNum = 10000;
	private boolean isDrag;

	// banner
	private ViewPager pager;
	private TextView tv_category;
	private TextView tv_productId;
	private String category;
	private Integer productId;
	private ViewPagerAdapter plAdapter;
	private CustomIndictorCircle customIndictorCircle;
	private ArrayList<Image> iList = new ArrayList<Image>();
	// 牛人专线
	private TextView tv_cattleWord;
	private TextView tv_cattleWord1;
	private TextView tv_cattleWord2;
	private TextView tv_cattleWord3;
	private String cattleSj;
	private String cattleDl;
	private String cattleXc;
	private String cattleZs;
	// 标题
	private TextView tv_name;
	private String name;
	private TextView tv_price;
	private Integer price;
	private TextView tv_cityName;
	private String cityName;
	// 点评
	private TextView tv_satisfaction;
	private Integer satisfaction;
	private TextView tv_travelCount;
	private Integer travelCount;
	private TextView tv_specName;
	private TextView tv_specName1;
	private TextView tv_specName2;
	private TextView tv_specName3;
	private TextView tv_specName_satisfaction;
	private TextView tv_specName1_satisfaction;
	private TextView tv_specName2_satisfaction;
	private TextView tv_specName3_satisfaction;
	private String specName;
	private String specName1;
	private String specName2;
	private String specName3;
	private Integer satisfy;
	private Integer satisfy1;
	private Integer satisfy2;
	private Integer satisfy3;
	// 行程
	private ListView list_defaultJourneyDetail;
	private JourneyListViewAdapter jladapter;
	List<DefaultJourneyDetail> djdList = new ArrayList<DefaultJourneyDetail>();
	// 产品特色
	private TextView tv_tourRecommend;
	private String desc;
	// 费用说明
	private ListView list_costInclude;
	private CostListViewAdapter cladapter;
	private ListView list_costExclude;
	private CostEListViewAdapter celadapter;
	private List<CostInclude> ciList = new ArrayList<CostInclude>();
	private List<CostExclude> ceList = new ArrayList<CostExclude>();
	// 产品详情字样布局
	private RelativeLayout rela_title;
	private MyScrollView mscroll;
	// 悬浮
	private RelativeLayout rela_radioGroup_head;
	// 计算高度使用
	private LinearLayout line_xingcheng;
	private LinearLayout line_defaultJourneyDetail;
	private LinearLayout line_tourRecommend;
	private LinearLayout line_cost;
	private LinearLayout line_radioGroup_head;
	private int xingcheng;
	private int tourRecommend;
	private int cost;
	private int yuding;
	private int newHeight;// 对比高度 是否是向下滑动
	// radioGroup选择
	private RadioGroup mRadioGroup;
	private RadioGroup mRadioGroup_head;
	private RadioButton radio_defaultJourneyDetail;
	private RadioButton radio_head_defaultJourneyDetail;
	private RadioButton radio_head_tourRecommend;
	private RadioButton radio_head_cost;
	private RadioButton radio_head_shopRecommend;
	// 相关
	private GridView mGridView;
	private gridAdapter gadapter;
	private List<com.json.home.detail.xiangguan.List> lList = new ArrayList<com.json.home.detail.xiangguan.List>();
	// 回到顶部
	private ImageView iv_backtop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hlist_detail);
		
		new MyAsy().execute();
		
		initUI();
		show();// 显示、隐藏商品详情字样

	}

	private void show() {
		// 一进来时全透明
		rela_title.setAlpha(0);
		mscroll.setOnFloatScrollListenter(new OnFloatScrollListenter() {

			@Override
			public void OnFloatScroll(int height, int oldheight) {
				newHeight = height - oldheight;
				int high = pager.getHeight();
				if (height <= high) {
					rela_title.setAlpha((float) height / high);
				} else {
					rela_title.setAlpha(1);
				}

				// TODO 悬浮与标题高度
				int head = line_radioGroup_head.getHeight();
				// 到达行程高度
				xingcheng = line_xingcheng.getHeight() - head;
				// 达到产品特色高度
				tourRecommend = line_defaultJourneyDetail.getHeight() - head;
				// 到达费用说明高度
				cost = line_tourRecommend.getHeight() - head;
				// 到达预订须知高度
				yuding = line_cost.getHeight() - head;
				if (height < xingcheng) {
					rela_radioGroup_head.setVisibility(View.INVISIBLE);
					iv_backtop.setVisibility(View.INVISIBLE);
					radio_defaultJourneyDetail.setChecked(true);
				} else {
					if (height >= xingcheng && height < tourRecommend) {
						radio_head_defaultJourneyDetail.setChecked(true);

					} else if (height >= tourRecommend && height < cost) {
						radio_head_tourRecommend.setChecked(true);
					} else if (height >= cost && height < yuding) {
						radio_head_cost.setChecked(true);
					} else if (height >= yuding) {
						radio_head_shopRecommend.setChecked(true);
					}
					rela_radioGroup_head.setVisibility(View.VISIBLE);
					iv_backtop.setVisibility(View.VISIBLE);
				}
			}
		});

	}

	private void initUI()
	{
		//banner
		pager = (ViewPager) findViewById(R.id.pager_detail);
		tv_category = (TextView) findViewById(R.id.tv_detail_category);
		tv_productId = (TextView) findViewById(R.id.tv_detail_productId);
		customIndictorCircle = (CustomIndictorCircle) findViewById(R.id.customIndictorCircle);
		//牛人专线
		tv_cattleWord = (TextView) findViewById(R.id.tv_detail_cattleWord);
		tv_cattleWord1 = (TextView) findViewById(R.id.tv_detail_cattleWord1);
		tv_cattleWord2 = (TextView) findViewById(R.id.tv_detail_cattleWord2);
		tv_cattleWord3 = (TextView) findViewById(R.id.tv_detail_cattleWord3);
		//标题
		tv_name = (TextView) findViewById(R.id.tv_detail_name);
		tv_price = (TextView) findViewById(R.id.tv_detail_price);
		tv_cityName = (TextView) findViewById(R.id.tv_detail_cityName);
		//标题栏按钮
		findViewById(R.id.iv_detail_back_black).setOnClickListener(this);
		findViewById(R.id.iv_detail_back_green).setOnClickListener(this);
		findViewById(R.id.iv_detail_niuxin_black).setOnClickListener(this);
		findViewById(R.id.iv_detail_niuxin_green).setOnClickListener(this);
		findViewById(R.id.iv_detail_share_black).setOnClickListener(this);
		findViewById(R.id.iv_detail_share_green).setOnClickListener(this);
		//点评
		tv_satisfaction = (TextView) findViewById(R.id.tv_detail_satisfaction);
		tv_travelCount = (TextView) findViewById(R.id.tv_detail_travelCount);
		tv_specName = (TextView) findViewById(R.id.tv_detail_specName);
		tv_specName1 = (TextView) findViewById(R.id.tv_detail_specName1);
		tv_specName2 = (TextView) findViewById(R.id.tv_detail_specName2);
		tv_specName3 = (TextView) findViewById(R.id.tv_detail_specName3);
		tv_specName_satisfaction = (TextView) findViewById(R.id.tv_detail_specName_satisfaction);
		tv_specName1_satisfaction = (TextView) findViewById(R.id.tv_detail_specName1_satisfaction);
		tv_specName2_satisfaction = (TextView) findViewById(R.id.tv_detail_specName2_satisfaction);
		tv_specName3_satisfaction = (TextView) findViewById(R.id.tv_detail_specName3_satisfaction);
		//行程
		list_defaultJourneyDetail = (ListView) findViewById(R.id.list_daetail_defaultJourneyDetail);
		//产品特色
		tv_tourRecommend = (TextView) findViewById(R.id.tv_detail_tourRecommend);
		//费用说明
		list_costInclude = (ListView) findViewById(R.id.list_detail_costInclude);
		list_costExclude = (ListView) findViewById(R.id.list_detail_costExclude);
		//产品详情字样布局
		rela_title = (RelativeLayout) findViewById(R.id.rela_detail_title);
		mscroll = (MyScrollView) findViewById(R.id.scroll_detail);
		//悬浮
		rela_radioGroup_head = (RelativeLayout) findViewById(R.id.rela_detial_radioGroup_head);
		//TODO 计算高度使用
		line_xingcheng = (LinearLayout) findViewById(R.id.line_detail_xingcheng);
		line_defaultJourneyDetail = (LinearLayout) findViewById(R.id.line_detail_defaultJourneyDetail);
		line_tourRecommend = (LinearLayout) findViewById(R.id.line_detail_tourRecommend);
		line_cost = (LinearLayout) findViewById(R.id.line_detail_cost);
		line_radioGroup_head = (LinearLayout) findViewById(R.id.line_detial_radioGroup_head);
		//radioGroup选择
		mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup_detail);
		mRadioGroup_head = (RadioGroup) findViewById(R.id.radioGroup_detail_head);
		mRadioGroup.setOnCheckedChangeListener(this);
		mRadioGroup_head.setOnCheckedChangeListener(this);
		radio_defaultJourneyDetail = (RadioButton) findViewById(R.id.radio_detail_defaultJourneyDetail);
		radio_head_defaultJourneyDetail = (RadioButton) findViewById(R.id.radio_detail_head_defaultJourneyDetail);
		radio_head_tourRecommend = (RadioButton) findViewById(R.id.radio_detail_head_tourRecommend);
		radio_head_cost = (RadioButton) findViewById(R.id.radio_detail_head_cost);
		radio_head_shopRecommend = (RadioButton) findViewById(R.id.radio_detail_head_shopRecommend);
		//相关
		mGridView = (GridView) findViewById(R.id.grid_detail);
		//回到顶部
		iv_backtop = (ImageView) findViewById(R.id.iv_detail_backtop);
		iv_backtop.setOnClickListener(this);
		
		plAdapter = new ViewPagerAdapter(getSupportFragmentManager());
		pager.setAdapter(plAdapter);
		
		
		initCattleWord();
		initTitle();
		initSatisfaction();
		initTourRecommend();
		
		initJourneyListView();
		initCostListView();
		initGridView();
	}

	private void initData() {
		/** -------获取详情头部数据------- **/
		String detailheader = UrlConstants.DETAILHEADER;
		String detailJson = GetJosonUtil.getJson(HomeListDetailActivity.this, detailheader);
		DetailHeader header = GsonUtils.parseJSON(detailJson, DetailHeader.class);
		Data data = header.getData();
		// banner
		category = data.getCategory();
		productId = data.getProductId();
		iList.clear();
		iList.addAll(data.getImages());
		// 牛人专享
		cattleSj = data.getCattleWord().getCattleSj();
		cattleDl = data.getCattleWord().getCattleDl();
		cattleXc = data.getCattleWord().getCattleXc();
		cattleZs = data.getCattleWord().getCattleZs();
		// 标题
		name = data.getName();
		price = data.getLowestPromoPrice();
		cityName = data.getDepartName();
		// 点评
		satisfaction = data.getSatisfaction();
		travelCount = data.getTravelCount();
		List<CompList> compList = data.getCompList();
		specName = compList.get(0).getSpecName();
		specName1 = compList.get(1).getSpecName();
		specName2 = compList.get(2).getSpecName();
		specName3 = compList.get(3).getSpecName();
		satisfy = compList.get(0).getSatisfaction();
		satisfy1 = compList.get(1).getSatisfaction();
		satisfy2 = compList.get(2).getSatisfaction();
		satisfy3 = compList.get(3).getSatisfaction();

		
		
		

		/** -------获取详情行程数据------- **/
		String detailxingcheng = UrlConstants.DETAILXINGCHENG;
		String detailxcJson = GetJosonUtil.getJson(HomeListDetailActivity.this, detailxingcheng);
		DetailXingcheng xingcheng = GsonUtils.parseJSON(detailxcJson, DetailXingcheng.class);
		JourneyDetailList journeyDetailList = xingcheng.getData().getJourneyDetailList().get(0);
		// 行程
		djdList.clear();
		djdList.addAll(journeyDetailList.getDefaultJourneyDetail());
		// 产品特色
		desc = journeyDetailList.getTourRecommend().get(0).getDesc();
		// 费用说明
		ciList.clear();
		ciList.addAll(journeyDetailList.getCostInclude());
		ceList.clear();
		ceList.addAll(journeyDetailList.getCostExclude());

		

		/** -------获取详情相关数据------- **/
		String detailxiangguan = UrlConstants.DETAILXIANGGUAN;
		String detailxgJson = GetJosonUtil.getJson(HomeListDetailActivity.this, detailxiangguan);
		DetailXiangguan xiangguan = GsonUtils.parseJSON(detailxgJson, DetailXiangguan.class);
		lList.clear();
		lList.addAll(xiangguan.getData().getList());
		
		
		
	}
	class MyAsy extends AsyncTask<Void, Void, Void>{

		@Override
		protected Void doInBackground(Void... params) {
			initData();
			return null;
		}
		@Override
		protected void onPostExecute(Void result) {
			//TODO
			
			
			plAdapter.notifyDataSetChanged();
			cladapter.notifyDataSetChanged();
			jladapter.notifyDataSetChanged();
			gadapter.notifyDataSetChanged();
			
			initViewPager();
			pager.setCurrentItem(BigNum / 2);
			customIndictorCircle.setNum(iList.size());
			
			initCattleWord();
			initTitle();
			initSatisfaction();
			initTourRecommend();
			super.onPostExecute(result);
		}
	}

	private void initCattleWord() {
		tv_cattleWord.setText(cattleSj);
		tv_cattleWord1.setText(cattleDl);
		tv_cattleWord2.setText(cattleXc);
		tv_cattleWord3.setText(cattleZs);
	}

	private void initTitle() {
		tv_name.setText(name);
		tv_price.setText("¥" + price + "起");
		tv_cityName.setText("出发城市: " + cityName);
	}

	private void initSatisfaction() {
		tv_satisfaction.setText(satisfaction + "%");
		tv_travelCount.setText("共" + travelCount + "个点评");
		tv_specName.setText(specName + ":");
		tv_specName1.setText(specName1 + ":");
		tv_specName2.setText(specName2 + ":");
		tv_specName3.setText(specName3 + ":");
		tv_specName_satisfaction.setText(satisfy + "%");
		tv_specName1_satisfaction.setText(satisfy1 + "%");
		tv_specName2_satisfaction.setText(satisfy2 + "%");
		tv_specName3_satisfaction.setText(satisfy3 + "%");
	}

	private void initTourRecommend() {
		tv_tourRecommend.setText(desc);
	}

	private void initCostListView() {
		cladapter = new CostListViewAdapter(this, ciList, R.layout.item_detail_cost);
		list_costInclude.setAdapter(cladapter);
		celadapter = new CostEListViewAdapter(this, ceList, R.layout.item_detail_cost);
		list_costExclude.setAdapter(celadapter);
	}

	// TODO
	private void initJourneyListView() {
		jladapter = new JourneyListViewAdapter(this, djdList, R.layout.item_detail_list_xingcheng);
		list_defaultJourneyDetail.setAdapter(jladapter);
	}

	class JourneyListViewAdapter extends SuperAdapter<DefaultJourneyDetail> {

		public JourneyListViewAdapter(Context context, List<DefaultJourneyDetail> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, DefaultJourneyDetail item, int position) {
			helper.setText(R.id.tv_detail_list_journeyName, item.getJourneyName());
			helper.setText(R.id.tv_detail_list_food, item.getFoodAndStays().getFood());
			helper.setText(R.id.tv_detail_list_stay, item.getFoodAndStays().getStay());
		}

	}

	class CostListViewAdapter extends SuperAdapter<CostInclude> {

		public CostListViewAdapter(Context context, List<CostInclude> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, CostInclude item, int position) {
			helper.setText(R.id.tv_item_detail_cost_num, (position + 1) + ".");
			String title = item.getTitle();
			List<String> content = item.getContent();
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < content.size(); i++) {
				buffer.append(content.get(i)).append("  ");
			}
			helper.setText(R.id.tv_item_detail_cost, title + ":" + buffer);
		}

	}

	class CostEListViewAdapter extends SuperAdapter<CostExclude> {

		public CostEListViewAdapter(Context context, List<CostExclude> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, CostExclude item, int position) {
			helper.setText(R.id.tv_item_detail_cost_num, (position + 1) + ".");
			String title = item.getTitle();
			List<String> content = item.getContent();
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < content.size(); i++) {
				buffer.append(content.get(i)).append("  ");
			}
			helper.setText(R.id.tv_item_detail_cost, title + ":" + buffer);
		}

	}

	private void initGridView() {
		gadapter = new gridAdapter(this, lList, R.layout.item_grid_detail);
		mGridView.setAdapter(gadapter);
	}

	class gridAdapter extends SuperAdapter<com.json.home.detail.xiangguan.List> {

		public gridAdapter(Context context, List<com.json.home.detail.xiangguan.List> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, com.json.home.detail.xiangguan.List item, int position) {
			ImageView miv = helper.getView(R.id.iv_detail_grid_detail);
			UILUtils.displayImage(item.getSmallImage(), miv);
			helper.setText(R.id.tv_detail_grid_title, item.getName());
			helper.setText(R.id.tv_detail_grid_subtitle, item.getSubName());
			helper.setText(R.id.tv_detail_grid_price, "¥" + item.getLowestPromoPrice() + "起");
		}

	}

	private void initViewPager() {
		
		tv_category.setText(category);
		tv_productId.setText("产品编号： " + productId);
		pager.addOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				customIndictorCircle.move(arg0 % iList.size(), arg1);
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

	class ViewPagerAdapter extends FragmentPagerAdapter {

		public ViewPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int arg0) {
			ViewPagerFragment fragment = new ViewPagerFragment();
			Bundle bundle = new Bundle();
			bundle.putSerializable(Constants.IMGSRC, iList.get(arg0 % iList.size()).getSimage());
			fragment.setArguments(bundle);
			return fragment;
		}

		@Override
		public int getCount() {
			return iList.size() * BigNum;
		}

	}

	// RadioGroup选择
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
			case R.id.radio_detail_defaultJourneyDetail:
				mscroll.scrollTo(0, xingcheng);
				radio_head_defaultJourneyDetail.setChecked(true);
				break;

			case R.id.radio_detail_tourRecommend:
				mscroll.scrollTo(0, tourRecommend);
				radio_head_tourRecommend.setChecked(true);
				break;

			case R.id.radio_detail_cost:
				mscroll.scrollTo(0, cost);
				radio_head_cost.setChecked(true);
				break;

			case R.id.radio_detail_shopRecommend:
				mscroll.scrollTo(0, yuding);
				radio_head_shopRecommend.setChecked(true);
				break;

			default:
				break;
		}

		switch (checkedId) {
			case R.id.radio_detail_head_defaultJourneyDetail:
				// TODO 向下滑动时才做定位操作 避免向上滑动也发生定位
				if (newHeight >= 0) {
					mscroll.scrollTo(0, xingcheng);
				}
				break;

			case R.id.radio_detail_head_tourRecommend:
				if (newHeight >= 0) {
					mscroll.scrollTo(0, tourRecommend);
				}
				break;

			case R.id.radio_detail_head_cost:
				if (newHeight >= 0) {
					mscroll.scrollTo(0, cost);
				}
				break;

			case R.id.radio_detail_head_shopRecommend:
				if (newHeight >= 0) {
					mscroll.scrollTo(0, yuding);
				}
				break;

			default:
				break;
		}
		newHeight = 0;
	}

	@Override
	public void onClick(View v) {
		String text = "";
		switch (v.getId()) {
			case R.id.iv_detail_backtop:
				mscroll.scrollTo(0, 0);
				break;
			case R.id.iv_detail_back_black:case R.id.iv_detail_back_green:
				finish();
				return;
			case R.id.iv_detail_niuxin_black:case R.id.iv_detail_niuxin_green:
				text = "评论";
				break;
			case R.id.iv_detail_share_black:case R.id.iv_detail_share_green:
				text = "分享";
				break;
			default:
				break;
		}
		Toast.makeText(HomeListDetailActivity.this, text, Toast.LENGTH_SHORT).show();
	}
}
