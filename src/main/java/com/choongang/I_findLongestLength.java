package com.choongang;
import java.util.*;

public class I_findLongestLength {
    public int findLongestLength(String[] strArr) {
        // TODO:
        return Arrays.stream(strArr)
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }
}
