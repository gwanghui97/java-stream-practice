package com.choongang;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_computeSumOfAllElements {
    public int computeSumOfAllElements(List<Integer> list) {
        // TODO:
        return list.stream()
                .mapToInt(number -> number)
                .sum();
    }
}
