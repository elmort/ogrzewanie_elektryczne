package pl.elmort.sms_app_activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.media.RingtoneManager;

public class OgrzewanieActivity extends Activity 
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ogrzewanie);
	}
	
	WyslijSMS SendSMS = new WyslijSMS();
	
	public void Strefa1(View v)
	{
		boolean success = SendSMS.WyslijWiadomosc("608-033-974", "1");
		if(success)
		{	//do likwidacji operator tr�jargumentowy
			Toast.makeText(this, "Wysy�anie wiadomo�ci zako�czone " + (
    		success ? "sukcesem" : "pora�k�"), 
    		Toast.LENGTH_SHORT).show();
			//zamiast toastu mo�na u�y� Notifications
		}
	}
	Rin
	
	public void koniec(View v)
	{
		finish();
	}
	

}
