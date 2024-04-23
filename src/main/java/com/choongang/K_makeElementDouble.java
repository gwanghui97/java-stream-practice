package com.choongang;
import java.util.*;
import java.util.stream.*;

public class K_makeElementDouble {
    public List<Integer> makeElementDouble(List<Integer> list) {
        // TODO:
        return list.stream()
                .map(el -> el * 2)
                .collect(Collectors.toList());
    }
}
