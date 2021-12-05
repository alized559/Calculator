package com.example.calculator;

import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class Calculate {

    private static String result = "";
    private static boolean nextNumber;
    private static String oldNumber = "";
    private static String number = "";
    private static String operator = "";

    public static String getResult() {
        return result;
    }

    public static void number(Button btnClicked, EditText input) {
        if (nextNumber)
            input.setText("");
        nextNumber = false;
        number = input.getText().toString();
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
        nextNumber = true;
        oldNumber = input.getText().toString();
        switch(btnClicked.getId()) {
            case R.id.plusBtn:
                operator = "+";
                break;
            case R.id.minusBtn:
                operator = "-";
                break;
            case R.id.multipleBtn:
                operator = "*";
                break;
            case R.id.divideBtn:
                operator = "/";
                break;
        }
    }

    public static void equal(EditText input) {
        String newNumber = input.getText().toString();
        double r = 0;
        int r1 = 0;
        if (!result.equals(""))
            oldNumber = result;
        if (oldNumber.contains(".") || newNumber.contains(".")) {
            if (operator.equals("/")) {
                r = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
            }
            if (operator.equals("*")) {
                r = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
            }
            if (operator.equals("+")) {
                r = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
            }
            if (operator.equals("-")) {
                r = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
            }
            result = String.valueOf(r);
        } else {
            if (operator.equals("/")) {
                if (Integer.parseInt(oldNumber) % Integer.parseInt(newNumber) == 0)
                    r1 = Integer.parseInt(oldNumber) / Integer.parseInt(newNumber);
                else {
                    r = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                    result = String.valueOf(r);
                    return;
                }
            }
            if (operator.equals("*")) {
                r1 = Integer.parseInt(oldNumber) * Integer.parseInt(newNumber);
            }
            if (operator.equals("+")) {
                r1 = Integer.parseInt(oldNumber) + Integer.parseInt(newNumber);
            }
            if (operator.equals("-")) {
                r1 = Integer.parseInt(oldNumber) - Integer.parseInt(newNumber);
            }
            result = String.valueOf(r1);
        }
//        switch(operator) {
//            case "+":
//                result = Integer.parseInt(oldNumber) + Integer.parseInt(newNumber);
//                break;
//            case "-":
//                result = Integer.parseInt(oldNumber) - Integer.parseInt(newNumber);
//                break;
//            case "*":
//                result = Integer.parseInt(oldNumber) * Integer.parseInt(newNumber);
//                break;
//            case "/":
//                result = Integer.parseInt(oldNumber) / Integer.parseInt(newNumber);
//                break;
//        }
    }

    public static void clear(EditText input) {
        input.setText("");
        oldNumber = "";
        number = "";
        operator = "";
        result = "";
    }
}
