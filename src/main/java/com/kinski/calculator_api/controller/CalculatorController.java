package com.kinski.calculator_api.controller;

import com.kinski.calculator_api.model.CalculationRequest;
import com.kinski.calculator_api.model.CalculationResult;
import com.kinski.calculator_api.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/calculate")
    public CalculationResult calculate(@RequestBody CalculationRequest request) {
        double result = calculatorService.performOperation(
                request.getNum1(), request.getNum2(), request.getOperator());
        return new CalculationResult(result);
    }
}
