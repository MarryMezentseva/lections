package myCutePacage;

public class BusinesTrip implements Trip{

    private double money;

    @Override
    public void go(){
        System.out.println(BusinesTrip.class.getName() + " go() to Boston");
        money = 1000000d;
    }

    @Override
    public void get(){
        System.out.println(BusinesTrip.class.getName() + "get() " + money + " to a pocket");
    }

    public double getMoney() {
        return money;
    }
}
