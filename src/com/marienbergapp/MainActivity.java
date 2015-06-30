package com.marienbergapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	int a = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
			case R.id.action_add: {
				a++;
				Toast.makeText(getApplicationContext(), ""+a, Toast.LENGTH_SHORT).show();
				break;
			}
		}
		return super.onOptionsItemSelected(item);
	}
}
