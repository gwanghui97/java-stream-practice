package com.choongang;
import java.util.*;
import java.util.stream.*;

public class M_findPeople {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        // TODO:
        Stream<String> maleStream = male.stream();
        Stream<String> femaleStream = female.stream();

        Stream<String> concat = Stream.concat(maleStream, femaleStream);

        return concat.distinct()
                .filter(n -> n.startsWith(lastName))
                .sorted()
                .collect(Collectors.toList());
    }
}
