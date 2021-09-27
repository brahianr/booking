package co.com.devco.certification.booking.exceptions;

public class LogInNotCompletedException extends AssertionError{
    public static final String LOGIN_FAILED_MESSAGE = "Login cannot be completed";

    public LogInNotCompletedException(String message, Throwable cause){
        super(message, cause);
    }
}
