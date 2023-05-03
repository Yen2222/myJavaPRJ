package JAVAclass;

public class Ex09_7 {
    public static void main(String[] args) {
        String str = "   한글   ABCD  efgh  ";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                result += str.substring(i,i+1);
        } //근데 replaceAll을 주로 사용

        System.out.println("원 무자열 ==> ["+ str + "]");
        System.out.println("공백제거 ==> ["+result+"]");
    }
}
