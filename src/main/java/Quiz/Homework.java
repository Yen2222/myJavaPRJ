import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("정수를 입력하시오 : ");
        int a;
        a = s.nextInt();

        if (a%3 ==0){
            System.out.printf("3의 배수입니다.");
        } else{
            System.out.printf("3의 배수가 아닙니다.");
        }
    }
}
