package com.tuniu.utils;

import com.tuniu.activity.R;

public interface Constants {
	/** -------国内热门---------- **/
	public static final class guoNeiReMen {
		// 标题名
		public static final String TITLE = "国内热门";
		// 地名
		public static final String[] NAME = new String[] { "三亚", "厦门", "成都", "丽江", "北京", "青岛" };
		// 玩法次数
		public static final int[] NUM = new int[] { 12, 19, 13, 15, 11, 9 };
		// 图片路径
		private static String[] n = { "sanya", "xiamen", "chengdu", "lijiang", "beijing", "qingdao" };
		private static String[] imgsUrl = new String[n.length];
		public static final String[] getImgUrl() {
			for (int i = 0; i < n.length; i++) {
				if (i == 3) {
					imgsUrl[i] = "http://img4.tuniucdn.com/u/super/app/page/" + n[i] + ".jpg";
				} else {
					imgsUrl[i] = "http://img4.tuniucdn.com/u/super/app/page/" + n[i] + "@3x.jpg";
				}
			}
			return imgsUrl;
		}
	}
	
	/** -------出境热门---------- **/
	public static final class chuJingReMen {
		// 标题名
		public static final String TITLE = "出境热门";
		// 地名
		public static final String[] NAME = new String[] { "香港", "首尔", "普吉", "苏梅岛", "清迈", "东京" };
		// 玩法次数
		public static final int[] NUM = new int[] { 17, 7, 6, 3, 5, 8 };
		// 图片路径
		private static String[] n = { "xianggang", "shouer", "puji", "", "qingmai", "dongjing" };
		private static String[] imgsUrl = new String[n.length];
		public static final String[] getImgUrl() {
			for (int i = 0; i < n.length; i++) {
				if (i == 3) {
					imgsUrl[i] = "http://m.tuniucdn.com/fb2/t1/G2/M00/27/D7/Cii-TFei8OWISPHlAAHBDHJvSDEAAAwsALM32YAAcEk20.jpeg";
				} else {
					imgsUrl[i] = "http://img4.tuniucdn.com/u/super/app/page/" + n[i] + "@3x.jpg";
				}
			}
			return imgsUrl;
		}
	}
	/** -------首页数据---------- **/
	// 参数共享名
	String SPLASH = "splash";
	String ISFIRST = "isFirst";
	// Pager传参的Key
	String IMGSRC = "imgsrc";
	String IMGURL = "imgurl";
	// 网页传递参数Key
	String URL = "url";
	// tabs键
	String[] TABSNAME = { "首页", "目的地", "发现", "行程玩法", "我的" };
	// tabs键图片
	int[] TABSIMG = new int[] { R.drawable.tab_home, R.drawable.tab_destination, R.drawable.tab_found,
			R.drawable.tab_scheduling, R.drawable.tab_mine };
	// 打开城市列表
	int REQUESTCODE_CITY = 0;
	int RESULTCODE_CITY = 0;
	int RESULTCODE_SCITY = 1;
	int RESULTCODE_HOTCITY = 2;
	String CITY = "city";
	String SCITY = "scity";
	String HOTCITY = "hotcity";
	// 目的地tabs选项
	String[] DESTINATION = { "目的地大全", "帮你选目的地" };
	// sharePrefrence
	String SELECTCITY = "selectcity";
	
	/** -------发现数据---------- **/
	int TAGNULL = 1;
	int CONTENTNULL = 0;
}
