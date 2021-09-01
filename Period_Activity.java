package com.example.hp.womenshealth;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class Priod_Activity extends AppCompatActivity {

    Button date_button;
    TextView date_display;
    Calendar calendar=Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priod_);
        datepicker();

    }

    private void datepicker() {
        date_display=(TextView)findViewById(R.id.textView_display);
        date_button=(Button)findViewById(R.id.button_date);

        date_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new DatePickerDialog(Priod_Activity.this,listener, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                date_display.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
            }
        };





    }
}
