package co.com.devco.certification.booking.models;

public class FlightModel {

    private String origin;
    private String destination;
    private String depurtateDate;
    private String arrivalDate;

    public FlightModel(String origin, String destination, String depurtateDate, String arrivalDate) {
        this.origin = origin;
        this.destination = destination;
        this.depurtateDate = depurtateDate;
        this.arrivalDate = arrivalDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepurtateDate() {
        return depurtateDate;
    }

    public void setDepurtateDate(String depurtateDate) {
        this.depurtateDate = depurtateDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
