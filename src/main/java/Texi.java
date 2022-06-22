import Inter.condition;

public class Texi extends Transport implements condition {

    public Texi(int number, int fuel, int speed, int speedChange, int maxpassenger) {
        super(number, fuel, speed, speedChange, maxpassenger);
    }

    @Override
    public void addpassenger(int a) {

        String spot = "서울역";
        int fee = 3000;
        int mFee = 1000;
        int standerdrun = 1000;
        int spotKm = 2;
        String state = "운행중";

        System.out.println("탑승 승객수 = " + a);
        System.out.println("잔여 승객수 = " + (maxpassenger - a));
        System.out.println("기본 요금확인 = " + fee);
        System.out.println("목적지 = " + spot);
        System.out.println("목적지까지 거리 = " + spotKm + "km");
        System.out.println("지불할 요금 = " + (fee + (mFee * spotKm) - standerdrun));
        System.out.println("상태 = " + state);
    }

}
