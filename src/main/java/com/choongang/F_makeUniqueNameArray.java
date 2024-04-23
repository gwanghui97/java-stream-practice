package com.choongang;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class F_makeUniqueNameArray {
    public String[] makeUniqueNameArray(List<String> names) {
        // TODO:
        return names.stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
