package com.marienbergapp;
import com.marienbergapp.App.onLocationChangeListener;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity implements onLocationChangeListener{

	App app;
	TextView textview1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		app = (App) getApplication();
		app.setOnLocationChangeListener(this);
		textview1=(TextView) findViewById(R.id.textView1);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		switch (id) {
		case R.id.action_settings: {
			
			startActivity(new Intent(MainActivity.this, SettingsActivity.class));
			
			break;
		}
		case R.id.action_list: {
			
			startActivity(new Intent(MainActivity.this, ListActivity.class));
			
			break;
		}
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onLocationChange(Location location) {
		textview1.append(location.toString());		
	}
}
