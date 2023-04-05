package Hello;

public class HW_04_05 {
    public static void main(String[] args) {
        int i =2,j=1;

        while (j<10){
            System.out.printf("%d X %d = %d \n",i,j,i*j);
            j++;
            if( j == 10){
                i++;
                j=1;
                System.out.println("");
            }
            if( i == 10)
                break;
        }
    }
}
