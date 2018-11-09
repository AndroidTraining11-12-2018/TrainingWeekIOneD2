package com.mobileapps.trainingweekioned2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView tvShowInfoFromET;
    EditText etInfoToShowInTV;
    Button btnSendInfo;
    DatePicker simpleDatePicker;
    TextView tvDateSelected;
    TimePicker simpleTimePicker;
    TextView tvTimeSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvShowInfoFromET = findViewById(R.id.tvTextFromET);
        etInfoToShowInTV = findViewById(R.id.etTextToTV);
        btnSendInfo = findViewById(R.id.btnSendText);
        simpleDatePicker = findViewById(R.id.simpleDatePicker);
        simpleDatePicker.setSpinnersShown(false);
        tvDateSelected = findViewById(R.id.tvDate);
        simpleTimePicker = findViewById(R.id.simpleTimePicker);
        tvTimeSelected = findViewById(R.id.tvTime);
    }

    public void buttonOnClick(View view) {
        String text = etInfoToShowInTV.getText().toString();
        tvShowInfoFromET.setText(text);
    }

    public void setDateDisplay(View view) {
        String selectedMonth =  "Month = " + (simpleDatePicker.getMonth() + 1);
        String selectedDay = "Day = " + simpleDatePicker.getDayOfMonth();
        String selectedYear = "Year = " + simpleDatePicker.getYear();
        String displayString = selectedMonth  + selectedDay +  selectedYear;

        tvDateSelected.setText(displayString);
    }

    public void setTimeDisplay(View view) {
        int hourSelected = simpleTimePicker.getCurrentHour();
        int minuteSelected = simpleTimePicker.getCurrentMinute();
        String displayTimeString = "Time: " + hourSelected + ":" + minuteSelected;
        tvTimeSelected.setText(displayTimeString);
    }
}
