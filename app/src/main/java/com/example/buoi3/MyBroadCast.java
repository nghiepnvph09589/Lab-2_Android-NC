package com.example.buoi3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class MyBroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, intent.getAction(), Toast.LENGTH_SHORT).show();
        if (intent.getExtras()!=null){
            String state = intent.getExtras().getString(TelephonyManager.EXTRA_STATE);
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String phone = intent.getExtras().getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Toast.makeText(context, phone,Toast.LENGTH_SHORT).show();
            }
        }


    }
}
