package com.tuniu.utils;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class GetTimeUtils {
	/**----------获取时间---------**/
	@SuppressLint("SimpleDateFormat")
	public static String getXCTime(int dayTime) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM月dd日 E");       
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.set(Calendar.DAY_OF_YEAR, year + dayTime);
		String time = formatter.format(calendar.getTime());
		return time;
	}
}
