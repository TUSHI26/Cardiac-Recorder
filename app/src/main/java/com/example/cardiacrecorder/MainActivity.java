package com.example.cardiacrecorder;

/**
 * creating the splash screen for apps
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * set time for splash screen
     */
    private static int splash_time = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * taking a handler for make delay for splash screen
         * create an intent for making delay and then go home page
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,homepage.class);
                startActivity(intent);
                finish();
            }
        },splash_time);

    }
}
