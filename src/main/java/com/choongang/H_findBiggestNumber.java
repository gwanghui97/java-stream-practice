package com.choongang;
import java.util.*;

public class H_findBiggestNumber {
    public Integer findBiggestNumber(int[] arr) {
        // TODO:
        // 배열을 받아서 가장 큰 수를 반환
        if (arr.length == 0) {
            return null;
        }

        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }
}
