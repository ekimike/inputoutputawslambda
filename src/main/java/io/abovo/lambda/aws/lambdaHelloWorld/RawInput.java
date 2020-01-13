package io.abovo.lambda.aws.lambdaHelloWorld;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class RawInput {

    public void handler(InputStream is, OutputStream os) throws IOException {
        int letter;

        while((letter = is.read()) != -1) {
            os.write(Character.toUpperCase(letter));
        }
    }
}
