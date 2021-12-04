package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    private EditText result, input;
    private Button clear, equal;
    private Button[] numberBtns, operatorBtns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        result = findViewById(R.id.result);
        input = findViewById(R.id.textInput);
        clear = findViewById(R.id.clearBtn);
        equal = findViewById(R.id.equalBtn);

        numberBtns = new Button[] {
                findViewById(R.id.oneBtn), findViewById(R.id.twoBtn), findViewById(R.id.threeBtn),
                findViewById(R.id.fourBtn), findViewById(R.id.fiveBtn), findViewById(R.id.sixBtn),
                findViewById(R.id.sevenBtn), findViewById(R.id.eightBtn), findViewById(R.id.nineBtn),
                findViewById(R.id.pointBtn), findViewById(R.id.zeroBtn)
        };

        operatorBtns = new Button[] {
                findViewById(R.id.divideBtn), findViewById(R.id.minusBtn), findViewById(R.id.plusBtn),
                findViewById(R.id.multipleBtn)
        };

        for (int i = 0; i < numberBtns.length; i++) {
            Button btn = numberBtns[i];
            btn.setOnClickListener(view -> {
                Calculate.number(btn, input);
            });
        }

        for (int i = 0; i < operatorBtns.length; i++) {
            Button btn = operatorBtns[i];
            btn.setOnClickListener(view -> {
                Calculate.operator(btn, input);
            });
        }

        equal.setOnClickListener(view -> {
            Calculate.equal(input);
            result.setText(String.valueOf(Calculate.getResult()));
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate.clear(input);
                result.setText("");
            }
        });
    }
}