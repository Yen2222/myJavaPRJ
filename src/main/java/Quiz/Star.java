public class Star {
    public static void main(String[] args) {

        int a = 5;

        for (int i = 0; i < a*2; i++) {
            if ( i < a) {
                for (int j = 0; j < i; j++) {
                    System.out.printf("*");
                }

            }

            else {

                for (int j = a; j > i-a; j--){
                System.out.printf("*");
                }
            }
            System.out.printf("\n");

        }

    }
}
