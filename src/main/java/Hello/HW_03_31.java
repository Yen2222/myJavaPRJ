package Hello;

public class HW_03_31 {
    public static void main(String[] args) {

// 방법 1
//        for (int i = 0; i < 15; i++) {
//            System.out.print(i);
//            if (i == 0 )
//            System.out.println();
//            if (i == 2 )
//                System.out.println();
//            if (i == 5 )
//                System.out.println();
//            if (i == 9 )
//                System.out.println();
//        }

        // 방법 2
        int j = 1;

        for (int i = 1; i < 6; i++) {
           System.out.print("*");
           if ( i == j ){
               System.out.println();
               j++;
               if( i == 5 )
                   break;
               i = 0;
           }
        }
    }
}
