package Quiz;

public class Ex04_4 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++; //제일 나중에 연산 ( b에 a를 먼저 집어 넣고 +1을 함)
        System.out.printf(" %d \n", b);

        b = ++a; // ++이 앞에 있는지 뒤에 있는지 = 실행 순서의 차이 ( a+=1먼저 그다음 b에 집어넘)
        System.out.printf("%d \n", b);
    }
}
