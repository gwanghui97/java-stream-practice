package com.choongang;
import java.util.*;

public class I_findLongestLength {
    public int findLongestLength(String[] strArr) {
        // TODO:
        // 배열에 문자열이 여러개 요소로 있음
        // 여기서 가장 긴 문자열의 길이를 반환해야 함

        // 스트림을 만들고
        // max() 사용 -> 스트림의 요소가 숫자여야 하겠군!
        // 문자열을 순회하면서 각 요소를 문자열의 길이로 바꾼 후,
        // max() 사용해서 가장 큰 수를 반환하면 되겠구나!
        return Arrays.stream(strArr)
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }
}
