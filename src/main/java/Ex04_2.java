public class Ex04_2 {
    public static void main(String[] args) {
        int a = 2,b =3, c=4;
        int result1, mok, namugi;
        float result2;

        result1 = a+ b -c;
        System.out.printf(" %d + %d - %d = %d \n", a, b, c, result1);

        result1 = a + b * c;
        System.out.printf("%d + %d * %d = %d \n", a, b, c, result1);

        result2 = a * b/ (float) c;// float을 쓰는 이유 int끼리만 계산할 경우 int만 나옴, 따라서 결과값을 소수로 만들기 위해서는 float을 사용해야 함., 데이터 범위가 float이 더 크기 때문에 int와 float을 동시에 넣으면 float으로 결과값 출력
        System.out.printf("%d * %d / %d = %f \n", a, b, c, result2);

        mok = c/b;
        System.out.printf("%d/ %d 의 몫은 %d \n", c, b, mok);

        namugi = c % b;
        System.out.printf("%d/%d의 나머지는 %d \n", c, b, namugi);
    }
}
