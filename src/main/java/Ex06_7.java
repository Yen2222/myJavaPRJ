public class Ex06_7 {
    public static void main(String[] args) {
        int hap = 0; // hap의 값을 알아야 계산 진행 가능
        int i;

        for (i=1; i<=10; i++) {
            hap += i;
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
