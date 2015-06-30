package com.marienbergapp;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class GPSModul {
	
	void initGPS(final App app)
	{
		
		
		LocationManager locationManager = (LocationManager) app.getSystemService(Context.LOCATION_SERVICE);
		
		if(locationManager.getAllProviders() != null)
		{
			app.GpsAvaible = true;
			
		}
		
		locationManager.requestLocationUpdates(
		LocationManager.GPS_PROVIDER, 0, 1, new LocationListener() {
			
			@Override
			public void onStatusChanged(String provider, int status, Bundle extras) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProviderEnabled(String provider) {

				app.GpsAvaible = true;
			}
			
			@Override
			public void onProviderDisabled(String provider) {
				app.GpsAvaible = false;
				
				
			}
			
			@Override
			public void onLocationChanged(Location location) {
				
				app.currentPosition=location;
				
				
			}
		});
	}
	
}
