package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Calculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        calculator = new Calculator();

        Button button0 = findViewById(R.id.buttonnull);
        Button button1 = findViewById(R.id.buttonone);
        Button button2 = findViewById(R.id.buttontwo);
        Button button3 = findViewById(R.id.buttonthree);
        Button button4 = findViewById(R.id.buttonfour);
        Button button5 = findViewById(R.id.buttonfive);
        Button button6 = findViewById(R.id.buttonsix);
        Button button7 = findViewById(R.id.buttonseven);
        Button button8 = findViewById(R.id.buttoneight);
        Button button9 = findViewById(R.id.buttonnine);
        Button buttonAdd = findViewById(R.id.buttonplus);
        Button buttonSubtract = findViewById(R.id.buttonminus);
        Button buttonMultiply = findViewById(R.id.buttonumn);
        Button buttonDivide = findViewById(R.id.buttondel);
        Button buttonEquals = findViewById(R.id.buttonravno);
        Button buttonC = findViewById(R.id.buttonC);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                textView.setText(currentText + "9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                calculator.setNum1(Double.parseDouble(currentText));
                calculator.setOperator("+");
                textView.setText("");
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                calculator.setNum1(Double.parseDouble(currentText));
                calculator.setOperator("-");
                textView.setText("");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                calculator.setNum1(Double.parseDouble(currentText));
                calculator.setOperator("*");
                textView.setText("");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                calculator.setNum1(Double.parseDouble(currentText));
                calculator.setOperator("/");
                textView.setText("");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                calculator.setNum2(Double.parseDouble(currentText));
                double result = calculator.getResult();
                textView.setText(String.valueOf(result));
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                calculator = new Calculator();
            }
        });
    }
}