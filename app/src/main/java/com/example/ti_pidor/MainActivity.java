package com.example.ti_pidor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.text.*;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btn = (Button) findViewById(R.id.button2);
       final TextView textView = (TextView) findViewById(R.id.textView);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double rnd = Math.random();
               if(rnd>0.5){
                   textView.setText("Ti pidor esli ti ne Roma :)");
               }
               else{
                   textView.setText("Ti utochka");
               }
           }
       });




        //Button button2 = new Button();
    }
}