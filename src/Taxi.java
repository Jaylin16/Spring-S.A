import java.util.*;

public class Taxi extends PublicTransportation {

    String destination = "";
    int toDestination = 0;
    int standardDistance = 2000;
    int standardCash = 5000;
    int cashPerDistance = 100;

    int plusCash = cashPerDistance * (toDestination - standardDistance);
    int cash = standardCash + plusCash;

    int maxGuest = 4;
    String status = "일반";


//      기본 생성자 사용.


    //       메소드
    public void getStatus() {
        if (oil < 10) {
            System.out.println("상태=" + "탑승불가");
        } else if (customerCnt != 0) {
            System.out.println("상태=" + "운행중");
        }
        System.out.println("상태=" + "일반");
    }

    public void getDestination(String s) {
        System.out.println("목적지=" + s);
        System.out.println(customerCnt);
    }

    public void getToDestination(int n) {
        System.out.println("목적지까지 거리=" + n + "km");
    }

    public void getCash() {
        int cash = standardCash + plusCash;
        System.out.println("지불할 요금=" + cash);
    }
}