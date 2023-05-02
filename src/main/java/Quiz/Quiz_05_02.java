package Quiz;

import java.util.LinkedList;
import java.util.Scanner;

public class Quiz_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer> list = new LinkedList<Integer>();

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        int str;

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++) {
                if (list.get(i) >list.get(j)) {
                    str= list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,str);
                }
            }
        }
        for(Integer i : list){
            System.out.print(i+" ");
        }
    }
}
