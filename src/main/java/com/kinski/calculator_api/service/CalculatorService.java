package com.kinski.calculator_api.service;

import org.springframework.stereotype.Service;

/**
 * Service class that handles arithmetic operations for the Calculator API. This class contains
 * logic to perform common operations such as addition, subtraction, multiplication, division,
 * modulus, and exponentiation.
 *
 * <p>
 * This service is stateless and can be reused across multiple API requests.
 * </p>
 *
 * <h2>Supported Operators:</h2>
 * <ul>
 * <li>{@code +}: Addition</li>
 * <li>{@code -}: Subtraction</li>
 * <li>{@code *}: Multiplication</li>
 * <li>{@code /}: Division (throws {@link ArithmeticException} if dividing by zero)</li>
 * <li>{@code %}: Modulus</li>
 * <li>{@code ^}: Exponentiation</li>
 * </ul>
 *
 * <p>
 * Example usage:
 * </p>
 *
 * <pre>
 * CalculatorService service = new CalculatorService();
 * double result = service.performOperation(5, 3, '+');
 * System.out.println("Result: " + result); // Output: 8.0
 * </pre>
 *
 * @author Kinski Wu
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
@Service
public class CalculatorService {

    /**
     * Performs the specified arithmetic operation on two numbers.
     *
     * <p>
     * The operation is determined by the provided operator, and the following operations are
     * supported: +, -, *, /, %, and ^.
     * </p>
     *
     * @param num1 The first operand.
     * @param num2 The second operand.
     * @param operator The operator determining the operation. Must be one of: +, -, *, /, %, ^.
     * @return The result of the operation as a {@code double}.
     * @throws ArithmeticException If division by zero is attempted.
     * @throws IllegalArgumentException If an invalid operator is provided.
     */
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
