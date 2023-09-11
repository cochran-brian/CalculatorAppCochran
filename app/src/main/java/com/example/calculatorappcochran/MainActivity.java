package com.example.calculatorappcochran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean isFirst = true;
    public void onClick(View v) {
        if(v.getId() == R.id.buttonDivide){
            isFirst = false;
        }
        else if(v.getId() == R.id.buttonMultiply){
            isFirst = false;
        }
        else if(v.getId() == R.id.buttonAdd){
            isFirst = false;
        }
        else if(v.getId() == R.id.buttonSubtract){
            isFirst = false;
        }
        else if(v.getId() == R.id.buttonEquals){

        }
        else {
            concatNum(numSelected(v));
            displayValue();
        }
    }

    public int numSelected(View v) {
        if(v.getId() == R.id.button0){
            return 0;
        }
        else if(v.getId() == R.id.button1){
            return 1;
        }
        else if(v.getId() == R.id.button2){
            return 2;
        }
        else if(v.getId() == R.id.button3){
            return 3;
        }
        else if(v.getId() == R.id.button4){
            return 4;
        }
        else if(v.getId() == R.id.button5){
            return 5;
        }
        else if(v.getId() == R.id.button6){
            return 6;
        }
        else if(v.getId() == R.id.button7){
            return 7;
        }
        else if(v.getId() == R.id.button8){
            return 8;
        }
        else if(v.getId() == R.id.button9){
            return 9;
        }
        else if(v.getId() == R.id.buttonDot) {
            return -2;
        }
        else {
            return -1;
        }
    }

    String primaryNumStr = "";
    double primaryNum = 0.0;
    public void concatNum(int num) {
        if(isFirst) {
            if(num == -2){
                primaryNumStr += ".";
                primaryNum = Double.parseDouble(primaryNumStr);
            }
            else if(num == -1){
                primaryNumStr = "-" + primaryNumStr;
            }
            else {
                primaryNumStr += num;
                primaryNum = Double.parseDouble(primaryNumStr);
            }
        }
        else {
            // make able to have infinite operations
        }

    }

    public void displayValue() {
        TextView display = findViewById(R.id.textDisplay);
        display.setText(primaryNumStr);
    }

}