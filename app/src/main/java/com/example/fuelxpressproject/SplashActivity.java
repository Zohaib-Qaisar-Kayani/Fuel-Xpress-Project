package com.example.fuelxpressproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.TextView;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // to remove the title / navigation / status bar on splash screen
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // accessing the text View " Fuel Xpress Project "
        TextView textView = findViewById(R.id.textSplashScreen);
        textView.animate().translationX(1000).setDuration(1000).setStartDelay(2500);

        // move from splash screen to main Activity ( home / dashboard / welcome screen )
//        Thread thread = new Thread() {
//            public void run() {
//                try {
//                    Thread.sleep(4000);
//                }
//                catch(Exception e) {
//                    e.printStackTrace();
//                }
//
//                finally {
//                    Intent intent = new Intent(SplashActivity.this , WelcomeActivity.class);
//                    startActivity(intent);
//                    finish(); // splash Activity to finish from memory ( cannot be loaded and exit on back button )
//                }
//            }
//        };
//
//        thread.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000); // 4000 milliseconds delay
    }
}