package com.tuniu.utils;

public interface UrlConstants
{
	public static final String ListPath = "json_scheduling_list/";
	public static final String DetailsPath = "json_scheduling_details/";
	/**---海南---**/
	public static final String XC_HAINAN = ListPath + "XC_hainan.txt";
	/**---厦门---**/
	public static final String XC_XIAMEN = ListPath + "XC_xiamen.txt";
	/**---云南---**/
	public static final String XC_YUNNAN = ListPath + "XC_yunnan.txt";
	/**---日本---**/
	public static final String XC_RIBEN = ListPath + "XC_riben.txt";
	/**---香港---**/
	public static final String XC_XIANGGAN = ListPath + "XC_xianggan.txt";
	/**---韩国---**/
	public static final String XC_HANGUO = ListPath + "XC_hanguo.txt";
	/**---详情list数据---**/
	public static final String TC_DETAIL_SANYA = DetailsPath + "xc_detail_sanya.txt";
	
//	String HOST = "http://192.168.152.1:8000/Tuniu_Server/";
	String HOST = "json_home/";
	
	String HOMEHEADER = HOST + "home_header.txt";
	String HOMEMORE = HOST + "home_more.txt";
	String CITY = HOST + "cities.txt";
	String DETAILHEADER = HOST + "detail_header.txt";
	String DETAILXINGCHENG = HOST + "detail_xingcheng.txt";
	String DETAILXIANGGUAN = HOST + "detail_xiangguan.txt";
	
	/**------发现界面的网址-----**/
//	String FoundURL="http://192.168.1.104:8080/serverhome/";
	String FoundURL="http://oft547m5c.bkt.clouddn.com/";
	
	String LISTURL=FoundURL+"mixcontent.txt";
	String FLIPPERURL=FoundURL+"flipper.txt";
	String FIRSTLIST=FoundURL+"qiujieban.txt";
	String THREELIST=FoundURL+"threelist.txt";
	String WODEXINQUURL=FoundURL+"wodexinqu.txt";
	String JIEBANGBANNER=FoundURL+"jiebanbanner.txt";
	String JIEBANDAINIWANLIST=FoundURL+"jiebandainiwanlist.txt";
	String QIUJIEBANG=FoundURL+"qiujiebanlist.txt";
}
