package com.example.calculator;

import android.util.Log;
public class Calculator {
    private double num1;
    private double num2;
    private String operator;

    public Calculator() {
        num1 = 0;
        num2 = 0;
        operator = "";
    }

    public void setNum1(double num) {
        this.num1 = num;
    }

    public void setNum2(double num) {
        this.num2 = num;
    }

    public void setOperator(String op) {
        this.operator = op;
    }

    public double getResult() {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}