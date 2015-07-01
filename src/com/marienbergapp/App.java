package com.marienbergapp;

import java.util.ArrayList;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;

public class App extends Application {

	boolean GpsAvaible = false;
	private Location currentPosition;
	private ArrayList<Spot> spots = new ArrayList<Spot>();
	private onLocationChangeListener locListener;
	private LocationManager locationManager;

	public void checkForGps() {
		if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
			startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
	}

	public void onCreate() {
		locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

		GpsAvaible = (locationManager.getAllProviders() != null);

		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0,
				1, new LocationListener() {

					@Override
					public void onStatusChanged(String provider, int status,
							Bundle extras) {
						// TODO Auto-generated method stub
					}

					@Override
					public void onProviderEnabled(String provider) {
						GpsAvaible = true;
					}

					@Override
					public void onProviderDisabled(String provider) {
						GpsAvaible = false;
					}

					@Override
					public void onLocationChanged(Location location) {
						currentPosition = location;
						if (locListener != null)
							locListener.onLocationChange(location);
					}
				});

	}

	public Location getCurrentPosition() {
		return currentPosition;
	}

	public ArrayList<Location> getSpotPositions() {
		return new ArrayList<Location>();
	}

	public ArrayList<Spot> getSpots() {
		return spots;
	}

	/*
	 * public void setSpots(ArrayList<Location> spots) { this.spots = spots; }
	 */

	public void setOnLocationChangeListener(onLocationChangeListener locListener) {
		this.locListener = locListener;
	}

	public interface onLocationChangeListener {
		void onLocationChange(Location location);

	}
}
