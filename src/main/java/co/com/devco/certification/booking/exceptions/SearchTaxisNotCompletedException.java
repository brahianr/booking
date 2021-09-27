package co.com.devco.certification.booking.exceptions;

public class SearchTaxisNotCompletedException extends AssertionError{
    public static final String SEARCH_TAXIS_FAILED_MESSAGE="The search taxis for airport failed";

    public SearchTaxisNotCompletedException(String message, Throwable cause){
        super(message, cause);
    }

}
