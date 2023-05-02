package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("이예은");
        list.add("홍길동");
        list.add("임꺽정");
        list.add(" ");

        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("");
        System.out.println("1세대 반복문");

        System.out.println("");
        for(int i = 0; i< listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }
        // list의 개수를 세야 하며, 반복문을 돌려야하기 때문에 또 돌아가야 함
        // 총 listSize X 2를 연산해야 함.
        System.out.println("");
        System.out.println("2세대 반복문");
        System.out.println("");

        for(String name : list){ // : => list에 있는 값을 가져옴 (String에 적혀놓은 name을 list 형태로 가져온다는 것
            System.out.println("이름 : " + name);
        }

        System.out.println("");

        System.out.println("3세대 반복문");
        System.out.println("");

        list.forEach(name -> System.out.println("name : " + name));
        System.out.println("");

        System.out.println("4세대 반복문");
        System.out.println("");

        list.parallelStream().forEach(name -> System.out.println("name : " + name));
        System.out.println("");

        System.out.println("1.5세대 반복문");
        System.out.println("");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }

    }
}
//기본키
// unique : null 값이 허용  / 중복 안 됨
// pk : null 값이 허용되지 않음 / 중복 안 됨