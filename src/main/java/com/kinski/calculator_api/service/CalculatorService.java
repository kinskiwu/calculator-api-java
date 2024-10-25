package com.kinski.calculator_api.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double performOperation(double num1, double num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0)
                    throw new ArithmeticException("Cannot divide by zero");
                yield num1 / num2;
            }
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
