package com.kinski.calculator_api.controller;

import com.kinski.calculator_api.model.CalculationRequest;
import com.kinski.calculator_api.model.CalculationResult;
import com.kinski.calculator_api.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for handling calculator operations.
 * This controller exposes an endpoint to perform arithmetic operations
 * based on the request provided.
 *
 * <p>Example endpoint:</p>
 * <pre>
 * POST /api/calculator/calculate
 * Content-Type: application/json
 *
 * Request Body:
 * {
 *   "num1": 5,
 *   "num2": 3,
 *   "operator": "+"
 * }
 *
 * Response Body:
 * {
 *   "result": 8.0
 * }
 * </pre>
 *
 * <p>This controller relies on {@link CalculatorService} to perform the actual operations.</p>
 *
 * @author Kinski Wu
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    /**
     * Constructs a new {@code CalculatorController} with the provided service.
     *
     * @param calculatorService The service responsible for performing arithmetic operations.
     */
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    /**
     * Endpoint to perform arithmetic operations.
     *
     * <p>Receives a JSON request containing two operands and an operator, performs the specified
     * operation, and returns the result as a {@link CalculationResult} object.</p>
     *
     * <p>Supported operators include: +, -, *, /, %, ^</p>
     *
     * @param request The calculation request containing two numbers and an operator.
     * @return A {@link CalculationResult} object containing the result of the operation.
     */
    @PostMapping("/calculate")
    public CalculationResult calculate(@RequestBody CalculationRequest request) {
        double result = calculatorService.performOperation(
                request.getNum1(), request.getNum2(), request.getOperator());
        return new CalculationResult(result);
    }
}
