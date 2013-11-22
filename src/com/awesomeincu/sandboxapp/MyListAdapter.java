package com.awesomeincu.sandboxapp;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {
	
	private Context mContext;
	private List<String> items;
	
	public MyListAdapter(Context ctx, List<String> list) {
		mContext = ctx;
		items = list;
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View recycledView, ViewGroup parent) {
		TextView v = (TextView) recycledView;
		
		if(v == null) {
			v = new TextView(mContext);
		}

		v.setText(items.get(position));
		
		
		return v;
	}

}
