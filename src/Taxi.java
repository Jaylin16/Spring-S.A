import java.util.*;

public class Taxi extends PublicTransportation {

    String destination = "";
    int totalDistance = 0;
    int standardDistance = 1;
    int standardCash = 5000;
    int cashPerDistance = 1000;

    int plusCash = cashPerDistance * (totalDistance - standardDistance);
    int cash = standardCash + plusCash;
    int totalCash;

    int maxGuest = 4;
    boolean checkGuest;
    String status;


//      기본 생성자 사용.


    //       메소드
    public void getStatus() {
        if (oil < 10) {
            System.out.println("상태=" + "탑승불가");
        } else if (this.customerCnt != 0) {
            System.out.println("상태=" + "운행중");
        } else {
            System.out.println("상태=" + "일반");
        }
    }

    public void getDestination(String s) {
        System.out.println("목적지=" + s);
    }

    public void getTotalDistance(int n) {
        this.totalDistance = n;
        System.out.println("목적지까지 거리=" + n + "km");
    }

    public void getCash() {
        if (totalDistance - standardDistance != 0) {
            cash = standardCash + cashPerDistance * (this.totalDistance - standardDistance);
            totalCash += this.cash;
            System.out.println("지불할 요금=" + cash);
        } else {
            int cash = standardCash;
            System.out.println("지불할 요금=" + cash);
        }
    }

    public int getTotalCash() {
        System.out.println("누적 요금=" + totalCash);
        return 0;
    }

    public boolean isCheckGuest() {
        if (this.customerCnt > 4 ) {
            System.out.println("최대 승객 수 초과");
        }
        return checkGuest;
    }
}