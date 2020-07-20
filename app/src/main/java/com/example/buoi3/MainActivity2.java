package com.example.buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = findViewById(R.id.edt);

    }

    public void send(View view) {
        String a = editText.getText().toString();
        Intent intent = new Intent("SUKIENA");
        intent.putExtra("A", "\n"+ a);
        sendBroadcast(intent);
//        Intent intent2 = new Intent(MainActivity2.this,MainActivity.class);
//        startActivity(intent2);
    }
}