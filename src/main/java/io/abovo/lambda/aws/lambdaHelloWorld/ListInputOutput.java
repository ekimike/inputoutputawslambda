package io.abovo.lambda.aws.lambdaHelloWorld;

import java.util.ArrayList;
import java.util.List;

public class ListInputOutput {

    /**
     * [3,4,5]
     * @param input
     * @return
     */
    public List<Integer> handler(List<Integer> input) {
        List<Integer> newList = new ArrayList<>();
        input.forEach(x -> newList.add(100 + x));
        return newList;
    }
}
