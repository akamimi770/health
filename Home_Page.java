package com.example.hp.womenshealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_Page extends AppCompatActivity {
    Button bmi,priod,teenage,pregnancy,childcare,oldage,womenscancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        bmi();
        priod();

    }


    public void bmi(){

        bmi=(Button)findViewById(R.id.bmi);
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), BMI_Activity.class);
                startActivity(i);
            }
        });
    }

    public void priod(){

        priod=(Button)findViewById(R.id.priodButton);
        priod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Priod_Activity.class);
                startActivity(i);
            }
        });

    }
}
