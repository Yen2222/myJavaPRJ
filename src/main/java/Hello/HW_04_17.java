package Hello;

import java.util.Scanner;

public class HW_04_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aa[] = new int[5];

        for (int i = 0; i < aa.length; i++) {
            aa[i] = sc.nextInt();
        }
        int x=aa.length;
        for (int i = 0; i < x; i++) {
            for (int j = i+1 ; j < x; j++) {
                if (aa[i] == aa[j]) {
                    for(int k = j+1 ; k<x; k++){
                    aa[k-1] = aa[k];
                    }
                    x--;
                    i=0;
                    j=0;
                }
            }
        }
        for(int i=0; i<x; i++) {
            System.out.printf("%d ", aa[i]);
        }
    }
}

