package pl.elmort.sms_app_activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;


public class OdbiornikSMS extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		Bundle bundle = intent.getExtras();
		SmsMessage[] msgs = null;
		String message = "";
		if(bundle != null){
			Object[] pdus = (Object[]) bundle.get("pdus");
			msgs = new SmsMessage[pdus.length];
			
			for(int i=0; i<msgs.length; i++)
			{
				msgs[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
				message = msgs[i].getMessageBody();
				
				if(msgs[i].getMessageBody().equalsIgnoreCase("Aj"))
				{
					Toast.makeText(context,"test",Toast.LENGTH_SHORT).show();
					//Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(context, "b³¹d", Toast.LENGTH_LONG).show();
				}
				
			}
			
			
		}
		// TODO Auto-generated method stub

	}

}
