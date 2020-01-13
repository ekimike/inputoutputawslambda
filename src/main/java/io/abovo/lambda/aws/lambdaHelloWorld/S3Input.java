package io.abovo.lambda.aws.lambdaHelloWorld;


import com.amazonaws.services.lambda.runtime.events.S3Event;

public class S3Input {

    public void handler(S3Event input) {
        System.out.println("S3: "+ input.getRecords()
                .get(0)
                .getS3()
        .getObject()
        .getKey());

    }
}
