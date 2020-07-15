package lt.phyto.phyto.models.exceptions;

import java.util.Map;

public class ValidationException extends RuntimeException {

  private Map<String, String> errors;

  public ValidationException() {}

  public ValidationException(Map<String, String> errors) {
    this.errors = errors;
  }

  public Map<String, String> getErrors() {
    return errors;
  }

  public void setErrors(Map<String, String> errors) {
    this.errors = errors;
  }
}
