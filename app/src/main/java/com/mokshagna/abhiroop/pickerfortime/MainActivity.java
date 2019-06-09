package com.mokshagna.abhiroop.pickerfortime;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"TimePicker");
    }

    public void processTimePicked(int hours,int minutes){
        String message = hours+":"+minutes;
        Toast.makeText(getApplicationContext(),"Time Picked: "+message,Toast.LENGTH_SHORT).show();
    }
}
