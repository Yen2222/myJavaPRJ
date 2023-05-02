package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz_05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        for(int i=0; i<5; i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
        list.forEach(sort -> System.out.print(sort+" "));
//        for(Integer i : list){
//            System.out.print(i+" ");
//        }
    }
}
