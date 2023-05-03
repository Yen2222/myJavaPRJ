package JAVAclass;

import java.util.Scanner;

public class Ex09_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = sc.nextLine();

        System.out.print("츌력 문자열 ==> ");
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == 'o')
                System.out.printf("%c", '$');
            else
                System.out.printf("%c", str.charAt(i));
        }
        // 위의 내용과 동일한 메소드 함수 => System.out.println("내가 사용한 함수 : "+ str.replaceAll("o", "q"));
    }
}
