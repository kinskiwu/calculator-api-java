package com.kinski.calculator_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h1>Calculator API Application</h1>
 * <p>
 * This is the main entry point for the Calculator API, a Spring Boot application that provides a
 * RESTful service for basic arithmetic operations. It starts the embedded server and initializes
 * the Spring application context.
 * </p>
 *
 * <h3>Usage:</h3>
 *
 * <pre>
 *     mvn spring-boot:run
 * </pre>
 * <p>
 * The application will run on the default port (8080) unless configured otherwise in
 * <code>application.properties</code>. This class initializes the context required to expose the
 * API endpoints.
 * </p>
 *
 * @author Kinski Wu
 * @version 0.0.1-SNAPSHOT
 * @since 1.0
 */
@SpringBootApplication
public class CalculatorApiApplication {

	/**
	 * <p>
	 * The main method serves as the entry point for the Spring Boot application.
	 * </p>
	 * <p>
	 * It triggers the {@link SpringApplication#run(Class, String[])} method to start the embedded web
	 * server and load the Spring context.
	 * </p>
	 *
	 * <h3>Command-Line Example:</h3>
	 *
	 * <pre>
	 * java -jar calculator-api.jar
	 * </pre>
	 *
	 * @param args Command-line arguments, typically not required for this application. These can be
	 *        used to customize the startup behavior if needed.
	 */
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApiApplication.class, args);
	}
}
