package com.example.calculator;

import android.widget.Button;
import android.widget.EditText;

public class Calculate {

    private String result;
    private static String oldNumber;
    private static String operator;

    public static void number(Button btnClicked, EditText input) {
        String number = btnClicked.getText().toString();
        input.setText(number);
    }

    public static void operator(Button btnClicked, EditText input) {
        oldNumber = input.getText().toString();
        operator = btnClicked.getText().toString();
    }


}
