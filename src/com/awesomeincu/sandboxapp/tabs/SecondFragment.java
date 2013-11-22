package com.awesomeincu.sandboxapp.tabs;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.awesomeincu.sandboxapp.MyListAdapter;
import com.awesomeincu.sandboxapp.R;

public class SecondFragment extends Fragment {
	 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);

		ListView listView = (ListView) rootView.findViewById(R.id.list);
		List<String> items = new ArrayList<String>();
		for(int index=0; index < 100; index++) {
			items.add("Item: "+index);
		}
		listView.setAdapter(new MyListAdapter(getActivity(), items));
		
        return rootView;
    }
}