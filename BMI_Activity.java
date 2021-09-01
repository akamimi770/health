package com.example.hp.womenshealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI_Activity extends AppCompatActivity {


    TextView tvResult;
    EditText etheight,etweight;
    Button cal,backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_);
        tvResult = (TextView) findViewById(R.id.tvShow);
        etheight = (EditText) findViewById(R.id.etHeight);
        etweight = (EditText) findViewById(R.id.etWeight);
        cal = (Button) findViewById(R.id.btnCal);


        backButton();

    }






    public  void show(View view)
    {


        float fHeight=Float.valueOf(etheight.getText().toString());
        float fWeight=Float.valueOf(etweight.getText().toString());

        if(fHeight>=12 && fHeight<=96 && fWeight>0 && fWeight<=200) {

            double result = ((fWeight*2.2) / (fHeight * fHeight))*703;

            if (result < 18.5) {
                tvResult.setText("Your BMI is lessthen 18.5. You'r too sick. Need more Nutrition Food");
            } else if (18.5 <= result && result <= 24.9) {
                tvResult.setText("Your BMI is under (18.5-24.9).You have Normal weight");
            } else if (25 <= result && result <= 29.99) {
                tvResult.setText("Your BMI is under (25-29.99). You'r Over weight need to control Diet");
            } else {
                tvResult.setText("Your BMI is getter then 30.You'r too fat. Get hurry to control your weight");
            }
        }

        else
        {
            Toast.makeText(getBaseContext(),"Please Enter Valid Height and Weight\n Range:\nWeight: 1 to 200\nHeight: 12 inch to 96 inch", Toast.LENGTH_SHORT).show();
        }

    }


    public void backButton(){

        backButton=(Button)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Home_Page.class);
                startActivity(i);
            }
        });
    }



}
