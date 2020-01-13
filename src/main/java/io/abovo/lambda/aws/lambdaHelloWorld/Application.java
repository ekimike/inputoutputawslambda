package io.abovo.lambda.aws.lambdaHelloWorld;

/**
 * Add a handler, which is a method in the code
 * that will be invoked by the platform whenever
 * an event is received for a particular Lambda.
 */
public class Application {

    public String handler(String input) {
        String message = String.format("Hello, %s", input);
        System.out.println(message);
        return message;
    }

}