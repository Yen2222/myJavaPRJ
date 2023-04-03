package Hello;

public class HW_04_03 {
    public static void main(String[] args) { // 메인 함수 (자바에서 필수)

        int j = 2; // 정수형 변수 2를 설정함 (2단부터 시작하기 때문)
        for (int i = 1; i < 10; i++) { // 정수형 변수 'i'를 1부터 9까지 1씩 늘어나도록 반복함
            System.out.printf("%d X %d = %d ", j, i, j*i); // j와 i의 곱을 j X i = 값으로 출력함
            System.out.println(); // 하나의 식을 출력하고 다음 줄로 넘어감
            if (i == 9) { // i가 9가 되면
                j++;  // j가 1가 늘어남 (단이 바뀜)
                i = 0; // i가 초기화되어 다시 반복문 진행
                System.out.println(); // 단이 끝나면 줄바꿈을 함
            }
            if (j == 10) // j가 10이 되면
                break; // 멈춤 (9단까지만 하기 때문)
        }
    }
}
