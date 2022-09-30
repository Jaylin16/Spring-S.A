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

//      생성자
        Taxi(int num, int oil, String status) {
                this.num = num;
                this.oil = oil;
                this.status = status;
        }







    }

