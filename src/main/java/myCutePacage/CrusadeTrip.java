package myCutePacage;

public class CrusadeTrip implements Trip{

    @Override
    public void go(){
        System.out.println(CrusadeTrip.class.getName() + " go() throw Europe");
    }

    @Override
    public void get(){
        System.out.println(CrusadeTrip.class.getName() + " get() all their lives" );
    }

}
