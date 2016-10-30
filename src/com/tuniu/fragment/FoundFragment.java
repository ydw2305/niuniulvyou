package com.tuniu.fragment;

import java.util.ArrayList;
import java.util.List;

import com.android.volley.VolleyError;
import com.common.widget.hzlib.HorizontalListView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView.OnFloatScrollListener;
import com.json.foundflipper.Banner;
import com.json.foundflipper.Flipper;
import com.json.foundhorlistview.Qiujibanglist;
import com.json.foundhorlistview.Qiujieban;
import com.json.foundjinxuan.Jingxuan;
import com.json.foundjinxuan.Line;
import com.json.foundjinxuan.Tags;
import com.json.foundthreehorlistview.Threelist;
import com.json.foundwodexinqu.Tag;
import com.json.foundwodexinqu.Wodexinqu;
import com.tuiniu.found.activity.JiebanActivity;
import com.tuniu.activity.R;
import com.tuniu.utils.Constants;
import com.tuniu.utils.UrlConstants;
import com.tuniu.activity.FoundSearchActivity;
import com.xinbo.utils.GsonUtils;
import com.xinbo.utils.HTTPUtils;
import com.xinbo.utils.ResponseListener;
import com.xinbo.utils.UILUtils;
import com.xinbo.widget.ListView4ScrollView;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * A simple {@link Fragment} subclass.
 *
 */

@SuppressLint("InflateParams")
public class FoundFragment extends Fragment implements OnClickListener
{

	private LayoutInflater inflater;
	private ViewFlipper vFlipper;
	private PullToRefreshScrollView myscrol;
	private LinearLayout floatheight;
	private int floath;
	private LinearLayout shang;
	private LinearLayout xia;
	private ArrayList<com.json.foundjinxuan.List> foundlist = new ArrayList<com.json.foundjinxuan.List>();
	private ArrayList<Qiujibanglist> firstlist = new ArrayList<Qiujibanglist>();
	private ArrayList<Qiujibanglist> twolist = new ArrayList<Qiujibanglist>();
	private ArrayList<com.json.foundthreehorlistview.List> threelist = new ArrayList<com.json.foundthreehorlistview.List>();
	private MyfondAdapter listadapter;
	private ImageView fli_touxiang;
	private TextView wangmin;
	private Myfirsthlist myfirsthlist;
	private Mytwohlist mytwohlist;
	private Mythreehlist mythreehlist;
	private TextView tv_jingxuan;
	private TextView tv_jinxuan_xiahua;
	private TextView tv_xingqu;
	private TextView tv_xinqu_xiahua;
	private LinearLayout wodejinxuan;
	private LinearLayout wodexinqu;
	private RelativeLayout houlist;
	private TextView tv_jingxuanxia;
	private TextView tv_jinxuanxia_xiahua;
	private TextView tv_xingquxia;
	private TextView tv_xingquxia_xiahua;
	private ArrayList<com.json.foundwodexinqu.List> xinqulist = new ArrayList<com.json.foundwodexinqu.List>();
	private XinquAdapter xinquAdapter;
	private ImageView top;
	private ListView4ScrollView jinxuanglist;

