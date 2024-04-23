package com.choongang;
import java.util.*;

public class B_computeAverageOfNumbers {
    public double computeAverageOfNumbers(List<Integer> list) {
        // TODO:

        return list.isEmpty() ? 0 : list.stream()
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
    }
}
