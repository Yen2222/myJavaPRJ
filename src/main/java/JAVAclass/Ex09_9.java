package JAVAclass;

public class Ex09_9 {
    public static void main(String[] args) {
        String str1 = "Java Programing";
        String str2 = "Java Programing";
        String str3 = new String("Java Programing");

        System.out.println("원 문자열 ==> ["+str1+ "]");
        System.out.println("원 문자열 ==> ["+str2+ "]");
        System.out.println("원 문자열 ==> ["+str3+ "]\n");

        System.out.println("문자열1 == 문자열2 결과 :\t "+(str1==str2));
        System.out.println("문자열1.equals(문자열2) 결과 : "+str1.equals(str2));
        System.out.println("문자열1 == 문자열3 결과 :\t "+ (str1 == str3));
        System.out.println("문자열1.equals(문자열3) 결과 :"+str1.equals(str3));
    }
}
