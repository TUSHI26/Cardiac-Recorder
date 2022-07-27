package com.example.cardiacrecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        /**
         * checking if the data is connect or not
         */

        Toast.makeText(homepage.this,"data connected",Toast.LENGTH_SHORT).show();

        /**
         * taking id of create new measure
         * and creating an intent for new measure page
         */
        Button createMeasure= findViewById(R.id.createNewMeasure);
        createMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this,NewMeasure.class);
                startActivity(intent);
            }
        });
/**
 * taking id for history and create intent for measurement page
 */
        Button history = findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this,MeasureList.class);
                startActivity(intent);
            }
        });
    }
}