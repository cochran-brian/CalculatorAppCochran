package com.example.calculatorappcochran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

//    double output;
//    int indexCount;
//    String key;
//    String[] strList;
//    double[] numList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        strList = new String[2];
//        numList = new double[2];
//        key = "";
//        output = 0.0;
//        indexCount = 0;
    }


//    public void concatValue(int num) {
//        if(num == -2){
//            strList[indexCount] = strList[indexCount] + ".";
//            numList[indexCount] = Double.parseDouble(strList[indexCount]);
//            displayValue(strList[indexCount]);
//        }
//        else if(num == -1){
//            strList[indexCount] = "-" + strList[indexCount];
//            numList[indexCount] = Double.parseDouble(strList[indexCount]);
//            displayValue(strList[indexCount]);
//        }
//        else {
//            strList[indexCount] = strList[indexCount] + num;
//            numList[indexCount] = Double.parseDouble(strList[indexCount]);
//            displayValue(strList[indexCount]);
//        }
//    }
//
//    public void concatValue(String str) {
//        strList[indexCount] = strList[indexCount] + str;
//        displayValue(strList[indexCount]);
//    }
//
//    public void displayValue(String str) {
//        TextView display = findViewById(R.id.textDisplay);
//        display.setText(str);
//    }
//
//
//    public void onClickMethod(View v) {
//        if(v.getId() == R.id.buttonDivide){
//            if(numList.length == 2) {
//                numList[0] = (numList[0] / numList[1]);
//                strList[0] = "" + numList[0];
//                displayValue(strList[0]);
//            } else {
//                indexCount++;
//                key = "d";
//            }
//        }
//        else if(v.getId() == R.id.buttonMultiply){
//            if(numList.length == 2) {
//                numList[0] = (numList[0] * numList[1]);
//                strList[0] = "" + numList[0];
//                displayValue(strList[0]);
//            } else {
//                indexCount++;
//                key = "m";
//            }
//        }
//        else if(v.getId() == R.id.buttonAdd){
//            if(numList.length == 2) {
//                numList[0] = (numList[0] + numList[1]);
//                strList[0] = "" + numList[0];
//                displayValue(strList[0]);
//            } else {
//                indexCount++;
//                key="a";
//            }
//        }
//        else if(v.getId() == R.id.buttonSubtract){
//            if(numList.length == 2) {
//                numList[0] = (numList[0] - numList[1]);
//                strList[0] = "" + numList[0];
//                displayValue(strList[0]);
//            } else {
//                indexCount++;
//                key = "s";
//            }
//        }
//        else if(v.getId() == R.id.buttonEquals){
//            if(key.equals("d")) {
//                numList[0] = (numList[0] / numList[1]);
//                strList[0] = "" + numList[0];
//                displayValue(strList[0]);
//            }
//            else if(key.equals("m")) {
//                numList[0] = (numList[0] / numList[1]);
//                strList[0] = "" + numList[0];
//                displayValue(strList[0]);
//            }
//            else if(key.equals("a")) {
//                numList[0] = (numList[0] / numList[1]);
//                strList[0] = "" + numList[0];
//                displayValue(strList[0]);
//            }
//            else {
//                numList[0] = (numList[0] / numList[1]);
//                strList[0] = "" + numList[0];
//                displayValue(strList[0]);
//            }
//        }
//        else {
//            concatValue(numSelected(v));
//        }
//    }
//
    public String numSelected(View v) {
        if(v.getId() == R.id.button0){
            return "0";
        }
        else if(v.getId() == R.id.button1){
            return "1";
        }
        else if(v.getId() == R.id.button2){
            return "2";
        }
        else if(v.getId() == R.id.button3){
            return "3";
        }
        else if(v.getId() == R.id.button4){
            return "4";
        }
        else if(v.getId() == R.id.button5){
            return "5";
        }
        else if(v.getId() == R.id.button6){
            return "6";
        }
        else if(v.getId() == R.id.button7){
            return "7";
        }
        else if(v.getId() == R.id.button8){
            return "8";
        }
        else if(v.getId() == R.id.button9){
            return "9";
        }
        else if(v.getId() == R.id.buttonDot) {
            return ".";
        }
        else if(v.getId() == R.id.buttonAdd){
            return "+";
        }
        else if(v.getId() == R.id.buttonSubtract){
            return "-";
        }
        else if(v.getId() == R.id.buttonMultiply){
            return "*";
        }
        else if(v.getId() == R.id.buttonDivide){
            return "/";
        }
        else {
            return "~"; // negative symbol
        }
    }

    public void onButtonClickEvent(View v) {
        TextView display = findViewById(R.id.textDisplay);
        if(v.getId() == R.id.buttonEquals) {
            double result = 0.0;
            int divide = display.getText().toString().indexOf("/");
            int multiply = display.getText().toString().indexOf("*");
            int add = display.getText().toString().indexOf("+");
            int subtract = display.getText().toString().indexOf("-");
            if(divide > -1) {
                result = Double.parseDouble(display.getText().toString().substring(0, divide)) /
                        Double.parseDouble(display.getText().toString().substring(divide+1));
            } if(multiply > -1) {
                result = Double.parseDouble(display.getText().toString().substring(0, multiply)) *
                        Double.parseDouble(display.getText().toString().substring(multiply+1));
            } if(add > -1) {
                result = Double.parseDouble(display.getText().toString().substring(0, add)) +
                        Double.parseDouble(display.getText().toString().substring(add+1));
            } if(subtract > -1) {
                result = Double.parseDouble(display.getText().toString().substring(0, subtract)) -
                        Double.parseDouble(display.getText().toString().substring(subtract+1));
            }
            display.setText("" + result);
        } else {
            display.setText("" + display.getText() + numSelected(v));
        }
    }

}