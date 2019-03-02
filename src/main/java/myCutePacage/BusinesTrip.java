package myCutePacage;

public class BusinesTrip {

    private double money;

    public void go(){
        System.out.println(BusinesTrip.class.getName() + " go() to Boston");
        money = 1000000d;
    }

    public void get(){
        System.out.println(BusinesTrip.class.getName() + "get() " + money + " to a pocket");
    }

    public double getMoney() {
        return money;
    }
}
