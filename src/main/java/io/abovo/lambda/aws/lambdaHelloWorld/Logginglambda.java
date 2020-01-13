package io.abovo.lambda.aws.lambdaHelloWorld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logginglambda {

    private static final Logger LOG = LoggerFactory.getLogger(Logginglambda.class);

    public void handler(String input) {
        LOG.info("Hello log, {}", input);
    }

}


