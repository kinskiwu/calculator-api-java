package com.kinski.calculator_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Global exception handler for the Calculator API. This class uses {@link RestControllerAdvice} to
 * centralize exception handling across all controllers in the application. It catches specific
 * exceptions and returns appropriate HTTP status codes and error messages.
 *
 * <p>
 * By handling exceptions in this way, we ensure that the API returns meaningful error responses to
 * the client, improving user experience and debuggability.
 * </p>
 *
 * <h2>Handled Exceptions:</h2>
 * <ul>
 * <li>{@link ArithmeticException}: Thrown when an arithmetic error occurs, such as division by
 * zero.</li>
 * <li>{@link IllegalArgumentException}: Thrown when an invalid operator or argument is
 * provided.</li>
 * </ul>
 *
 * <p>
 * Example Response:
 * </p>
 *
 * <pre>
 * HTTP/1.1 400 Bad Request
 * Content-Type: text/plain
 *
 * Cannot divide by zero
 * </pre>
 *
 * @author Kinski Wu
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
@RestControllerAdvice
public class CalculatorExceptionHandler {

    /**
     * Handles {@link ArithmeticException} and returns a 400 Bad Request status.
     *
     * <p>
     * This method catches arithmetic errors, such as division by zero, and returns the error
     * message to the client as plain text.
     * </p>
     *
     * @param e The caught {@code ArithmeticException}.
     * @return A plain text message describing the arithmetic error.
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleArithmeticException(ArithmeticException e) {
        return e.getMessage();
    }

    /**
     * Handles {@link IllegalArgumentException} and returns a 400 Bad Request status.
     *
     * <p>
     * This method catches invalid arguments, such as unsupported operators, and returns the error
     * message to the client as plain text.
     * </p>
     *
     * @param e The caught {@code IllegalArgumentException}.
     * @return A plain text message describing the invalid argument.
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleIllegalArgumentException(IllegalArgumentException e) {
        return e.getMessage();
    }
}
