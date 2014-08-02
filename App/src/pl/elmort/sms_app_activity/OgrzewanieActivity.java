package pl.elmort.sms_app_activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
//import android.media.RingtoneManager;

public class OgrzewanieActivity extends Activity 
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ogrzewanie);
	}
	
	WyslijSMS SendSMS = new WyslijSMS(); //obiekt utworzonej klasy "WyslijSMS" w pliku "WyslijSMS.java"
	
	public void Strefa1(View v)
	{
		Toast.makeText(this, "W��czam ogrzewanie w strefie 1", Toast.LENGTH_LONG).show();
		
		//sprawdzi� jak b�dzie zachowywa�a si� aplikacja przy innym formacie wpisywania nr telefonu
		//lub spsrawdzi� w dokumentacji
		boolean success = SendSMS.WyslijWiadomosc("608-033-974", "1");
		if (success)
		{
			//zmiana koloru przycisku na pod�wietlony
		}
		/*
		 * odbieranie sms z potwierdzeniem od arduino
			zamiast toastu mo�na u�y� Notifications
		*/
	}
	public void Strefa1_off(View v)
	{
		Toast.makeText(this, "Wy��czam ogrzewanie w strefie 1", Toast.LENGTH_LONG).show();
		SendSMS.WyslijWiadomosc("608-033-974", "2");
		//odbieranie sms z potwierdzeniem od arduino- 
	}
	
	
	public void koniec(View v)
	{
		finish();
	}
	

}
