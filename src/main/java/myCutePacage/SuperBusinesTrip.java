package myCutePacage;

public class SuperBusinesTrip extends BusinesTrip{

    private double money;

    @Override
    public void go(){
        System.out.println(SuperBusinesTrip.class.getName() + " go() to NY");
        money = 1000001d;
    }

    @Override
    public void get(){
        System.out.println(SuperBusinesTrip.class.getName() + "get() " + money + " to a suite case");
    }

    public double getMoney() {
        return money;
    }
}
