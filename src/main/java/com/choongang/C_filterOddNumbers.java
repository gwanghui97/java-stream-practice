package com.choongang;
import java.util.*;
import java.util.stream.*;

public class C_filterOddNumbers {
    public List<Integer> filterOddNumbers(List<Integer> list) {
        // TODO:
        return list.stream()
                .filter(el -> el % 2 == 0)
                .collect(Collectors.toList());
    }
}
