package com.example.calculator;

import android.widget.Button;
import android.widget.EditText;

public class Calculate {

    private static double result;
    private static String oldNumber;
    private static String operator;

    public static double getResult() {
        return result;
    }

    public static void number(Button btnClicked, EditText input) {
        String number = btnClicked.getText().toString();
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
}
