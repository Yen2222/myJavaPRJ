public class HW_03_29 {
    public static void main(String[] args) {
        int i,k;

        for(k=1;k<=9;k++){
            for(i=2;i<=9;i++){
                System.out.printf(" %d X %d = %d  \t ",i,k,i*k);
            }
            System.out.printf("\n");
        }
    }

    public static class HW_03_27 {
        public static void main(String[] args) {
            int i;

            for ( i = 2; i < 10; i ++){
                int k =1 ;
                if(k<i+1) k++;
                System.out.printf("%d X %d = %d", i, k, i*k);
            }
        }
    }
}
