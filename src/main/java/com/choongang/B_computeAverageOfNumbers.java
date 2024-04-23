package com.choongang;
import java.util.*;

public class B_computeAverageOfNumbers {
    public double computeAverageOfNumbers(List<Integer> list) {
        // TODO:

        return list.stream()
                .mapToDouble(m -> m)
                .average()
                .orElse(0.0);
    }
}
