package com.example.newnotification;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationManagerCompat;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent != null){
        Bundle extras = intent.getBundleExtra("requestCode");
        if (extras != null) {
        int notificationId = extras.getInt("notificationId", -1);
            Log.d("TAGA", "onReceive: " + notificationId);
        }else{
            Log.d("TAGA", "extras null");

        }
    }else{
            Log.d("TAGA", "intent null");

        }

//        if(requestCode.equals("001")){
//            Log.d("TAG1", "onReceive: left");
//        }
//        if(requestCode.equals("002") ){
//            Log.d("TAG2", "onReceive: right");
//        }


        Toast.makeText(context,  "GOT Xxxxxx", Toast.LENGTH_SHORT).show();

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.cancel(0);
    }


}