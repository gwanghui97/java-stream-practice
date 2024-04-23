package com.choongang;
import java.util.*;

public class L_isHot {
    public boolean isHot(int[] temperature) {
        // TODO:
        long num = Arrays.stream(temperature)
                .filter(n -> n >= 30)
                .count();

        if (num >= 3) {
            return true;
        }
        return false;
    }
}
