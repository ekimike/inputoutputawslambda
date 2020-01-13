package io.abovo.lambda.aws.lambdaHelloWorld;

public class PojoInputOutput {

    public PojoResponse handler(PojoInput input) {
        return new PojoResponse("Input was " + input.getA());
    }
}
