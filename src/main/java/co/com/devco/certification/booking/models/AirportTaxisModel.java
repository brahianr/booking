package co.com.devco.certification.booking.models;

public class AirportTaxisModel {
    private String pickUpPlace;
    private String destination;
    private String pickUpDate;
    private String pickUpTime;
    private String passengers;

    public AirportTaxisModel(String pickUpPlace, String destination, String pickUpDate, String pickUpTime, String passengers) {
        this.pickUpPlace = pickUpPlace;
        this.destination = destination;
        this.pickUpDate = pickUpDate;
        this.pickUpTime = pickUpTime;
        this.passengers = passengers;
    }

    public String getPickUpPlace() {
        return pickUpPlace;
    }

    public void setPickUpPlace(String pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
}
