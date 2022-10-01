import java.util.*;

public class Bus extends PublicTransportation {

    int nowGuest;
    int maxGuest = 30;
    String status = "운행중";
    int standardCash = 1000;

    boolean checkGuest;


//      기본 생성자 사용.


    public void standardCash() {
        int cash = standardCash * customerCnt;
        System.out.println("지불할 요금=" + cash);
    }

    public void getStatus() {
        if (oil < 10) {
            System.out.println("상태=" + "차고지행");
            System.out.println("주유 필요");
        } else if (this.customerCnt != 0) {
            System.out.println("상태=" + "운행중");
        }
    }

    public boolean isCheckGuest() {
        if (this.customerCnt > maxGuest ) {
            System.out.println("최대 승객 수 초과");
        }
        return checkGuest;
    }


}


