package com.tuiniu.found.activity;

import java.util.ArrayList;
import java.util.List;

import com.android.volley.VolleyError;
import com.common.widget.hzlib.HorizontalListView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView.OnFloatScrollListener;
import com.json.found.jiebanbanner.Banner;
import com.json.found.jiebanbanner.Jiebanbanner;
import com.json.found.jiebanghorlistview.Jiebanhorlist;
import com.json.found.jiebanplaylist.Jiebandainiwanlist;
import com.json.found.jiebanplaylist.PicList;
import com.json.found.jiebanplaylist.Tag;
import com.tuniu.activity.R;
import com.tuniu.utils.UrlConstants;
import com.xinbo.utils.GsonUtils;
import com.xinbo.utils.HTTPUtils;
import com.xinbo.utils.ResponseListener;
import com.xinbo.utils.UILUtils;
import com.xinbo.widget.ListView4ScrollView;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class JiebanActivity extends FragmentActivity implements OnClickListener
{

	private int floath;
	private PullToRefreshScrollView myscroll;
	private RelativeLayout floatheight;
	private LinearLayout shang;
	private LinearLayout xia;
	private LinearLayout jiebanggaodu;
	private int gaodu;
	private ViewPager viewpagerheight;
	private ArrayList<Banner> banlist =new ArrayList<Banner>();
	private ArrayList<com.json.found.jiebanghorlistview.Banner> horlist =new ArrayList<com.json.found.jiebanghorlistview.Banner>();
	private ArrayList<com.json.found.jiebanplaylist.List> playlist =new ArrayList<com.json.found.jiebanplaylist.List>();
	private ViewpagerAdapter viewpagerAdapter;
	private HorAdapter horAdapter;
	private MyJieBanlist myJieBanlist;
	private TextView tv_jie_ind;
	private TextView tv_play_ind;
	private LinearLayout lin_tag;
	private TextView tv_jie_ind_shang;
	private TextView tv_play_ind_shang;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jieban);
		initUI();
		initData();
	}

	private void initData() {
//		String jbbjson = GetJosonUtil.getJson(this, foundURL.JIEBANGBANNER);
//		Jiebanbanner jiebanbanner = GsonUtils.parseJSON(jbbjson, Jiebanbanner.class);
//		List<Banner> banners = jiebanbanner.getData().getBanners();
//		banlist.clear();
//		banlist.addAll(banners);
//		viewpagerAdapter.notifyDataSetChanged();
		HTTPUtils.get(this, UrlConstants.JIEBANGBANNER, new ResponseListener() {
			
			@Override
			public void onResponse(String arg0) {
				Jiebanbanner jiebanbanner = GsonUtils.parseJSON(arg0, Jiebanbanner.class);
				List<Banner> banners = jiebanbanner.getData().getBanners();
				banlist.clear();
				banlist.addAll(banners);
				viewpagerAdapter.notifyDataSetChanged();
			}
			
			@Override
			public void onErrorResponse(VolleyError arg0) {
				// TODO Auto-generated method stub
				
			}
		});
//		String jbhjson = GetJosonUtil.getJson(this, foundURL.JIEBANGBANNER);
//		Jiebanhorlist jiebanhorlist = GsonUtils.parseJSON(jbhjson, Jiebanhorlist.class);
//		List<com.json.found.jiebanghorlistview.Banner> bannerslist = jiebanhorlist.getData().getBanners();
//		horlist.clear();
//		horlist.addAll(bannerslist);
//		horAdapter.notifyDataSetChanged();
		HTTPUtils.get(this, UrlConstants.JIEBANGBANNER, new ResponseListener() {
			
			@Override
			public void onResponse(String arg0) {
				Jiebanhorlist jiebanhorlist = GsonUtils.parseJSON(arg0, Jiebanhorlist.class);
				List<com.json.found.jiebanghorlistview.Banner> banners = jiebanhorlist.getData().getBanners();
				horlist.clear();
				horlist.addAll(banners);
				horAdapter.notifyDataSetChanged();
			}
			
			@Override
			public void onErrorResponse(VolleyError arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		DataDaNiWan();
		
	}

	private void initUI()
	{
		findViewById(R.id.img_back).setOnClickListener(this);;
		
		myscroll = (PullToRefreshScrollView) findViewById(R.id.scrollView_jiebang);
		myscroll.setOnRefreshListener(new OnRefreshListener<ScrollView>()
		{

			@Override
			public void onRefresh(PullToRefreshBase<ScrollView> refreshView)
			{
				new GetDataAsk().execute();
			}
		});
		inityincang();
		ListView4ScrollView jiebanlist= (ListView4ScrollView) findViewById(R.id.lis_jiebang);
		jiebanlist.setFocusable(false);
		myJieBanlist = new MyJieBanlist();
		jiebanlist.setAdapter(myJieBanlist);
		ViewPager jbpager= (ViewPager) findViewById(R.id.pager);
		FragmentManager fm = getSupportFragmentManager();
		viewpagerAdapter = new ViewpagerAdapter(fm);
		jbpager.setAdapter(viewpagerAdapter);
		
		HorizontalListView horlistview = (HorizontalListView) findViewById(R.id.horlistview);
		horAdapter = new HorAdapter();
		horlistview.setAdapter(horAdapter);
		
		findViewById(R.id.rel_qiujiebang).setOnClickListener(this);;
		findViewById(R.id.rel_dainiwan).setOnClickListener(this);;
		findViewById(R.id.rel_jie_shang).setOnClickListener(this);;
		findViewById(R.id.rel_paly_shang).setOnClickListener(this);;
		tv_jie_ind = (TextView) findViewById(R.id.tv_jie_ind);
		tv_play_ind = (TextView) findViewById(R.id.tv_play_ind);
		tv_jie_ind_shang = (TextView) findViewById(R.id.tv_jie_ind_shang);
		tv_play_ind_shang = (TextView) findViewById(R.id.tv_play_ind_shang);
		
		lin_tag = (LinearLayout) findViewById(R.id.lin_tag);
	}
	class HorAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			return horlist.size();
		}

		@Override
		public Object getItem(int position) {
			return null;
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View inflate =null;
			if (convertView==null) {
				inflate= getLayoutInflater().inflate(R.layout.banner_jieban, null);
			}else {
				inflate=convertView;
			}
			ImageView img_banner = (ImageView) inflate.findViewById(R.id.imageView1);
			TextView tv_ming = (TextView) inflate.findViewById(R.id.textView1);
			tv_ming.setText(horlist.get(position).getTitle());
			UILUtils.displayImage(horlist.get(position).getImgUrl(), img_banner);
			return inflate;
			
		}
		
	}
	class ViewpagerAdapter extends FragmentPagerAdapter{


		public ViewpagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public int getCount() {
			return banlist.size();
		}
		@Override
		public Fragment getItem(int position) {
			String imgUrl = banlist.get(position).getImgUrl();
			return new BanneFragment(imgUrl);
		}



	}
	private void inityincang()
	{
		floatheight = (RelativeLayout) findViewById(R.id.rel_floheight);
		shang = (LinearLayout) findViewById(R.id.lin_shang);
		jiebanggaodu = (LinearLayout) findViewById(R.id.jiebanggaodu);
		jiebanggaodu.setBackgroundColor(Color.alpha(0));
		xia = (LinearLayout) findViewById(R.id.lin_xia);
		viewpagerheight = (ViewPager) findViewById(R.id.pager);
		
		myscroll.setOnFloatScrollListener(new OnFloatScrollListener()
		{
			@Override
			public void onFloatScroll(int height) {
				int viewheight = viewpagerheight.getHeight();
				gaodu = jiebanggaodu.getHeight();
				floath = floatheight.getHeight()-gaodu;
				if (floath <= height)
				{
					shang.setVisibility(View.VISIBLE);
				} else
				{
					shang.setVisibility(View.INVISIBLE);
				}
				if (viewheight<=height)
				{
					jiebanggaodu.setBackgroundColor(Color.argb(255, 255, 255, 255));
				}else {
					jiebanggaodu.setBackgroundColor(Color.argb((int)(height*255/viewheight), 255, 255, 255));
				}
			}
		});
	}
	class MyJieBanlist extends BaseAdapter{

		@Override
		public int getCount()
		{
			return playlist.size();
		}

		@Override
		public Object getItem(int position)
		{
			return null;
		}

		@Override
		public long getItemId(int position)
		{
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent)
		{
			View inflate =null;
			if (convertView==null)
			{
				inflate= getLayoutInflater().inflate(R.layout.jieban_listview_item, null);
			}else {
				inflate=convertView;
			}
			ImageView touxiang = (ImageView) inflate.findViewById(R.id.img_touxiang);
			ImageView firstimg = (ImageView) inflate.findViewById(R.id.img_first);
			ImageView twoimg = (ImageView) inflate.findViewById(R.id.img_two);
			ImageView threeimg = (ImageView) inflate.findViewById(R.id.img_three);
			RelativeLayout rel_img = (RelativeLayout) inflate.findViewById(R.id.rel_threeimg);
			TextView name = (TextView) inflate.findViewById(R.id.tv_name);
			TextView day = (TextView) inflate.findViewById(R.id.tv_day);
			TextView daygo = (TextView) inflate.findViewById(R.id.tv_daygo);
			TextView from = (TextView) inflate.findViewById(R.id.tv_from);
			TextView content = (TextView) inflate.findViewById(R.id.tv_content);
			TextView imgnumber = (TextView) inflate.findViewById(R.id.tv_imgnumber);
			TextView adress = (TextView) inflate.findViewById(R.id.tv_adress);
			TextView tag = (TextView) inflate.findViewById(R.id.tv_tag);
			List<Tag> tags = playlist.get(position).getTags();
			if (tags!=null)
			{
				StringBuffer buffer = new StringBuffer();
				for (int i = 0; i < tags.size(); i++)
				{
					buffer.append(tags.get(i).getTagName()+"\t");
				}
				tag.setText(buffer.toString());
			}else {
				lin_tag.setVisibility(View.GONE);
			}
			adress.setText(playlist.get(position).getPublishPoiName());
			name.setText(playlist.get(position).getNickname());
			day.setText(playlist.get(position).getPublishTime());
			daygo.setText(playlist.get(position).getStartTime());
			StringBuffer citifrom = new StringBuffer();
			List<String> scenicList = playlist.get(position).getScenicList();
			for (int i = 0; i < scenicList.size(); i++)
			{
				citifrom.append(scenicList.get(i)+"\t");
			}
			from.setText(citifrom.toString());
			content.setText(playlist.get(position).getContent());
			List<PicList> list = playlist.get(position).getPicList();
			imgnumber.setText("共"+list.size()+"张");
			UILUtils.displayCircleImage(playlist.get(position).getUserIcon(), touxiang);
			if (list.size()>=3)
			{
				UILUtils.displayImage(list.get(0).getPicUrl(), firstimg);
				UILUtils.displayImage(list.get(1).getPicUrl(), twoimg);
				UILUtils.displayImage(list.get(2).getPicUrl(), threeimg);
			}else if(list.size()==2){
				UILUtils.displayImage(list.get(0).getPicUrl(), firstimg);
				UILUtils.displayImage(list.get(1).getPicUrl(), twoimg);
				rel_img.setVisibility(View.INVISIBLE);
			}else {
				UILUtils.displayImage(list.get(0).getPicUrl(), firstimg);
				twoimg.setVisibility(View.INVISIBLE);
				rel_img.setVisibility(View.INVISIBLE);
			}
			
			
			return inflate;
		}
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.img_back:
			finish();
			break;
		case R.id.rel_qiujiebang:case R.id.rel_jie_shang:
			tv_play_ind.setVisibility(View.INVISIBLE);
			tv_jie_ind.setVisibility(View.VISIBLE);
			tv_play_ind_shang.setVisibility(View.INVISIBLE);
			tv_jie_ind_shang.setVisibility(View.VISIBLE);
			DataQiuJieBanlist();
			break;
		case R.id.rel_dainiwan:case R.id.rel_paly_shang:
			tv_jie_ind.setVisibility(View.INVISIBLE);
			tv_play_ind.setVisibility(View.VISIBLE);
			tv_jie_ind_shang.setVisibility(View.INVISIBLE);
			tv_play_ind_shang.setVisibility(View.VISIBLE);
			DataDaNiWan();
			
			
			break;

		default:
			break;
		}
	}

	private void DataQiuJieBanlist()
	{
		HTTPUtils.get(JiebanActivity.this, UrlConstants.QIUJIEBANG, new ResponseListener()
		{
			
			@Override
			public void onResponse(String arg0)
			{
				Jiebandainiwanlist jiebandainiwanlist = GsonUtils.parseJSON(arg0, Jiebandainiwanlist.class);
				List<com.json.found.jiebanplaylist.List> list = jiebandainiwanlist.getData().getList();
				playlist.clear();
				playlist.addAll(list);
				myJieBanlist.notifyDataSetChanged();
			}
			
			@Override
			public void onErrorResponse(VolleyError arg0)
			{
				
			}
		});
	}

	private void DataDaNiWan()
	{
		HTTPUtils.get(JiebanActivity.this, UrlConstants.JIEBANDAINIWANLIST, new ResponseListener()
		{
			
			@Override
			public void onResponse(String arg0)
			{
				Jiebandainiwanlist jiebandainiwanlist = GsonUtils.parseJSON(arg0, Jiebandainiwanlist.class);
				List<com.json.found.jiebanplaylist.List> list = jiebandainiwanlist.getData().getList();
				playlist.clear();
				playlist.addAll(list);
				myJieBanlist.notifyDataSetChanged();
			}
			
			@Override
			public void onErrorResponse(VolleyError arg0)
			{
				
			}
		});
	}
	private class GetDataAsk extends AsyncTask<Void, Void, String[]>{

		@Override
		protected String[] doInBackground(Void... params)
		{
			try
			{
				Thread.sleep(4000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			return null;
		}
		@Override
		protected void onPreExecute()
		{
			myscroll.onRefreshComplete();
			super.onPreExecute();
		}
		
	}
}
