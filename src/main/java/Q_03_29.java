import java.util.Scanner;

public class Q_03_29 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        int num;

        System.out.printf("입력값 : ");
        num = sc.nextInt();

        if((num%6==0)){
            System.out.printf("2와 3의 배수에 만족합니다");
        } else if (num%2==0){
            System.out.printf("2의 배수입니다.");
        } else if (num%3==0){
            System.out.printf("3의 배수입니다");
        }
    }

}
