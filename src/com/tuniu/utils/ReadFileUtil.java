package com.tuniu.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.Context;
import android.util.Log;

public final class ReadFileUtil
{
	public static String ReadTxtFile(Context context, String strFilePath)
	{
		String text = "";
		String line = "";
		try {  
			//Return an AssetManager instance for your application's package  
            InputStream is = context.getResources().getAssets().open(strFilePath);  
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            
            BufferedReader br = new BufferedReader(isr);
            while ((line = br.readLine()) != null) {
                text += line + "\n";
            }
            is.close();
            isr.close();
            br.close();
            // Finally stick the string into the text view. 
        } catch (IOException e) {
        	Log.e("error", "传入文件路径错误!");
            // Should never happen!  
            throw new RuntimeException(e);  
        } 
		return text;
	}
}
