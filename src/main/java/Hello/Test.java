package Hello;

public class Test {
    public static void main(String[] args) {      // 메인 함수

        int i = 2;  // 정수형 변수 'i'를 선언함 (2단부터 할 것이기 때문에 2로 두었음)
        for (int j = 1; j < 10; j++) {  // 정수형 변수 'j'를 1부터 9까지 출력할 수 있는 반복문 생성
            System.out.printf("%d X %d = %d \n", i, j, i * j); // i와 j를 곱한 식이 출력됨 ex) 2 X 3 = 6
            if (j == 9) {  // i에 9까지 곱했을 때
                i++; // i가 1가 늘어나면서 단이 1단 올라감
                j = 0; // j는 초깃값이 되어 다시 반복문을 진행하게 됨
                System.out.println(""); // 1단이 끝나면 줄을 엔터쳐서 보기 좋게 함
            }
            if (i == 10) { //10단을 출력하게 될 때에
                break; // 멈추게 됨 (9단까지만 출력하는 것이기 때문)
            }
        } // 괄호는 닫아줌
    }
}