package Hello;

import java.util.Scanner;

public class HW_04_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa[] = new int[5];
        int str;

        for (int i = 0; i < aa.length; i++) {
            int j;
            for( j = 0; j < aa.length; j++) {
                aa[j] = sc.nextInt();
                }
                if (aa[i] == aa[i + 1]) {
                    System.out.printf("중복이므로 다시 적어주세요.");
                    j = 0;
            }else
                break;
        }
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                if (aa[i] < aa[j]) {
                    str = aa[i];
                    aa[i] = aa[j];
                    aa[j] = str;
                }
            }
        }
        for (int i = 0; i < aa.length; i++) {
            System.out.printf("%d ", aa[i]);
        }
    }
}
