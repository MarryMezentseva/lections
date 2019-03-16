package lect2Plushki.constants;

public class PlushkiApp {

    public void examle1() {
        String result = getStatus();
        switch (result){
            case Constants.FIRST_STATUS:
                System.out.println(1);
                break;
            case Constants.SECOND_STATUS:
                System.out.println(2);
                break;
            case Constants.THIRD_STATUS:
                System.out.println(3);
                break;
        }

    }

    //exmpl
    private static String getStatus() {
        return "";
    }
}
