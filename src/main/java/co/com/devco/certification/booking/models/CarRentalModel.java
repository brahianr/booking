package co.com.devco.certification.booking.models;

public class CarRentalModel {

    private String pickUpPlace;
    private String destinationPlace;
    private String pickUpMonth;
    private String pickUpDay;
    private String returnMonth;
    private String returnDay;

    public CarRentalModel(String pickUpPlace, String destinationPlace, String pickUpMonth, String pickUpDay, String returnMonth, String returnDay) {
        this.pickUpPlace = pickUpPlace;
        this.destinationPlace = destinationPlace;
        this.pickUpMonth = pickUpMonth;
        this.pickUpDay = pickUpDay;
        this.returnMonth = returnMonth;
        this.returnDay = returnDay;
    }

    public String getPickUpPlace() {
        return pickUpPlace;
    }

    public void setPickUpPlace(String pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    public String getPickUpMonth() {
        return pickUpMonth;
    }

    public void setPickUpMonth(String pickUpMonth) {
        this.pickUpMonth = pickUpMonth;
    }

    public String getPickUpDay() {
        return pickUpDay;
    }

    public void setPickUpDay(String pickUpDay) {
        this.pickUpDay = pickUpDay;
    }

    public String getReturnMonth() {
        return returnMonth;
    }

    public void setReturnMonth(String returnMonth) {
        this.returnMonth = returnMonth;
    }

    public String getReturnDay() {
        return returnDay;
    }

    public void setReturnDay(String returnDay) {
        this.returnDay = returnDay;
    }
}
