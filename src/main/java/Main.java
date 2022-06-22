public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus(1,100,0,0,30);
        Texi texi = new Texi(1, 100, 0, 0, 4);

       // bus.info(); //info메서드를 불러오는데 bus라는 클래스 안에 생성 되었고 bus라는 클래스는 객체로 생성되었다. 클래스 안에 있다.
        bus.addpassenger(5); //인자 2 넣어주기
        //bus.fuelState(-95);
        System.out.println("=================================");
        //Texi
        texi.addpassenger(2);
    }
}
