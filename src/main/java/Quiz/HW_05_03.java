package Quiz;

import java.util.List;
import java.util.*;
public class HW_05_03 {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        for(int i=0; i<list.size();i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) == list.get(j) ){
                    list.remove(j);
                    j--;
                }
            }
        }
        list.forEach(sort -> System.out.print(sort + " "));
    }
}
