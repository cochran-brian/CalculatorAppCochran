package com.example.calculatorappcochran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    double output = 0.0;
    int indexCount = 0;
    String key = "";
    ArrayList<String> strList = new ArrayList<>();
    ArrayList<Double> numList = new ArrayList<>();
    public void concatValue(int num) {
        if(num == -2){
            strList.set(indexCount, strList.get(indexCount) + ".");
            numList.set(indexCount, Double.parseDouble(strList.get(indexCount)));
            displayValue(strList.get(indexCount));
        }
        else if(num == -1){
            strList.set(indexCount, "-" + strList.get(indexCount));
            numList.set(indexCount, Double.parseDouble(strList.get(indexCount)));
            displayValue(strList.get(indexCount));
        }
        else {
            strList.set(indexCount, strList.get(indexCount) + num);
            numList.set(indexCount, Double.parseDouble(strList.get(indexCount)));
            displayValue(strList.get(indexCount));
        }
    }

    public void concatValue(String str) {
        strList.set(indexCount, strList.get(indexCount) + str);
        displayValue(strList.get(indexCount));
    }

    public void displayValue(String str) {
        TextView display = findViewById(R.id.textDisplay);
        display.setText(str);
    }


    public void onClick(View v) {
        if(v.getId() == R.id.buttonDivide){
            if(numList.size() == 2) {
                numList.set(0, (numList.get(0) / numList.get(1));
                strList.set(0, numList(0).toString());
                displayValue(strList.get(0));
            } else {
                indexCount++;
                key = "d";
            }
        }
        else if(v.getId() == R.id.buttonMultiply){
            if(numList.size() == 2) {
                numList.set(0, (numList.get(0) * numList.get(1));
                strList.set(0, numList(0).toString());
                displayValue(strList.get(0));
            } else {
                indexCount++;
                key = "m"
            }
        }
        else if(v.getId() == R.id.buttonAdd){
            if(numList.size() == 2) {
                numList.set(0, (numList.get(0) + numList.get(1));
                strList.set(0, numList(0).toString());
                displayValue(strList.get(0));
            } else {
                indexCount++;
                key="a";
            }
        }
        else if(v.getId() == R.id.buttonSubtract){
            if(numList.size() == 2) {
                numList.set(0, (numList.get(0) - numList.get(1));
                strList.set(0, numList(0).toString());
                displayValue(strList.get(0));
            } else {
                indexCount++;
                key = "s";
            }
        }
        else if(v.getId() == R.id.buttonEquals){
            if(key.equals("d")) {
                numList.set(0, (numList.get(0) / numList.get(1));
                strList.set(0, numList(0).toString());
                displayValue(strList.get(0));
            }
            else if(key.equals("m")) {
                numList.set(0, (numList.get(0) * numList.get(1));
                strList.set(0, numList(0).toString());
                displayValue(strList.get(0));
            }
            else if(key.equals("a")) {
                numList.set(0, (numList.get(0) + numList.get(1));
                strList.set(0, numList(0).toString());
                displayValue(strList.get(0));
            }
            else {
                numList.set(0, (numList.get(0) - numList.get(1));
                strList.set(0, numList(0).toString());
                displayValue(strList.get(0));
            }
        }
        else {
            concatValue(numSelected(v));
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


}