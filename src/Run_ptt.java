public class Run_ptt {
    public static void main(String[] args) {

        Taxi myTaxi1 = new Taxi();
        Taxi myTaxi2 = new Taxi();

        Bus myBus1 = new Bus();
        Bus myBus2 = new Bus();

        System.out.println("1번택시");
        myTaxi1.getNum();
        myTaxi1.getOil();
        myTaxi1.getStatus();


        System.out.println();
        System.out.println("2번택시");
        myTaxi2.getNum();
        myTaxi2.getOil();
        myTaxi2.getStatus();
        myTaxi2.getCustomerCnt(2);
        System.out.println("기본요금=" + myTaxi2.standardCash);
        myTaxi2.getDestination("서울역");
        myTaxi2.getToDestination(2);
        myTaxi2.getCash();
        myTaxi1.getStatus();






        System.out.println();
        System.out.println("1번버스");
        myBus1.getNum();






        System.out.println();
        System.out.println("2번버스");
        myBus2.getNum();





    }
}
