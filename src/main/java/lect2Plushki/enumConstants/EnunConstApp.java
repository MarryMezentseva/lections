package lect2Plushki.enumConstants;


public class EnunConstApp {

    public void example1() {
        Status status = getVisaStatus();
        switch (status) {
            case START:
                System.out.println(1);
                break;
            case FINISH:
                System.out.println(2);
                break;
            case EXPIRED:
                System.out.println(3);
                break;
            default:
                System.out.println(4);
                break;
        }

    }

    //exmpl
    private Status getVisaStatus() {
        return Status.EXPIRED;
    }
}
