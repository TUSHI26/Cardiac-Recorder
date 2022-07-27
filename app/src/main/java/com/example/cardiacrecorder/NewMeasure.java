package com.example.cardiacrecorder;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class NewMeasure extends AppCompatActivity {
    /**
     * taking every element which want to records in database
     */

    EditText systolic,diastolic,pulse;
    Button submit;
    TextView date, time;
    String comment;
    /**
     * taking a user helper variables for pushing data into database
     */
   UserHelper helper= new UserHelper();

DatabaseReference reference,ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_measure);

        /**
         * taking every variables id and make them dynamic
         */

        systolic = findViewById(R.id.systolic);
        diastolic = findViewById(R.id.diastolic);
        pulse = findViewById(R.id.pulse);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);
        submit = findViewById(R.id.button3);


        /**
         * take calender from instance for current date which will be automatically applied on the apps
         */

        Calendar calendar=Calendar.getInstance();
        String currentDate= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        date.setText(""+currentDate);


        /**
         * take time from instance for current time which will be automatically applied on  apps
         */
        Calendar calendar1=Calendar.getInstance();
        SimpleDateFormat currentTime = new SimpleDateFormat("hh:mm:ss");
        String time1 =currentTime.format(calendar1.getTime());
        //Toast.makeText(NewMeasure.this,currentDate+time1,Toast.LENGTH_SHORT).show();

        time.setText(time1);
        /**
         * taking firebase database as references
         */
        reference=FirebaseDatabase.getInstance().getReference().child("data");



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // reference.child("data").addListenerForSingleValueEvent(new ValueEventListener() {

                /**
                 * getting value from user
                 */

                String sys =systolic.getText().toString();
                        String dias=diastolic.getText().toString();
                        String pul=pulse.getText().toString();

                        Integer sysvalue = Integer.parseInt(sys);
                        Integer diasvalue = Integer.parseInt(dias);
                        Integer pulvalue = Integer.parseInt(pul);


                /**
                 * check the value of systolic and diastolic and make a comment applying some condition over them
                 */
                        if(sysvalue<=150 && sysvalue>=100 && diasvalue>=60 && diasvalue<=100 && pulvalue<=100) {

                            if(sysvalue<=110 || diasvalue<=70){
                                comment = "low pressure";

                            }

                            else if(sysvalue<=120 || diasvalue<=80){
                                comment = "normal";


                            }
                            else if( sysvalue<= 130 || diasvalue<=90  )
                            {
                                comment = "high pressure";


                            }
                            else if (sysvalue<=140 || diasvalue <=100){
                                comment = "high pressure stage 1";

                            }
                            else if (sysvalue<=150 || diasvalue <=100) {
                                comment = "high pressure stage 2";

                            }
                            else{
                                Toast.makeText(NewMeasure.this,"Invalid data", Toast.LENGTH_SHORT).show();

                            }

                            /**
                             * pushing the value of systolic diastolic pulse date and time into user helper
                             *
                             */
                            helper.setSystol(sys);
                            helper.setDiastol(dias);
                            helper.setPuls(pul);
                            helper.setDate(currentDate);
                            helper.setTime(time1);
                            helper.setComment(comment);
                            reference.push().setValue(helper);
                            Log.e(TAG, "onClick: "+helper.getDate() );

                            /**
                             * make an intent for going to homepage from  this class
                             */
                            Intent intent = new Intent(NewMeasure.this,homepage.class);
                            startActivity(intent);

                            


                    }}

                    });

                }
            }
