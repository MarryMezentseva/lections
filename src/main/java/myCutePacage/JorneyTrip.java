package myCutePacage;

public class JorneyTrip implements Trip{

    private String shishki;

    @Override
    public void go(){
        System.out.println(JorneyTrip.class.getName() + " go() in the forest");
        shishki = "shishki";
    }

    @Override
    public void get(){
        System.out.println(JorneyTrip.class.getName() + "get() " + addShishkiToBacket());
    }

    private String addShishkiToBacket(){
        return shishki + " to the backet";
    }

    public String getShishki() {
        return shishki;
    }
}
