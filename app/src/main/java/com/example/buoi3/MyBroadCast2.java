package com.example.buoi3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCast2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String km = intent.getExtras().getString("KM");
        if (km.equals("MEM537128")) {
            Toast.makeText(context, "Khuyến mại 10%", Toast.LENGTH_SHORT).show();
        } else if (km.equals("MEM537129")) {
            Toast.makeText(context, "Khuyến mại 20%", Toast.LENGTH_SHORT).show();
        } else if (km.equals("VIP537128")) {
            Toast.makeText(context, "Khuyến mại 30%", Toast.LENGTH_SHORT).show();
        } else if (km.equals("VIP537129")) {
            Toast.makeText(context, "Khuyến mại 50%", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Không có khuyến mại!", Toast.LENGTH_SHORT).show();
        }
    }
}
