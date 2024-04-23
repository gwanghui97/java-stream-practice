package com.choongang;
import java.util.*;
import java.util.stream.Collectors;

public class D_computeCountOfFemaleMember {
    public long computeCountOfFemaleMember(List<Member> members){
        // TODO:
        // 여자만 체크해서 여자의 총 수를 구해 반환 (long)
        return members.stream()
                .filter(member -> member.getGender().equals("Female"))
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
