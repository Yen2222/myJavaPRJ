package Quiz;

import java.util.Scanner;

public class Te_04_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aa[] = new int[5];
        int str;

        for (int i = 0; i < aa.length; i++) {
            aa[i] = sc.nextInt();
        }

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                if (aa[i] > aa[j]) {
                    str = aa[i];
                    aa[i] = aa[j];
                    aa[j] = str;
                }
            }
        }
        for (int i = 0; i < aa.length; i++) {
            System.out.printf("%d ",aa[i]);
        }
    }
}