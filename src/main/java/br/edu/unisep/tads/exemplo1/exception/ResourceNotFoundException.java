package br.edu.unisep.tads.exemplo1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException {
    
    private static final long serialVersionUID = 1L;

    /**
     * @param msg
     */
    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
