package com.tuniu.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FoundSearchActivity extends Activity implements OnClickListener
{
	private ArrayList<String> taglist=new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		initUI();
	}

	private void initUI()
	{
		ListView taglist = (ListView) findViewById(R.id.listView1);
		findViewById(R.id.textView3).setOnClickListener(this);;
		SearchTagAdapter tagAdapter = new SearchTagAdapter();
		taglist.setAdapter(tagAdapter);
	}
	class SearchTagAdapter extends BaseAdapter{

		@Override
		public int getCount()
		{
			return 10;
		}

		@Override
		public Object getItem(int position)
		{
			return null;
		}

		@Override
		public long getItemId(int position)
		{
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent)
		{
			View inflate =null;
			if (convertView==null)
			{
				inflate= getLayoutInflater().inflate(R.layout.search_tag_item, null);
			}else {
				inflate=convertView;
			}
			TextView tag= (TextView) inflate.findViewById(R.id.textView1);
			return inflate;
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
		case R.id.textView3:
			finish();
			break;
		default:
			break;
		}
	}
}
