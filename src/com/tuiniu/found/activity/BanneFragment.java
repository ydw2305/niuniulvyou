package com.tuiniu.found.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.tuniu.activity.R;
import com.xinbo.utils.UILUtils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class BanneFragment extends Fragment {

	private String imgUrl;

	public BanneFragment(String imgUrl) {
		this.imgUrl = imgUrl;
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.fragment_banne, container, false);
		ImageView mImageView = (ImageView) layout.findViewById(R.id.img_banner);
		UILUtils.displayImage(imgUrl, mImageView);
		return layout;
	}

}
