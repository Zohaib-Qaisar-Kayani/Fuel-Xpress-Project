package com.example.fuelxpressproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    // click back event for Register
    public void onButtonRegisterClicked ( View view) {
        Intent intent = new Intent( WelcomeActivity.this , RegisterActivity.class);
        startActivity(intent);
    }


    // click back event for Login
    public void onButtonLoginClicked ( View view) {
        Intent intent = new Intent(WelcomeActivity.this , LoginActivity.class);
        startActivity(intent);
    }
}