import java.util.Scanner; //java 파일에 존재하는 소스

public class Ex05_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 대문자일 경우 java에 내재되어있음
        // java 파일로 메모리에 올리려면 new를 사용해야 함
        int a; // 소문자이면 기본 데이터 타입

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt();

        if(a%2==0){
            System.out.printf("짝수를 입력했군요.. \n");
        }else{
            System.out.printf("홀수를 입력했군요.. \n");
        }
    }
}
