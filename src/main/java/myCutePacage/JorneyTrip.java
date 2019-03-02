package myCutePacage;

public class JorneyTrip {

    private String shishki;

    public void go(){
        System.out.println(JorneyTrip.class.getName() + " go() in the forest");
        shishki = "shishki";
    }

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
