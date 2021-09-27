package co.com.devco.certification.booking.exceptions;

public class EmailNotUnsubscribedException extends AssertionError{
    public static final String UNSUBSCRIBE_FAILED_MESSAGE="Email Cannot Be Unsubscribed";

    public EmailNotUnsubscribedException(String message, Throwable cause){
        super(message, cause);
    }
}
