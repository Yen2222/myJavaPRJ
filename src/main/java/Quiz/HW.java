import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.printf("입력값: ");
        a = sc.nextInt();
        System.out.printf("출력 결과 \n");

        if( a % 3 == 0 && a % 5 == 0){
            System.out.printf("\"3의 배수와 5의 배수를 둘다 만족합니다.\"");
        }
        else if( a % 3 ==0){
            System.out.printf("\"3의 배수입니다.\"");
        }
        else if ( a % 5 == 0){
            System.out.printf("\"5의 배수입니다\"");
        }
    }
}
