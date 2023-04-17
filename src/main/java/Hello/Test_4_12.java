package Hello;

import java.util.Scanner;

public class Test_4_12 {
    public static void main(String[] args) { // 메인함수
        Scanner sc = new Scanner(System.in); // 스케너를 선언

        int sum =0; // 정수형 변수 'sum'선언
        int aa[] = new int[5]; //길이가 5인 배열 선언

        for(int i=0; i<aa.length;i++){ //배열에 입력값을 넣기 위한 반복문
            aa[i]=sc.nextInt();  // 배열 칸에 입력값을 스케너로 받겠음
        } // 반복문 닫음
        int max = aa[0], min = aa[0]; // 최댓값과 최솟값 선언
        for(int i=0;i<aa.length;i++){  // 최댓값과 최솟값과 평균값을 구하기 위해 반복문을 사용 (비교 및 더하기 위해)
                if(max<aa[i])  // 현재 최댓값보다 배열 안의 값이 더 크다면
                    max = aa[i];  // 최댓값이 현재 배열 안의 값으로 바뀜.
                if(min > aa[i]) // 현재 최솟값보다 배열 안의 값이 더 작다면
                    min = aa[i];  // 최솟값이 현재 배열 안의 값으로 바뀜

            sum += aa[i]; // 반복문을 사용하여 합계가 모든 배열의 값이 다 더해지게 함
        }//반복문 닫음
        System.out.printf("가장 큰 값 : %d/ 가장 작은 값 : %d / 평균 값 : %d",max,min,sum/5); // 최댓값과 최솟값과 평균값을 출력함
    }//메인 함수 닫음
} // 클레스 닫음
