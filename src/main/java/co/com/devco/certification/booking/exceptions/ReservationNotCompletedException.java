package co.com.devco.certification.booking.exceptions;

public class ReservationNotCompletedException extends AssertionError{
    public static final String RESERVE_FAILED_MESSAGE="The reservation could not be completed";

    public ReservationNotCompletedException(String message, Throwable cause){
        super(message, cause);
    }
}
