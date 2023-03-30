package Hello;

public class HW_star {
    public static void main(String[] args) {
        int i;

        for (i=0; i<7;i++){
            if(i<4) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
            }
                else {
                    for(int k =7; k > i; k--){
                        System.out.printf("*");
                    }
                }
            System.out.println();
        }
    }
}
