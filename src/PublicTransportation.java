import java.util.*;

public class PublicTransportation {

    //  요소
    int num;
    int oil = 100;
    int speed = 0;
    int speedCheck;
    int maxGuest;
    int tCount;


    //   기능
    String start;
    int speedChange;
    int customerCnt = 0;

    //   메소드

    public int getNum() {
        System.out.println("번호:" + (int) (Math.random() * 9999 + 1));
        return 0;
    }

    public int getOil(){
        System.out.println("주유량=" + oil);
        return oil;
    }

    public int getCustomerCnt(int n) {
        System.out.println("탑승 승객 수=" + n);
        return n;
    }
}


