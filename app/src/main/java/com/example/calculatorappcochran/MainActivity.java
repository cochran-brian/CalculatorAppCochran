package com.example.calculatorappcochran;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
            return "C";
        }
    }

    public void onClickMethod(View v) {
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
            if(subtract < 0 && add < 0 && divide < 0 && multiply < 0) {
                return;
            }
            display.setText("" + result);
        }
        else if(numSelected(v).equals("C")) {
            display.setText("");
        }
        else {
            String result = numSelected(v);
            if(numSelected(v).equals("/")) {
                if (display.getText().toString().contains("/")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("/")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("/"))) /
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("/")+1)));
                    display.setText(result + "/");
                    return;
                }
                if (display.getText().toString().contains("*")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("*")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("*"))) *
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("*")+1)));
                    display.setText(result + "/");
                    return;
                }
                if (display.getText().toString().contains("+")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("+")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("+"))) +
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("+")+1)));
                    display.setText(result + "/");
                    return;
                }
                if (display.getText().toString().contains("-")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("-")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("-"))) -
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("-")+1)));
                    display.setText(result + "/");
                    return;
                }
            }
            if(numSelected(v).equals("*")) {
                if (display.getText().toString().contains("/")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("/")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("/"))) /
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("/")+1)));
                    display.setText(result + "*");
                    return;
                }
                if (display.getText().toString().contains("*")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("*")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("*"))) *
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("*")+1)));
                    display.setText(result + "*");
                    return;
                }
                if (display.getText().toString().contains("+")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("+")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("+"))) +
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("+")+1)));
                    display.setText(result + "*");
                    return;
                }
                if (display.getText().toString().contains("-")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("-")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("-"))) -
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("-")+1)));
                    display.setText(result + "*");
                    return;
                }
            }
            if(numSelected(v).equals("+")) {
                if (display.getText().toString().contains("/")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("/")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("/"))) /
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("/")+1)));
                    display.setText(result + "+");
                    return;
                }
                if (display.getText().toString().contains("*")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("*")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("*"))) *
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("*")+1)));
                    display.setText(result + "+");
                    return;
                }
                if (display.getText().toString().contains("+")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("+")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("+"))) +
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("+")+1)));
                    display.setText(result + "+");
                    return;
                }
                if (display.getText().toString().contains("-")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("-")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("-"))) -
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("-")+1)));
                    display.setText(result + "+");
                    return;
                }
            }
            if(numSelected(v).equals("-")) {
                if (display.getText().toString().contains("/")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("/")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("/"))) /
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("/")+1)));
                    display.setText(result + "-");
                    return;
                }
                if (display.getText().toString().contains("*")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("*")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("*"))) *
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("*")+1)));
                    display.setText(result + "-");
                    return;
                }
                if (display.getText().toString().contains("+")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("+")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("+"))) +
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("+")+1)));
                    display.setText(result + "-");
                    return;
                }
                if (display.getText().toString().contains("-")) {
                    if(display.getText().toString().substring(display.getText().toString().indexOf("-")+1).length() < 1){
                        return;
                    }
                    result = "" + (Double.parseDouble(display.getText().toString().substring(0, display.getText().toString().indexOf("-"))) -
                            Double.parseDouble(display.getText().toString().substring(display.getText().toString().indexOf("-")+1)));
                    display.setText(result + "-");
                    return;
                }
            }
            display.setText("" + display.getText() + result);
        }
    }

}