package com.choongang;
import java.util.*;
import java.util.stream.Collectors;

public class D_computeCountOfFemaleMember {
    public long computeCountOfFemaleMember(List<Member> members){
        // TODO:
        return members.stream()
                .filter(Member -> Member.getGender().equals("Female"))
                .count();
    }

    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

    }
}
