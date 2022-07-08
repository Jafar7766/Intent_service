package com.example.intent_service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServiceIntent extends IntentService {
    public static Boolean isRunning = false;
    public static ServiceIntent instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public ServiceIntent() {
        super("MyIntentService");
    }

    public static void stopService() {
        Log.d("InstanceService", "Service is Stop...");
        isRunning = false;
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            isRunning = true;
            while (isRunning) {
                Log.d("InstanceService", "Service is Run...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException o) {
            Thread.currentThread().interrupt();
        }
    }
}
