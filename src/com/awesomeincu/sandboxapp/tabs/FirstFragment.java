package com.awesomeincu.sandboxapp.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.awesomeincu.sandboxapp.R;
import com.nostra13.universalimageloader.core.ImageLoader;

public class FirstFragment extends Fragment {

	private String imageUrl = "http://lparchive.org/Darkwing-Duck/Images/darkwing_duck.jpg";
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        final View rootView = inflater.inflate(R.layout.fragment_first, container, false);

    	Button button = (Button) rootView.findViewById(R.id.button);
    	button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ImageView image = (ImageView) rootView.findViewById(R.id.image);
				ImageLoader.getInstance().displayImage(imageUrl, image);
			}
		});
         
        return rootView;
    }
}