package com.example.calculator;

import android.widget.Button;
import android.widget.EditText;

public class Calculate {

    private static double result;
    private static String oldNumber;
    private static String number = "";
    private static String operator;

    public static double getResult() {
        return result;
    }

    public static void number(Button btnClicked, EditText input) {
        String number = input.getText().toString();
        switch(btnClicked.getId()) {
            case R.id.oneBtn:
                number += "1";
                break;
            case R.id.twoBtn:
                number += "2";
                break;
            case R.id.threeBtn:
                number += "3";
                break;
            case R.id.fourBtn:
                number += "4";
                break;
            case R.id.fiveBtn:
                number += "5";
                break;
            case R.id.sixBtn:
                number += "6";
                break;
            case R.id.sevenBtn:
                number += "7";
                break;
            case R.id.eightBtn:
                number += "8";
                break;
            case R.id.nineBtn:
                number += "9";
                break;
            case R.id.zeroBtn:
                number += "0";
                break;
            case R.id.pointBtn:
                number += ".";
                break;
        }
        input.setText(number);
    }

    public static void operator(Button btnClicked, EditText input) {
        oldNumber = input.getText().toString();
        operator = btnClicked.getText().toString();
    }

    public static void equal(Button equal, EditText input) {
        String newNumber = input.getText().toString();
        switch(operator) {
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
        }
    }

    public static void clear(EditText input) {
        input.setText("");
        oldNumber = "";
        number = "";
        operator = "";
        result = 0;
    }
}
