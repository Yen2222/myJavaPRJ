package JAVAclass.chapter_6;

public class Ex06_12 {
    public static void main(String[] args) {
        int i,k;

        for(i=2;i<=9;i++){
            System.out.printf( i + "단 시작합니다.\n");
            for(k=1;k<=9;k++){
                System.out.printf(" %d X %d = %d \n",i,k,i*k);
            }
            System.out.printf("\n");
        }
    }
}