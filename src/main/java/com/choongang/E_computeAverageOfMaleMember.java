package com.choongang;
import java.util.*;

public class E_computeAverageOfMaleMember {
    public double computeAverageOfMaleMember(List<Member> members) {
        // TODO:
        return members.stream()
                .filter(member -> member.getGender().equals("Male"))
                .mapToInt(member -> member.getAge())
                .average()
                .orElse(0.0);
    }

    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
