package com.tuniu.fragment;

import com.tuniu.activity.R;
import com.tuniu.utils.MyBaseAdapter;
import com.tuniu.utils.MyListView4ScrollView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class DestinationFragment extends Fragment {

	private View view;
	private LayoutInflater inflater;
	private MyListView4ScrollView listLeft;
	private MyListView4ScrollView listRight;

	public DestinationFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		this.inflater = inflater;
		if (view == null) {
			view = inflater.inflate(R.layout.fragment_destination, container, false);
			initData();
			initUI();
		}
		return view;
	}

	private void initData() {
		
	}

	private void initUI() {
		listLeft = (MyListView4ScrollView) view.findViewById(R.id.mlv4sv_destination_tip1);
		listRight = (MyListView4ScrollView) view.findViewById(R.id.mlv4sv_destination_tip2);
		MyListAdapter leftAdapter = new MyListAdapter(true, 50);
		MyListAdapter rightAdapter = new MyListAdapter(false, 50);
		listLeft.setAdapter(leftAdapter);
		listRight.setAdapter(rightAdapter);
		
		listLeft.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	class MyListAdapter extends MyBaseAdapter{
		private boolean isLeft;
		private int num;

		public MyListAdapter(boolean isLeft, int num) {
			this.isLeft = isLeft;
			this.num = num;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return num;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TextView textView = new TextView(getContext());
			textView.setText("" + position);
			return textView;
		}
	}

}
