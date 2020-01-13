package io.abovo.lambda.aws.lambdaHelloWorld;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class NestedStructures {

    /**
     * [
     *     {
     *         "m":1,
     *         "n":2
     *     },
     *     {
     *         "x":8,
     *         "y":9
     *     }
     * ]
     * @param input
     * @return
     */
    public Map<String, Map<String, Integer>> handler(List<Map<String, Integer>> input) {
        Map<String, Map<String, Integer>> newMap = new HashMap<>();
        IntStream.range(0, input.size())
                .forEach( i -> newMap.put("Nested position " + i, input.get(i)));

        return newMap;
    }
}
