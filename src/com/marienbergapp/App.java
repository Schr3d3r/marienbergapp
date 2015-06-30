package com.marienbergapp;

import java.util.ArrayList;

import android.app.Application;
import android.location.Location;

public class App extends Application {

	//Activities:
	//MainActivity
	//ListActivity
	//SettingActivity
	boolean GpsAvaible = false;
	GPSModul gpsmodul= new GPSModul();
	Location currentPosition;
	ArrayList<Location> spots = new ArrayList<Location>();
	
	public void onCreate() {
		gpsmodul.initGPS(this);
	}
}