	public FoundFragment()
	{
		// Required empty public constructor
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_found, container, false);
		this.inflater = inflater;
		initUI(view);
		initData(view);
		return view;
	}
	
	private void initData(View view)
	{
		/***
		 * *****每日精选listview
		 */
		// String json = GetJosonUtil.getJson(getContext(), UrlConstants.LISTURL);
		// Jingxuan jingxuan = GsonUtils.parseJSON(json, Jingxuan.class);
		// List<com.json.foundjinxuan.List> list = jingxuan.getData().getList();
		// foundlist.clear();
		// foundlist.addAll(list);
		// listadapter.notifyDataSetChanged();
		HTTPUtils.get(getContext(), UrlConstants.LISTURL, new ResponseListener()
		{

			@Override
			public void onResponse(String arg0)
			{
				Jingxuan jingxuan = GsonUtils.parseJSON(arg0, Jingxuan.class);
				List<com.json.foundjinxuan.List> list = jingxuan.getData().getList();
				foundlist.clear();
				foundlist.addAll(list);
				listadapter.notifyDataSetChanged();
			}

			@Override
			public void onErrorResponse(VolleyError arg0)
			{
			}
		});
		/**
		 * ****第一第二个水平listview
		 */
//		// String qjbjson = GetJosonUtil.getJson(getContext(),
//		// UrlConstants.FIRSTLIST);
//		// Qiujieban qiujieban = GsonUtils.parseJSON(qjbjson, Qiujieban.class);
//		// List<Qiujibanglist> qjlist = qiujieban.getData().get(0).getList();
//		// List<Qiujibanglist> list2 = qiujieban.getData().get(1).getList();
//		// firstlist.addAll(qjlist);
//		// twolist.addAll(list2);
//		// myfirsthlist.notifyDataSetChanged();
//		// mytwohlist.notifyDataSetChanged();
		HTTPUtils.get(getContext(), UrlConstants.FIRSTLIST, new ResponseListener()
		{
			@Override
			public void onResponse(String arg0)
			{
				Qiujieban qiujieban = GsonUtils.parseJSON(arg0, Qiujieban.class);
				List<Qiujibanglist> qjlist = qiujieban.getData().get(0).getList();
				List<Qiujibanglist> list2 = qiujieban.getData().get(1).getList();
				firstlist.addAll(qjlist);
				twolist.addAll(list2);
				myfirsthlist.notifyDataSetChanged();
				mytwohlist.notifyDataSetChanged();
			}

			@Override
			public void onErrorResponse(VolleyError arg0)
			{
			}
		});

		/**
		 * ***第三个水平listview
		 */
		// String tljson = GetJosonUtil.getJson(getContext(),
		// UrlConstants.THREELIST);
		// Threelist threelist2 = GsonUtils.parseJSON(tljson, Threelist.class);
		// List<com.json.foundthreehorlistview.List> thlist =
		// threelist2.getData().getList();
		// threelist.addAll(thlist);
		// mythreehlist.notifyDataSetChanged();
		HTTPUtils.get(getContext(), UrlConstants.THREELIST, new ResponseListener()
		{
			@Override
			public void onResponse(String arg0)
			{
				Threelist threelist2 = GsonUtils.parseJSON(arg0, Threelist.class);
				List<com.json.foundthreehorlistview.List> list = threelist2.getData().getList();
				threelist.addAll(list);
				mythreehlist.notifyDataSetChanged();
			}

			@Override
			public void onErrorResponse(VolleyError arg0)
			{
			}
		});

		/**
		 * ***我的兴趣listview
		 */
		// String wdjson = GetJosonUtil.getJson(getContext(),
		// UrlConstants.WODEXINQUURL);
		// Wodexinqu wodexinqu = GsonUtils.parseJSON(wdjson, Wodexinqu.class);
		// List<com.json.foundwodexinqu.List> wodexinqulist =
		// wodexinqu.getData().getList();
		// xinqulist.clear();
		// xinqulist.addAll(wodexinqulist);
		// xinquAdapter.notifyDataSetChanged();
		HTTPUtils.get(getContext(), UrlConstants.WODEXINQUURL, new ResponseListener()
		{
			@Override
			public void onResponse(String arg0)
			{
				Wodexinqu wodexinqu = GsonUtils.parseJSON(arg0, Wodexinqu.class);
				List<com.json.foundwodexinqu.List> wodexinqulist = wodexinqu.getData().getList();
				xinqulist.clear();
				xinqulist.addAll(wodexinqulist);
				xinquAdapter.notifyDataSetChanged();
			}

			@Override
			public void onErrorResponse(VolleyError arg0)
			{
			}
		});
	}

	private void initUI(View view)
	{

		view.findViewById(R.id.fra_search).setOnClickListener(this);
		myscrol = (PullToRefreshScrollView) view.findViewById(R.id.scrollView1);
		myscrol.setOnRefreshListener(new OnRefreshListener<ScrollView>()
		{
			@Override
			public void onRefresh(PullToRefreshBase<ScrollView> refreshView)
			{
				new GetDataAsk().execute();
			}
		});
		/**
		 * 设置浮窗隐藏
		 */
		initvizi();
		/***
		 * **设置viewflipper
		 */
		setViewFlipper(view);

		view.findViewById(R.id.rel_jiebang).setOnClickListener(this);

		/**
		 * 初始化悬浮控件
		 */
		floatheight = (LinearLayout) view.findViewById(R.id.lin_gaodu);
		shang = (LinearLayout) view.findViewById(R.id.lin_shang);
		xia = (LinearLayout) view.findViewById(R.id.lin_xia);
		shang.setVisibility(View.GONE);
		/***
		 * **上控件(每日精选，我的兴趣)
		 */
		view.findViewById(R.id.rel_jinxuan_shang).setOnClickListener(this);
		view.findViewById(R.id.rel_xinqu_shang).setOnClickListener(this);
		tv_jingxuan = (TextView) view.findViewById(R.id.tv_jinxuana);
		tv_jinxuan_xiahua = (TextView) view.findViewById(R.id.tv_jinxuan_inditea);
		tv_xingqu = (TextView) view.findViewById(R.id.tv_xinqua);
		tv_xinqu_xiahua = (TextView) view.findViewById(R.id.tv_xinquaindex);
		/***
		 * ****最顶图标
		 */
		top = (ImageView) view.findViewById(R.id.img_top);
		top.setOnClickListener(this);
		/**
		 * **下控件
		 */
		view.findViewById(R.id.rel_jinxuan).setOnClickListener(this);
		;
		view.findViewById(R.id.rel_xinqu).setOnClickListener(this);
		;
		tv_jingxuanxia = (TextView) view.findViewById(R.id.tv_jinxuan);
		tv_jinxuanxia_xiahua = (TextView) view.findViewById(R.id.tv_jinxuan_indite);
		tv_xingquxia = (TextView) view.findViewById(R.id.tv_xinqu_xia);
		tv_xingquxia_xiahua = (TextView) view.findViewById(R.id.tv_xinquxia_xiahua);

		wodejinxuan = (LinearLayout) view.findViewById(R.id.found_jinxuan);
		wodexinqu = (LinearLayout) view.findViewById(R.id.found_xinqu);
		houlist = (RelativeLayout) view.findViewById(R.id.lin_thortallist);
		/**
		 * **水平listview
		 */
		HorizontalListView firsthlist = (HorizontalListView) view.findViewById(R.id.firsthortallist);
		HorizontalListView twohlist = (HorizontalListView) view.findViewById(R.id.twothortallist);
		HorizontalListView threehlist = (HorizontalListView) view.findViewById(R.id.threethortallist);
		firsthlist.setFocusable(false);
		twohlist.setFocusable(false);
		threehlist.setFocusable(false);
		myfirsthlist = new Myfirsthlist();
		mytwohlist = new Mytwohlist();
		mythreehlist = new Mythreehlist();
		firsthlist.setAdapter(myfirsthlist);
		twohlist.setAdapter(mytwohlist);
		threehlist.setAdapter(mythreehlist);
		/**
		 * 我的兴趣listview
		 */
		ListView4ScrollView xinqu_list = (ListView4ScrollView) view.findViewById(R.id.listView2);
		xinqu_list.setFocusable(false);
		xinquAdapter = new XinquAdapter();
		xinqu_list.setAdapter(xinquAdapter);
		// /**
		// * 每日精选listview
		// */
		jinxuanglist = (ListView4ScrollView) view.findViewById(R.id.listView1);
		jinxuanglist.setFocusable(false);
		listadapter = new MyfondAdapter();
		jinxuanglist.setAdapter(listadapter);
		listadapter.notifyDataSetChanged();

	}

	class XinquAdapter extends BaseAdapter
	{

		@Override
		public int getCount()
		{
			return xinqulist.size();
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
			View layout = null;
			if (convertView == null)
			{
				layout = inflater.inflate(R.layout.found_xinqu_list_item, null);
			} else
			{
				layout = convertView;
			}
			ImageView xinquimghead = (ImageView) layout.findViewById(R.id.img_touxiang);
			ImageView xinquimgfirst = (ImageView) layout.findViewById(R.id.img_first);
			ImageView xinquimgtwo = (ImageView) layout.findViewById(R.id.img_two);
			ImageView xinquimgthree = (ImageView) layout.findViewById(R.id.img_three);
			TextView name = (TextView) layout.findViewById(R.id.tv_name);
			TextView title = (TextView) layout.findViewById(R.id.tv_title);
			TextView text = (TextView) layout.findViewById(R.id.tv_text);
			TextView time = (TextView) layout.findViewById(R.id.tv_shijian);
			TextView hotIndex = (TextView) layout.findViewById(R.id.tv_hotIndex);
			List<Tag> tags = xinqulist.get(position).getTags();
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < tags.size(); i++)
			{
				buffer.append("#" + tags.get(i).getTagName() + "#\t");
			}
			name.setText(xinqulist.get(position).getUserInfo().getNickName());
			title.setText(xinqulist.get(position).getTitle());
			text.setLines(2);
			text.setText(buffer.toString() + xinqulist.get(position).getText());
			time.setText(xinqulist.get(position).getTime());
			hotIndex.setText(xinqulist.get(position).getHotIndex() + "");
			UILUtils.displayCircleImage(xinqulist.get(position).getUserInfo().getHeadImage(), xinquimghead);
			UILUtils.displayImage(xinqulist.get(position).getImgs().get(0).getImgUrl(), xinquimgfirst);
			UILUtils.displayImage(xinqulist.get(position).getImgs().get(1).getImgUrl(), xinquimgtwo);
			UILUtils.displayImage(xinqulist.get(position).getImgs().get(2).getImgUrl(), xinquimgthree);
			return layout;
		}

	}

	class Mythreehlist extends BaseAdapter
	{

		@Override
		public int getCount()
		{
			return threelist.size();
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
			View layout = null;
			if (convertView == null)
			{
				layout = inflater.inflate(R.layout.threehlist_item, null);
			} else
			{
				layout = convertView;
			}
			ImageView img_c = (ImageView) layout.findViewById(R.id.img_c);
			TextView tv_c = (TextView) layout.findViewById(R.id.tv_c);
			UILUtils.displayImage(threelist.get(position).getLogo(), img_c);
			tv_c.setText(threelist.get(position).getTagText());
			return layout;
		}

	}

	class Mytwohlist extends BaseAdapter
	{

		@Override
		public int getCount()
		{
			return twolist.size();
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
			View layout = null;
			if (convertView == null)
			{
				layout = inflater.inflate(R.layout.horilist_item, null);
			} else
			{
				layout = convertView;
			}
			ImageView img_qiujie = (ImageView) layout.findViewById(R.id.img_a);
			TextView tv_qiujie = (TextView) layout.findViewById(R.id.tv_b);
			tv_qiujie.setText(twolist.get(position).getTitle());
			UILUtils.displayImage(twolist.get(position).getImgUrl(), img_qiujie);
			return layout;
		}

	}

	class Myfirsthlist extends BaseAdapter
	{

		@Override
		public int getCount()
		{
			return firstlist.size();
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
			View layout = null;
			if (convertView == null)
			{
				layout = inflater.inflate(R.layout.horilist_item, null);
			} else
			{
				layout = convertView;
			}
			ImageView img_qiujie = (ImageView) layout.findViewById(R.id.img_a);
			TextView tv_qiujie = (TextView) layout.findViewById(R.id.tv_b);
			tv_qiujie.setText(firstlist.get(position).getTitle());
			UILUtils.displayImage(firstlist.get(position).getImgUrl(), img_qiujie);
			return layout;
		}

	}

	private void initvizi()
	{
		myscrol.setOnFloatScrollListener(new OnFloatScrollListener()
		{
			@Override
			public void onFloatScroll(int height) {
				floath = floatheight.getHeight();
				if (floath <= height)
				{
					top.setVisibility(View.VISIBLE);
					shang.setVisibility(View.VISIBLE);
					xia.setVisibility(View.GONE);
				} else
				{
					top.setVisibility(View.GONE);
					shang.setVisibility(View.GONE);
					xia.setVisibility(View.VISIBLE);
				}
			}
		});
	}

	private void setViewFlipper(View view)
	{
		vFlipper = (ViewFlipper) view.findViewById(R.id.flipper);
		vFlipper.setInAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.push_up_in));
		vFlipper.setOutAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.push_up_out));

		HTTPUtils.get(getContext(), UrlConstants.FLIPPERURL, new ResponseListener()
		{

			@Override
			public void onResponse(String arg0)
			{

				Flipper flipper = GsonUtils.parseJSON(arg0, Flipper.class);
				List<Banner> banners = flipper.getData().getBanners();

				for (int i = 0; i < banners.size(); i++)
				{
					View flipperout = inflater.inflate(R.layout.found_viewflipper_item, null);
					fli_touxiang = (ImageView) flipperout.findViewById(R.id.img_fli_touxiang);
					wangmin = (TextView) flipperout.findViewById(R.id.tv_wangmin);
					UILUtils.displayCircleImage(banners.get(i).getUserInfo().getHeadImg(), fli_touxiang);
					String nickName = banners.get(i).getUserInfo().getNickName();
					wangmin.setText(nickName + "\t" + banners.get(i).getTitle());
					int length = nickName.length();
					int length2 = wangmin.length();
					SpannableStringBuilder style = new SpannableStringBuilder(wangmin.getText().toString());
					style.setSpan(new ForegroundColorSpan(Color.parseColor("#FFA139")), 0, length,
							Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
					style.setSpan(new ForegroundColorSpan(Color.BLACK), length, length2,
							Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
					wangmin.setText(style);
					vFlipper.addView(flipperout);
				}
			}

			@Override
			public void onErrorResponse(VolleyError arg0)
			{
			}
		});

		vFlipper.startFlipping();
	}

	class MyfondAdapter extends BaseAdapter
	{
		@Override
		public int getCount()
		{
			return foundlist.size();
		}

		@Override
		public Object getItem(int position)
		{
			return null;
		}

		@Override
		public int getViewTypeCount()
		{
			return 2;
		}

		@Override
		public int getItemViewType(int position)
		{
			com.json.foundjinxuan.List list = foundlist.get(position);
			if (list.getItemType() == 1)
			{
				return 1;
			} else
			{
				return 0;
			}
		}

		@Override
		public long getItemId(int position)
		{
			return 0;
		}

		public View getView(int position, View convertView, ViewGroup parent)
		{
			View layout = null;
			if (convertView == null)
			{
				switch (getItemViewType(position))
				{
				case Constants.CONTENTNULL:
					layout = inflater.inflate(R.layout.found_list_bottom, null);
					break;
				case Constants.TAGNULL:
					layout = inflater.inflate(R.layout.found_list_item, null);
					break;
				default:
					break;
				}
			} else
			{
				layout = convertView;
			}

			switch (getItemViewType(position))
			{
			case Constants.CONTENTNULL:
				TextView title = (TextView) layout.findViewById(R.id.textView1);
				TextView adsonetitle = (TextView) layout.findViewById(R.id.textView9);
				TextView adstwotitle = (TextView) layout.findViewById(R.id.textView10);
				TextView adsthreetitle = (TextView) layout.findViewById(R.id.textView11);
				TextView jieban = (TextView) layout.findViewById(R.id.textView2);
				ImageView firstimg = (ImageView) layout.findViewById(R.id.imageView2);
				ImageView twoimg = (ImageView) layout.findViewById(R.id.imageView3);
				ImageView threeimg = (ImageView) layout.findViewById(R.id.imageView4);
				ViewFlipper xinquflipper = (ViewFlipper) layout.findViewById(R.id.xinquflipper);
				xinquflipper.setInAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.push_up_in));
				xinquflipper.setOutAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.push_up_out));
				Tags tag2 = foundlist.get(position).getTag();
				List<Line> lines = tag2.getLines();
				for (int i = 0; i < lines.size(); i++)
				{
					View flipperout = inflater.inflate(R.layout.xinquviewflpper, null);
					wangmin = (TextView) flipperout.findViewById(R.id.tv_xinquflipper);
					wangmin.setText(lines.get(i).getTitle());
					xinquflipper.addView(flipperout);
				}
				xinquflipper.startFlipping();
				title.setText("#" + foundlist.get(position).getTag().getTitle() + "#");
				jieban.setText(foundlist.get(position).getTag().getCountList().get(0) + "/"
						+ foundlist.get(position).getTag().getCountList().get(1) + "/"
						+ foundlist.get(position).getTag().getCountList().get(2));
				adsonetitle.setText(foundlist.get(position).getTag().getAds().get(0).getTitle());
				adstwotitle.setText(foundlist.get(position).getTag().getAds().get(1).getTitle());
				adsthreetitle.setText(foundlist.get(position).getTag().getAds().get(2).getTitle());
				UILUtils.displayImage(foundlist.get(position).getTag().getAds().get(0).getImgUrl(), firstimg);
				UILUtils.displayImage(foundlist.get(position).getTag().getAds().get(1).getImgUrl(), twoimg);
				UILUtils.displayImage(foundlist.get(position).getTag().getAds().get(2).getImgUrl(), threeimg);
				break;
			case Constants.TAGNULL:
				ImageView datu = (ImageView) layout.findViewById(R.id.img_datu);
				ImageView touxiang = (ImageView) layout.findViewById(R.id.img_touxiang);
				TextView wangjia = (TextView) layout.findViewById(R.id.tv_wanjia);
				TextView titile = (TextView) layout.findViewById(R.id.tv_titile);
				TextView renshu = (TextView) layout.findViewById(R.id.tv_huo);
				TextView name = (TextView) layout.findViewById(R.id.tv_xinming);
				TextView tag = (TextView) layout.findViewById(R.id.tv_tag);
				UILUtils.displayImage(foundlist.get(position).getCommon().getImgUrl(), datu);
				UILUtils.displayCircleImage(foundlist.get(position).getContent().getUserInfo().getHeadImage(),
						touxiang);
				List<com.json.foundjinxuan.Tag> tags = foundlist.get(position).getContent().getTags();
				// 一个字体多种颜色
				StringBuffer buffer = new StringBuffer();
				for (int i = 0; i < tags.size(); i++)
				{
					buffer.append("#" + tags.get(i).getTagName() + "#\t");
				}
				String a = buffer.toString();
				tag.setText(buffer.toString() + foundlist.get(position).getCommon().getIntroduction());
				int length = a.length();
				int length2 = tag.length();
				SpannableStringBuilder style = new SpannableStringBuilder(tag.getText().toString());
				style.setSpan(new ForegroundColorSpan(Color.parseColor("#60C33F")), 0, length,
						Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
				style.setSpan(new ForegroundColorSpan(Color.parseColor("#c0c0c0")), length, length2,
						Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
				tag.setText(style);
				name.setText(foundlist.get(position).getContent().getUserInfo().getNickName());
				titile.setText(foundlist.get(position).getCommon().getTitle());
				renshu.setText(foundlist.get(position).getContent().getHotIndex() + "");
				wangjia.setText(foundlist.get(position).getContent().getTags().get(0).getTagName());
				wangjia.setTranslationX(-150);
				final ObjectAnimator animator = ObjectAnimator.ofFloat(wangjia, "translationX", -150, 0)
						.setDuration(2000);
				touxiang.setOnClickListener(new OnClickListener()
				{

					@Override
					public void onClick(View v)
					{
						animator.start();
					}
				});

				break;
			default:
				break;
			}
			return layout;
		}

	}

	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
		case R.id.rel_jinxuan:
		case R.id.rel_jinxuan_shang:
			myscrol.setMySmoothScrollTo(floath);
			houlist.setVisibility(View.VISIBLE);
			wodejinxuan.setVisibility(View.VISIBLE);
			wodexinqu.setVisibility(View.GONE);
			tv_jinxuanxia_xiahua.setVisibility(View.VISIBLE);
			tv_xingquxia_xiahua.setVisibility(View.INVISIBLE);
			tv_jinxuan_xiahua.setVisibility(View.VISIBLE);
			tv_xinqu_xiahua.setVisibility(View.INVISIBLE);
			tv_xingquxia.setTextColor(Color.BLACK);
			tv_jingxuanxia.setTextColor(Color.parseColor("#FFA139"));
			tv_xingqu.setTextColor(Color.BLACK);
			tv_jingxuan.setTextColor(Color.parseColor("#FFA139"));

			break;
		case R.id.rel_xinqu:
		case R.id.rel_xinqu_shang:
			myscrol.setMySmoothScrollTo(floath);
			wodejinxuan.setVisibility(View.GONE);
			houlist.setVisibility(View.GONE);
			wodexinqu.setVisibility(View.VISIBLE);
			tv_xingquxia_xiahua.setVisibility(View.VISIBLE);
			tv_jinxuanxia_xiahua.setVisibility(View.INVISIBLE);
			tv_xinqu_xiahua.setVisibility(View.VISIBLE);
			tv_jinxuan_xiahua.setVisibility(View.INVISIBLE);
			tv_jingxuanxia.setTextColor(Color.BLACK);
			tv_xingquxia.setTextColor(Color.parseColor("#FFA139"));
			tv_jingxuan.setTextColor(Color.BLACK);
			tv_xingqu.setTextColor(Color.parseColor("#FFA139"));

			break;
		case R.id.rel_jiebang:
			Intent intent = new Intent(getActivity(), JiebanActivity.class);
			startActivity(intent);
			break;
		case R.id.img_top:
			myscrol.setMySmoothScrollTo(0);
			break;
		case R.id.fra_search:
			Intent searchavtivity = new Intent(getActivity(), FoundSearchActivity.class);
			startActivity(searchavtivity);

			break;
		default:
			break;
		}
	}

	/****
	 * TODO
	 * 下拉刷新延迟
	 */
	private class GetDataAsk extends AsyncTask<Void, Void, String[]>
	{

		@Override
		protected String[] doInBackground(Void... params)
		{
			try
			{
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPreExecute()
		{
			myscrol.onRefreshComplete();
			super.onPreExecute();
		}

	}

}
