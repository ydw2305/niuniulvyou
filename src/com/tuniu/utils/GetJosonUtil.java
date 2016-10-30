package com.tuniu.utils;

import android.content.Context;

public final class GetJosonUtil
{

	/**----------返回行程玩法页面list的json数据--------*/
	public static String getJson(Context context, String url)
	{
		String strJson = ReadFileUtil.ReadTxtFile(context, url);
		return strJson;
	}

}
