package com.kinski.calculator_api.model;

/**
 * A data transfer object (DTO) representing the input for arithmetic operations. Holds two numeric
 * values and an operator to define the calculation.
 *
 * <h2>Example JSON Request:</h2>
 *
 * <pre>
 * {
 *   "num1": 10,
 *   "num2": 5,
 *   "operator": "+"
 * }
 * </pre>
 *
 * <p>
 * Supported operators: +, -, *, /, %, ^
 * </p>
 *
 * @author Kinski Wu
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class CalculationRequest {

    private double num1; // First operand
    private double num2; // Second operand
    private char operator; // Arithmetic operator

    /**
     * Gets the value of {@code num1}.
     *
     * @return The first operand.
     */
    public double getNum1() {
        return num1;
    }

    /**
     * Sets the value of {@code num1}.
     *
     * @param num1 The first operand.
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * Gets the value of {@code num2}.
     *
     * @return The second operand.
     */
    public double getNum2() {
        return num2;
    }

    /**
     * Sets the value of {@code num2}.
     *
     * @param num2 The second operand.
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * Gets the operator used for the calculation.
     *
     * @return A character representing the operator.
     */
    public char getOperator() {
        return operator;
    }

    /**
     * Sets the operator for the calculation.
     *
     * @param operator One of +, -, *, /, %, ^.
     */
    public void setOperator(char operator) {
        this.operator = operator;
    }
}
