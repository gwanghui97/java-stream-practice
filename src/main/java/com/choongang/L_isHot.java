package com.choongang;
import java.util.*;

public class L_isHot {
    public boolean isHot(int[] temperature) {
        // TODO:
        // 배열 내의 숫자는 온도, 그 중 30이 넘은 것을 남겨야 함
        // 남은 요소의 갯수가 3개 이상인 경우 true else false;
        long hotDays = Arrays.stream(temperature)
                .filter(temp -> temp >= 30)
                .count();
        return hotDays >= 3;
    }
}
