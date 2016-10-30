package com.tuniu.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

public class SetTextUtils {
	/**--------设置文本前景色-----------**/
	public static SpannableString setStrForegroundColor(final Context context,String str){
		String s = str + "/人";
		SpannableString mSpannableString = new SpannableString(s);
		mSpannableString.setSpan(new ForegroundColorSpan(Color.rgb(255, 130, 0)), 0, s.length()-2, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
		mSpannableString.setSpan(new ForegroundColorSpan(Color.GRAY), s.length()-2, s.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
		return mSpannableString;
	}
	/**--------设置文本背景色-----------**/
	public static String setStrBackgroundColor(final Context context,String str, int color){
		SpannableString mSpannableString = new SpannableString(str);
		mSpannableString.setSpan(new BackgroundColorSpan(color), 0, str.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		return mSpannableString.toString();
	}
	/**--------设置拼接两个字符串-----------**/
//	public static String strConnect(String str1, String str2){
//		StringBuffer stringBuffer = new StringBuffer();
//		stringBuffer.append(str1).append(str2);
//		return stringBuffer.toString();
//	}
}
