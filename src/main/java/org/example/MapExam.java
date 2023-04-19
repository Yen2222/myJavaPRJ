package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name","이예은");
        map.put("email","lyebh1234@gmail.com");
        map.put("dept", "데이터분석과");

        System.out.println("조회결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));

        //set 중복 허용X -> 순서에 상관 없이 저장

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }) ;
    }
}
