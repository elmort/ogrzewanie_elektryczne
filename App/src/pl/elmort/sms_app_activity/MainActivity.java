package pl.elmort.sms_app_activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void ustawienia(View v)
	{
		Intent ustaw = new Intent(this, UstawieniaActivity.class);
		startActivity(ustaw);
	}
	
	public void ogrzewanie(View v) 
	{
		Intent ogrz = new Intent(this, OgrzewanieActivity.class);
		startActivity(ogrz);
	}
	
	public void sabotaz(View v)
	{
		
	}

}
