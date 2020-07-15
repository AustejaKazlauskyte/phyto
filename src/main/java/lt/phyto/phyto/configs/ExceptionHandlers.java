package lt.phyto.phyto.configs;

import lt.phyto.phyto.models.exceptions.ServerError;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import lt.phyto.phyto.models.exceptions.ValidationException;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(value = ValidationException.class)
    @ResponseBody
    public ServerError handleValidationException(HttpServletResponse response, ValidationException ex) {
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

        return new ServerError("Invalid data", ex.getErrors());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public ServerError handleValidationException(HttpServletResponse response, MethodArgumentNotValidException ex) {
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

        String header = "Invalid data";
        Map<String, String> items = new HashMap<>();
        for (ObjectError objectError : ex.getBindingResult().getAllErrors()) {
            if (objectError instanceof FieldError) {
                items.put(((FieldError) objectError).getField(), objectError.getDefaultMessage());
            } else {
                items.put(objectError.getObjectName(), objectError.getDefaultMessage());
            }
        }

        return new ServerError(header, items);
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseBody
    public ServerError handleIllegalArgumentException(HttpServletResponse response, IllegalArgumentException ex) {
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        String header = ex.getMessage();

        return new ServerError(header, ex.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ServerError handleGeneralException(HttpServletResponse response, Exception ex) {
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        String header = "Server error";
        ex.printStackTrace();

        return new ServerError(header, ex.getMessage());
    }
}
