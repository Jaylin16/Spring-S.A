public class Run_ptt {
    public static void main(String[] args) {

        Taxi myTaxi1 = new Taxi();
        Taxi myTaxi2 = new Taxi();

        Bus myBus1 = new Bus();
        Bus myBus2 = new Bus();

        System.out.println("1번택시");
        myTaxi1.getNum();
        myTaxi1.getOil(0);
        myTaxi1.getStatus();


        System.out.println();
        System.out.println("2번택시");
        myTaxi2.getNum();
        myTaxi2.getOil(0);
        myTaxi2.getStatus();
        myTaxi2.getCustomerCnt(2);
        System.out.println("기본요금=" + myTaxi2.standardCash);
        myTaxi2.getDestination("서울역");
        myTaxi2.getTotalDistance(2);
        myTaxi2.getCash();
        myTaxi2.getStatus();

        System.out.println();
        myTaxi2.getOilUpdate(-80);

        System.out.println();
        myTaxi2.getTotalCash();
        myTaxi2.getOilUpdate(20);

        System.out.println();
        myTaxi2.getCustomerCnt(5);
        myTaxi2.isCheckGuest();

        System.out.println();
        myTaxi2.getCustomerCnt(3);
        System.out.println("기본요금=" + myTaxi2.standardCash);
        myTaxi2.getDestination("구로디지털단지역");
        myTaxi2.getTotalDistance(12);
        myTaxi2.getCash();

        System.out.println();
        myTaxi2.getOilUpdate(-40);
        myTaxi2.getStatus();
        myTaxi2.getTotalCash();




        System.out.println();
        System.out.println("1번버스");
        myBus1.getNum();






        System.out.println();
        System.out.println("2번버스");
        myBus2.getNum();





    }
}
