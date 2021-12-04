package com.example.calculator;

import android.widget.Button;
import android.widget.EditText;

public class Calculate {

    private String result;
    private String oldNumber;
    private String operator;

    public static void number(Button btnClicked, EditText input) {
        String number = btnClicked.getText().toString();
        input.setText(number);
    }

    public static void operator() {

    }
}
