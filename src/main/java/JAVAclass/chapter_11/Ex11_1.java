package JAVAclass.chapter_11;

class Car { //웬만하면 클래스는 한 개만 만들어야 함
    public String color;
    //public : 아무나 다 가져다 쓸 수 있음
    public int speed;

    public void upSpeed(int value) {
        this.speed = this.speed + value;
    } //void : 인스턴스화 (메모리에 올리는 것)

    public void downSpeed(int value){
        this.speed = this.speed-value;
    }
}// 통으로 메모리에 올라감 (클래스 단위로)
public class Ex11_1 { //public class는 한 개 (이것이 파일의 이름이 됨)
                     // class 안에 class가 들어 갈 수 없다.
    public static void main(String[] args) {
        Car myCar1 = new Car(); // 클래스가 데이터 타입이 되기도 함
        //new : 메모리에 올리는 것
        myCar1.color = "빨강";
        myCar1.speed = 0;

        Car myCar2 = new Car();
        myCar2.color = "파랑";
        myCar2.speed = 0;

        Car myCar3 = new Car();
        myCar3.color = "노랑";
        myCar3.speed = 0;

        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 "+myCar1.color+"이며, 현재속도는 "+myCar1.speed+"km입니다.");

        myCar2.upSpeed(60);
        System.out.println("자동차3의 색상은 "+myCar2.color+"이며, 현재속도는 "+myCar2.speed+"km입니다.");

        myCar3.upSpeed(0);
        System.out.println("자동차3의 색상은 "+myCar3.color+"이며, 현재속도는 "+myCar3.speed+"km입니다.");
    }
}
