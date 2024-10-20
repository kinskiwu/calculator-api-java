package com.kinski.calculator_api.model;

/**
 * Represents the result of a calculation performed by the Calculator API. This class serves as a
 * Data Transfer Object (DTO) to encapsulate the result.
 *
 * <p>
 * Example usage:
 *
 * <pre>
 * CalculationResult result = new CalculationResult(42.0);
 * System.out.println("Result: " + result.getResult());
 * </pre>
 * </p>
 *
 * @author Kinski Wu
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class CalculationResult {

    /** The numerical result of the calculation. */
    private double result;

    /**
     * Constructs a new {@code CalculationResult} with the given result value.
     *
     * @param result The result of the calculation.
     */
    public CalculationResult(double result) {
        this.result = result;
    }

    /**
     * Returns the result of the calculation.
     *
     * @return The calculated result as a {@code double}.
     */
    public double getResult() {
        return result;
    }
}
