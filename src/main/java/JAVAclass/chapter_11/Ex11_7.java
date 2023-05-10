package JAVAclass.chapter_11;

class Car2 {
    private  String color;
    //private : (외부에서 절대로 접근 불가능) 접근 가능이 나만
    private  int speed;

    Car2(String color, int speed) { // 이것이 바로 생성자 함수
        this.color = color;
        this.speed = speed;
    } //생성자에 파라미터를 넣어 메모리에 올림
    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
}
public class Ex11_7 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2("빨강", 0);
        // new 뒤의 것 => 생성자(함수) 중 파라미터 2개 받는 것 바로 이것을 메모리에 올리라는 의미
        Car2 myCar2 = new Car2("파랑", 30);

        System.out.println("자동차1의 색상은 "+myCar1.getColor()+"이며, 현재속도는 "+myCar1.getSpeed()+"km입니다.");
        System.out.println("자동차2의 색상은 "+myCar2.getColor()+"이며, 현재속도는 "+myCar2.getSpeed()+"km입니다.");
    }
}
