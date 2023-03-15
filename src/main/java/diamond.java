import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력하시오:");
        int a = sc.nextInt();

        for (int i = 0; i <= (a * 2) - 1; i++) {// 마름모 세로 길이
            if (i <= a) {
                for (int k = a; k > i; k--) { // 마름모 공백 표시
                    System.out.print(" ");
                }
                for (int j = 3; j <= (1+(2 * i)); j++) {// 마름모 별 표시 //
                    System.out.print("*");
                }
            }
            else{
                for(int k = a; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = (a + 2 -(2 * (i - 3) )); j > 0; j--){
                    System.out.print("*");
                }
            }
            System.out.println("");;
            }
        }
    }




