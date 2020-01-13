package io.abovo.lambda.aws.lambdaHelloWorld;

import java.util.HashMap;
import java.util.Map;

public class MapInputOutput {

    public Map<String, String> handler(Map<String, String> input) {
        Map<String, String> newMap = new HashMap<>();
        input.forEach((k,v) -> newMap.put("New Map ->" + k, v));
        return newMap;
    }
}
