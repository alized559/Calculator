package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    private EditText result, input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        result = findViewById(R.id.result);
        input = findViewById(R.id.textInput);
        Button clear = findViewById(R.id.clearBtn);
        Button equal = findViewById(R.id.equalBtn);

        Button[] numberBtns = new Button[]{
                findViewById(R.id.oneBtn), findViewById(R.id.twoBtn), findViewById(R.id.threeBtn),
                findViewById(R.id.fourBtn), findViewById(R.id.fiveBtn), findViewById(R.id.sixBtn),
                findViewById(R.id.sevenBtn), findViewById(R.id.eightBtn), findViewById(R.id.nineBtn),
                findViewById(R.id.pointBtn), findViewById(R.id.zeroBtn)
        };

        Button[] operatorBtns = new Button[]{
                findViewById(R.id.divideBtn), findViewById(R.id.minusBtn), findViewById(R.id.plusBtn),
                findViewById(R.id.multipleBtn)
        };

        for (Button btn : numberBtns) {
            btn.setOnClickListener(view -> Calculate.number(btn, input));
        }

        for (Button btn : operatorBtns) {
            btn.setOnClickListener(view -> Calculate.operator(btn, input));
        }

        equal.setOnClickListener(view -> {
            Calculate.equal(input);
            result.setText(String.valueOf(Calculate.getResult()));
        });

        clear.setOnClickListener(view -> {
            Calculate.clear(input);
            result.setText("");
        });
    }
}