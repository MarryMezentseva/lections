package myCutePacage;

public class InterfApp {

    private final static String TRIP_TYPE = "business";

    public static void main(String[] args) {
        Client client = new Client();
        Trip trip;

        switch (TRIP_TYPE) {

            case "business":
                trip = new BusinesTrip();
                break;
            case "jorney":
                trip = new JorneyTrip();
                break;
            case "crusade":
                trip = new CrusadeTrip();
            case "super":
                trip = new SuperBusinesTrip();
                break;
                default:
                    throw new RuntimeException("Error");

        }

        client.trip(trip);
    }
}
