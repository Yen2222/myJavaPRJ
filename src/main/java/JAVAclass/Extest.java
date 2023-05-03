package JAVAclass;

public class Extest {
    public static void main(String[] args) {
        // static  메모리 올린다고 말 안해도 올려 버림 (자동)
        //void는 결과 값이 없어도 됨
        // 나머지 반환타입은 무조건 return이 있어야 함
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)";
        //1번째 문제
        String ip[] = log.split(" ");
        System.out.println("ip는 : " + ip[0]);
        //2번째 문제
        String time = ip[3].replace("[","");
        System.out.println("호출 날짜와 시간 : " +time);
    }
}
