package lt.phyto.phyto.models.exceptions;

import java.util.Map;

public class ServerError {

    private String message;

    private String details;

    private Map<String, String> items;

    public ServerError() {
    }

    public ServerError(String message, String details) {
        this.message = message;
        this.details = details;
    }

    public ServerError(String message, Map<String, String> items) {
        this.message = message;
        this.items = items;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Map<String, String> getItems() {
        return items;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }
}
