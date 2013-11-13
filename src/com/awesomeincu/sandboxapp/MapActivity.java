package com.awesomeincu.sandboxapp;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

public class MapActivity extends Activity {
	  private GoogleMap gMap;

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_map);
	    
	    gMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
	        .getMap();
	  }
}