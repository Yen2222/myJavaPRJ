package Quiz;

public class Te {
    public static void main(String []args){
        int aa [] = {100, 200, 100, 300, 400};

        int max = aa[0], min = aa[0], sum = 0;

        for(int i = 0; i<aa.length; i++){
            if(aa[i]>max){
                max = aa [i];
            }
            if(aa[i]<min){
                min = aa[i];
            }
            sum += aa [i];
        }
        System.out.printf("최댓값 = %d / 최솟값 = %d / 평균값 = %d" , max, min, sum/5);
    }
}
