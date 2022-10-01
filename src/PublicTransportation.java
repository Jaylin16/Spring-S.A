import java.util.*;

public class PublicTransportation {

    //  요소
    int num;
    int oil = 100;
    int speed = 0;
    int speedCheck;
    int maxGuest;
    int tCount;

    int oilUpdate;


    //   기능
    String start;
    int speedChange;
    int customerCnt = 0;

    //   메소드

    public int getNum() {
        System.out.println("번호:" + (int) (Math.random() * 9999 + 1));
        return 0;
    }

    public int getOil(int o) {
        if (o != 0) {
            int oil = this.oil;
            System.out.println("주유량=" + oil);
            return oil;
        } else {
            System.out.println("주유량=" + oil);
            return 0;
        }
    }

    public int getCustomerCnt(int n) {
        this.customerCnt = n;
        System.out.println("탑승 승객 수=" + n);
        return n;
    }

    public void getOilUpdate(int update) {
        this.oil += update;
        System.out.println("주유량=" + oil);
    }
}


