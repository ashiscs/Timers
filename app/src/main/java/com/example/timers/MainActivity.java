package com.example.timers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000){

            public void onTick(long sec){

                // Countdown is counting down every second
                Log.i("Seonds Left",String.valueOf(sec/1000));

            }
            public void onFinish(){

                // Counter is finished !
                Log.i("Done!","Countdown Finished");
            }
        }.start();
        /*final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Runnable has run!","a second must have passed...");

                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);
        */
    }
}
