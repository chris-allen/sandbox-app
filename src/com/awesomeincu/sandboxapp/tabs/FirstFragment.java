package com.awesomeincu.sandboxapp.tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.awesomeincu.sandboxapp.MapActivity;
import com.awesomeincu.sandboxapp.R;

public class FirstFragment extends Fragment {
	 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

    	Button button = (Button) rootView.findViewById(R.id.button);
    	button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent mIntent = new Intent(getActivity(), MapActivity.class);
				getActivity().startActivity(mIntent);
			}
		});
         
        return rootView;
    }
}