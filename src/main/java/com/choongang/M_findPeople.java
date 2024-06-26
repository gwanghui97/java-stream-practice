package com.choongang;
import java.util.*;
import java.util.stream.*;

public class M_findPeople {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        // TODO:
        return Stream.concat(male.stream(), female.stream())
                .distinct()
                .filter(people -> people.startsWith(lastName))
                .sorted()
                .collect(Collectors.toList());
    }
}
