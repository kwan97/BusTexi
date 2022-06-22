public class Transport { //부모
    //요소
    int number;
    int fuel;
    int speed;
    int speedChange;
    int maxpassenger;

    //생성자 생성 (생성자는 클래스와 이름이 같아야 한다.)
    public Transport(int number, int fuel, int speed, int speedChange, int maxpassenger) {

        this.number = number;
        this.fuel = fuel;
        this.speed = speed;
        this.speedChange = speedChange;
        this.maxpassenger = maxpassenger;
    }

}
