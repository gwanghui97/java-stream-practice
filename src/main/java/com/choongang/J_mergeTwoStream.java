package com.choongang;
import java.util.*;
import java.util.stream.*;

public class J_mergeTwoStream {
    public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        // TODO:
        Stream<String> stringStream1 = list1.stream();
        Stream<String> stringStream2 = list2.stream();

        Stream<String> concat = Stream.concat(stringStream1, stringStream2);
        String[] array = concat.toArray(String[]::new);
        List<String> list = Arrays.asList(array);

        return list;
    }
}
