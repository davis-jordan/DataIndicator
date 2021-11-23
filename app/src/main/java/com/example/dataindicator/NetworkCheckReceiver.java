package com.example.dataindicator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;

public class NetworkCheckReceiver extends BroadcastReceiver {
    private static final String TAG = "NetworkCheckReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            Log.d(TAG, "NetworkCheckReceiver invoked...");

            boolean noConnectivity = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);

            if (!noConnectivity) {
                Log.d(TAG, "connected");
            }
            else {
                Log.d(TAG, "disconnected");
            }
        }
    }

}
