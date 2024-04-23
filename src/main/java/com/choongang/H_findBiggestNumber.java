package com.choongang;
import java.util.*;

public class H_findBiggestNumber {
    public Integer findBiggestNumber(int[] arr) {
        // TODO:
        return Arrays.stream(arr).boxed()
                .max(Comparator.comparing(x -> x))
                .orElse(null);
    }
}
