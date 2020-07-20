package com.example.buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText edkm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.text);
        edkm = findViewById(R.id.edkm);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            //Khoonge sử lý tác vụ quá 3s
            @Override
            public void onReceive(Context context, Intent intent) {
                String a = intent.getStringExtra("A");
                tv1.setText("Đã nhận sự kiện A: "+a);
            }
        };
        IntentFilter intentFilter = new IntentFilter("SUKIENA");
        registerReceiver(broadcastReceiver,intentFilter);
    }

    public void Open(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void check(View view) {
        String maKM = edkm.getText().toString();
        Intent intent = new Intent(MainActivity.this, MyBroadCast2.class);
        intent.putExtra("KM", maKM);
        sendBroadcast(intent);
    }
}