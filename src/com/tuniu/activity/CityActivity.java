package com.tuniu.activity;

import java.util.ArrayList;
import java.util.List;

import com.json.home.city.Allcity;
import com.json.home.city.Cities;
import com.json.home.city.Hotcity;
import com.tuniu.superAdater.util.SuperAdapter;
import com.tuniu.superAdater.util.ViewHolder;
import com.tuniu.utils.Constants;
import com.tuniu.utils.GetJosonUtil;
import com.tuniu.utils.UrlConstants;
import com.tuniu.utils.letterBarCustom;
import com.xinbo.utils.GsonUtils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

@SuppressLint({ "DefaultLocale", "InflateParams", "ClickableViewAccessibility" })
public class CityActivity extends Activity implements OnItemClickListener, OnTouchListener, OnClickListener {

	private ListView list_city;
	private TextView tv_city;
	private List<Allcity> acList = new ArrayList<Allcity>();
	private ListViewAdapter ladapter;
	private letterBarCustom letterBarCustom;
	private GridView grid_city_head;
	private List<Hotcity> hcList = new ArrayList<Hotcity>();
	private GridViewAdapter gadapter;
	private EditText ed_search;
	private ArrayList<Allcity> SearchCityList = new ArrayList<Allcity>();
	private RelativeLayout rela_search1;
	private ListView list_city_search;
	private SListViewAdapter sladapter;
	private TextView tv_search;
	private InputMethodManager imm;
	private Intent intent;
	private ImageView iv_close;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_city);
		
		initData();
		
	}
	private void initData() {
		initUI();
		initLetterBar();
		initSearchView();
		initSearchListView();
		CloseActivity();
		
		new MyAsy().execute();
	}
	class MyAsy extends AsyncTask<Void, Void, Void>{
		@Override
		protected Void doInBackground(Void... params) {
			// 获取城市数据
			String city = UrlConstants.CITY;
			String cityJson = GetJosonUtil.getJson(CityActivity.this, city);
			Cities cities = GsonUtils.parseJSON(cityJson, Cities.class);
			acList.clear();
			acList.addAll(cities.getAllcity());
			hcList.clear();
			hcList.addAll(cities.getHotcity());
			return null;
		}
		@Override
		protected void onPostExecute(Void result) {
			
			ladapter.notifyDataSetChanged();
			gadapter.notifyDataSetChanged();
			super.onPostExecute(result);
		}
	}
	private void initUI() {
		intent = getIntent();
		iv_close = (ImageView) findViewById(R.id.iv_city_close);
		tv_city = (TextView) findViewById(R.id.tv_city);
		letterBarCustom = (letterBarCustom) findViewById(R.id.letterBarCustom1);
		ed_search = (EditText) findViewById(R.id.ed_city_search);
		rela_search1 = (RelativeLayout) findViewById(R.id.rela_city_search1);
		list_city_search = (ListView) findViewById(R.id.list_city_search);
		tv_search = (TextView) findViewById(R.id.tv_city_search);
		imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
		list_city = (ListView) findViewById(R.id.list_city);
		View view = getLayoutInflater().inflate(R.layout.item_city_list_head, null);
		list_city.addHeaderView(view);
		grid_city_head = (GridView) view.findViewById(R.id.grid_city_head);
		grid_city_head.setOnItemClickListener(this);
		
		initListView();
		initGridView();
		ladapter.notifyDataSetChanged();
		gadapter.notifyDataSetChanged();
	}


	private void initLetterBar() {
		letterBarCustom.setTouchDialog(tv_city);
		letterBarCustom.SetOnTouchLetterListener(new com.tuniu.utils.letterBarCustom.OnTouchLetterListener() {

			@Override
			public void onSelect(String s) {
				if (s.equals("#")) {
					list_city.setSelection(0);
				} else {
					for (int i = 0; i < acList.size(); i++) {
						String letter = acList.get(i).getPinyin().substring(0, 1).toUpperCase();
						if (letter.equals(s)) {
							// TODO 滑动定位
							list_city.setSelection(i + 1);
							break;
						}
					}
				}
			}
		});
	}

	private void initSearchView() {
		ed_search.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {

			}

			@Override
			public void afterTextChanged(Editable s) {
				String inPut = ed_search.getText().toString();
				SearchCityList.clear();
				if (inPut.equals("")) {
					rela_search1.setVisibility(View.GONE);
				} else {
					// 遍历出搜索到的城市
					rela_search1.setVisibility(View.VISIBLE);
					for (int i = 0; i < acList.size(); i++) {
						if (acList.get(i).getPinyin().startsWith(inPut) || acList.get(i).getName().startsWith(inPut)) {
							SearchCityList.add(acList.get(i));
							tv_search.setVisibility(View.INVISIBLE);
						}
					}
				}

				if (SearchCityList.size() == 0) {
					// 当搜索不到城市时执行
					tv_search.setVisibility(View.VISIBLE);
				}
				sladapter.notifyDataSetChanged();

			}
		});
	}

	private void CloseActivity() {
		iv_close.setOnClickListener(this);
	}

	private void initGridView() {
		gadapter = new GridViewAdapter(this, hcList, R.layout.item_city_head_grid_btn);
		grid_city_head.setAdapter(gadapter);
	}

	class GridViewAdapter extends SuperAdapter<Hotcity> {
		public GridViewAdapter(Context context, List<Hotcity> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, Hotcity item, int position) {
			helper.setText(R.id.tv_grid_btn, item.getName());
		}
	}

	private void initSearchListView() {
		sladapter = new SListViewAdapter(this, SearchCityList, R.layout.item_city_list);
		list_city_search.setAdapter(sladapter);
		list_city_search.setOnItemClickListener(this);
	}

	class SListViewAdapter extends SuperAdapter<Allcity> {

		public SListViewAdapter(Context context, List<Allcity> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, Allcity item, int position) {
			TextView tv_letter = helper.getView(R.id.tv_city_letter);
			tv_letter.setVisibility(View.GONE);
			helper.setText(R.id.tv_city_name, item.getName());
		}

	}

	private void initListView() {
		ladapter = new ListViewAdapter(this, acList, R.layout.item_city_list);
		list_city.setAdapter(ladapter);
		list_city.setOnTouchListener(this);
		list_city.setOnItemClickListener(this);
	}

	class ListViewAdapter extends SuperAdapter<Allcity> {
		public ListViewAdapter(Context context, List<Allcity> mdaList, int mLayoutId) {
			super(context, mdaList, mLayoutId);
		}

		@Override
		public void convert(ViewHolder helper, Allcity item, int position) {
			helper.setText(R.id.tv_city_name, item.getName());
			String letter = item.getPinyin().substring(0, 1);
			TextView tv_letter = helper.getView(R.id.tv_city_letter);
			if (position == 0) {
				// 初始化 防止复用时GONE
				tv_letter.setVisibility(View.VISIBLE);
			} else {
				String letter2 = acList.get(position - 1).getPinyin().substring(0, 1);
				if (letter.equals(letter2)) {
					tv_letter.setVisibility(View.GONE);
				} else {
					tv_letter.setVisibility(View.VISIBLE);
				}
			}
			tv_letter.setText(letter.toUpperCase());
		}
	}

	// 行点击事件
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		switch (parent.getId()) {
			case R.id.list_city:
				// TODO
				intent.putExtra(Constants.CITY, acList.get(position - 1).getName());
				setResult(Constants.RESULTCODE_CITY, intent);
				finish();
				break;

			case R.id.list_city_search:
				intent.putExtra(Constants.SCITY, SearchCityList.get(position).getName());
				setResult(Constants.RESULTCODE_SCITY, intent);
				finish();
				break;

			case R.id.grid_city_head:
				intent.putExtra(Constants.HOTCITY, hcList.get(position).getName());
				setResult(Constants.RESULTCODE_HOTCITY, intent);
				finish();
			default:
				break;
		}
	}

	// ListView触碰监听事件
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		ed_search.clearFocus();
		// 键盘隐藏
		imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
		return false;
	}

	// 点击事件
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.iv_city_close:
				finish();
				break;

			default:
				break;
		}
	}
}
