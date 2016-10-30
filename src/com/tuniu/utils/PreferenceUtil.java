package com.tuniu.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class PreferenceUtil
{
	public static void writeCheck(Context context, boolean isCheck, String string)
	{
		SharedPreferences sp = context.getSharedPreferences(string, Context.MODE_PRIVATE);
		Editor edit = sp.edit();
		edit.putBoolean("isOnlyWIFI", isCheck);
		edit.commit();
	}
	
	public static boolean readCheck(Context context, boolean isCheck, String string)
	{
		SharedPreferences sp = context.getSharedPreferences(string, Context.MODE_PRIVATE);
		isCheck = sp.getBoolean("isOnlyWIFI", isCheck);
		return isCheck;
	}
	
	public static void writeCity(Context context, String City, String string)
	{
		SharedPreferences sp = context.getSharedPreferences(string, Context.MODE_PRIVATE);
		Editor edit = sp.edit();
		edit.putString("City", City);
		edit.commit();
	}
	
	public static String readCity(Context context, String string)
	{
		SharedPreferences sp = context.getSharedPreferences(string, Context.MODE_PRIVATE);
		String City = sp.getString("City", "上海");
		return City;
	}
}
