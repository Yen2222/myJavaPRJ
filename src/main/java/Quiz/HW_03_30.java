package Quiz;

public class HW_03_30 {
    public static void main(String[] args) {

            int i =2 ;

            for (int j = 1; j <11; j ++){
                if( j == 10) {
                    i++;
                    j = 1;
                    System.out.println();
                }
                if( i == 10) {
                    break;
                }
                System.out.printf("%d X %d = %d \n", i, j, j*i);
            }
    }
}
