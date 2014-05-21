package pl.elmort.sms_app_activity;


import android.telephony.SmsManager;


//klasa odpowiedzialna za wysy�anie SMS
public class WyslijSMS 
{
	SmsManager mSMSManager = null;
	WyslijSMS() {
		mSMSManager = SmsManager.getDefault();
	}
	 String mServiceCentreAddr = null;
	 //metoda klasy SmsManager do wysy�ania Sms
	public boolean WyslijWiadomosc (String numerTelefonu, String tekstWiadomosci)
	{
		mSMSManager.sendTextMessage(numerTelefonu, mServiceCentreAddr, tekstWiadomosci, null, null);
		return true;
	}
}
