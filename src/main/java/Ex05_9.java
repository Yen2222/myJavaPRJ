import java.util.Scanner;
public class Ex05_9 { //else if가 5개 이상 들어가면 switch case를 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.printf("1~4 중에 선택하세요 : ");
        a = sc.nextInt();

        switch(a) {
            case 1:
                System.out.printf("1을 선택했다 \n");
                break; // 이것을 쓰지 않으면 계속 진행됨.
            case 2:
                System.out.printf("2를 선택했다 \n");
                break;
            case 3:
                System.out.printf("3을 선택했다 \n");
                break;
            case 4:
                System.out.printf("4를 선택했다 \n");
                break;
            default:
                System.out.printf("이상한걸 선택했다 \n");
        }
    }
}
