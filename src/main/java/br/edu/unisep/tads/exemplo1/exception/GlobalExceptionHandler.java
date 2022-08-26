package br.edu.unisep.tads.exemplo1.exception;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> responseNotFoundException(ResourceNotFoundException ex, WebRequest request){
        ErrorResponse detalhes = new ErrorResponse(new Date(), 
                                    HttpStatus.NOT_FOUND.toString(), 
                                    ex.getMessage(),
                                    request.getDescription(false));
                                    
        return new ResponseEntity<>(detalhes, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globelExceptionHandler(Exception ex,
                            WebRequest request){ 
        ErrorResponse detalhes = new ErrorResponse(new Date(), 
            HttpStatus.INTERNAL_SERVER_ERROR.toString(),
            ex.getMessage(),
            request.getDescription(false)); 
        
        return new ResponseEntity<>(detalhes,
            HttpStatus.INTERNAL_SERVER_ERROR);  
    }
}