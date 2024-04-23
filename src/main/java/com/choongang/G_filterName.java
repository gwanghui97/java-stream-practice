package com.choongang;
import java.util.*;

public class G_filterName {
    public String[] filterName(List<String> names) {
        // TODO:
        // list -> stream
        // 중복 제거
            //김씨 성을 가진 사람만 골라야 함
        // 정렬 (오름차순)
        // 배열로 변환
        // 리턴
        return names.stream()
                .distinct()
                .filter(str -> str.startsWith("김"))
                .sorted()
                .toArray(String[]::new);
    }
}
