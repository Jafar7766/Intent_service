package com.example.intent_service;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///
        Button start = findViewById(R.id.start);
        Button stop = findViewById(R.id.stop);
        TextView service = findViewById(R.id.service);

        start.setOnClickListener(view -> {
            Intent intent = new Intent(this, ServiceIntent.class);
            startService(intent);
            service.setText("Running");

        });
        stop.setOnClickListener(view -> {
            ServiceIntent.stopService();
            service.setText("Stop");
        });
    }
}