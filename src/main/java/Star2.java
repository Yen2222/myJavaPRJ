import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 생성 = 입력을 받겠다.
        System.out.print("값을 입력하십시오 : ");
        int a = sc.nextInt(); // i는 입력을 받아야만 값이 할당됨

        for(int i = 0; i < a ; i++) { // 총 높이 반복문
            if (i < a)
                for (int j = 0; j <= i; j++) {  // 별 찍는 반복문
                    System.out.print("*");
                    // j는 별을 찍는 횟수와 같다. 근데 입력한 값과 같으면 줄어들기 시작해야한다.
                }
                System.out.println("");
            }
        for(int i = a; i< (a * 2) - 1; i++) {
             if(i >= a)
                for (int j = (a * 2) -2; j >= i; j--) {
                    System.out.print("*");}
            System.out.println("");
                }
        }
        }
