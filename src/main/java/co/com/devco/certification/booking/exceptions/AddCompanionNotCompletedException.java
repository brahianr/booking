package co.com.devco.certification.booking.exceptions;

public class AddCompanionNotCompletedException extends AssertionError{
    public static final String ADD_COMPANION_FAILED_MESSAGE="Cannot be added to travel companion";

    public AddCompanionNotCompletedException(String message, Throwable cause){
        super(message, cause);
    }
}
