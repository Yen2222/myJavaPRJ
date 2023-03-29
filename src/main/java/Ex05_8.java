import java.util.Scanner;

public class Ex05_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.printf(" 점수를 입력하세요 : ");
        a = sc.nextInt();

        if (a >= 90) {
            System.out.printf("A");
        } else if (a >= 80) {
            System.out.printf("B");
        } else if (a >= 70) {
            System.out.printf("C");
        } else if (a >= 60) {
            System.out.printf("D");
        } else System.out.printf("F"); // 공통적인 변수가 있을 때만 else if

        System.out.printf(" 학점입니다. \n");
    }
}
