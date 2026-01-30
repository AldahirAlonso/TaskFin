package com.TaskFin.web.exception;

import com.TaskFin.domain.exception.TaskAlreadyExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestException {

    @ExceptionHandler(TaskAlreadyExistsException.class)
    public ResponseEntity<Error> handleException(TaskAlreadyExistsException ex) {
        Error error = new Error("task-already-exists", ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
