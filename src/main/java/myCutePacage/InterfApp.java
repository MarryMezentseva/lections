package myCutePacage;

public class InterfApp {

    private final static String TRIP_TYPE = "business";

    public static void main(String[] args) {
        Client client = new Client();

        switch (TRIP_TYPE) {

            case "business":
                client.businessTrip(new BusinesTrip());
                break;
            case "jorney":
                client.jorneyTrip(new JorneyTrip());
                break;
            case "crusade":
                client.crusadeTrip(new CrusadeTrip());
                break;
                default:
                    throw new RuntimeException("Error");

        }

        client.jorneyTrip(new JorneyTrip());
    }
}
