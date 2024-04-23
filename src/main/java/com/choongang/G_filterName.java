package com.choongang;
import java.util.*;

public class G_filterName {
    public String[] filterName(List<String> names) {
        // TODO:
        return names.stream()
                .distinct()
                .filter(n -> n.startsWith("김"))
                .sorted()
                .toArray(String[]::new);
    }
}
