package com.tuniu.fragment.home_childs;

import com.tuniu.activity.R;
import com.tuniu.utils.Constants;
import com.xinbo.utils.UILUtils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class ViewPagerFragment extends Fragment implements OnClickListener
{

	private View view;
	private ImageView miv;
	private String imgurl;

	public ViewPagerFragment()
	{
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		if (view == null)
		{
			view = inflater.inflate(R.layout.fragment_viewpager, container, false);
			miv = (ImageView) view.findViewById(R.id.iv_house_pager);
			miv.setOnClickListener(this);
		}
		Bundle bundle = getArguments();
		String imgsrc = (String) bundle.getSerializable(Constants.IMGSRC);
		imgurl = (String) bundle.getSerializable(Constants.IMGURL);
		UILUtils.displayImage(imgsrc, miv);
		return view;
	}

	@Override
	public void onClick(View v)
	{
//		Intent intent = new Intent(getContext(), WebActivity.class);
//		intent.putExtra(Constants.URL, imgurl);
//		startActivity(intent);
	}

}
