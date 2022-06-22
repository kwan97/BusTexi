import Inter.condition;

public class Bus extends Transport implements condition { //자식 클래스
//클래스는 한번밖에 상속 안됨
    int fee = 1000;
    String state = "운행";
    String state2 = "차고지행";

    public Bus(int number, int fuel, int speed, int speedChange, int maxpassenger) {
         //Bus bus = new Bus(1,100,0,0,30,"운행",1000);버스 클래스 매개변수 요소들 참고용 줄

        //참조변수(부모클래스 변수 사용시 생성 됨)
        super(number, fuel, speed, speedChange, maxpassenger);

    }

    @Override //인타페이스 상속시 무조건 메서드 가져와줘야함.
    public void addpassenger(int a) {//매개변수 'a'
        if ((maxpassenger+a) >= 30) {
            System.out.println("현재 승객 수 : " + a);
            System.out.println("잔여 승객 수 : " + (maxpassenger - a));
            System.out.println("요금 확인 : " + (fee * a));
        } else {
            System.out.println("최대 승객 수 초과!");
        }

    }

   /*@Override
    public void fuelState(int f) {
        System.out.println("주유량 : " + (fuel + f));

        if ((fuel+f) <= 50) {
            System.out.println("버스의 상태 : " + state2);
            System.out.println("주유 필요!");
        }else {
            System.out.println("버스의 상태 : " + state);
        }
    }*/
}
