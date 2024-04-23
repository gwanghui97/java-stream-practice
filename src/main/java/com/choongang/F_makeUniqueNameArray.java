package com.choongang;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class F_makeUniqueNameArray {
    public String[] makeUniqueNameArray(List<String> names) {
        // TODO:
        // list -> stream
        // 중복 제거
        // 정렬 (오름차순)
        // 배열로 변환
        // 리턴
        return names.stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
