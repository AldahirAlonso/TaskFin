package com.TaskFin.web.exception;

import com.TaskFin.domain.exception.TaskAlreadyExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class RestException {

    @ExceptionHandler(TaskAlreadyExistsException.class)
    public ResponseEntity<Error> handleException(TaskAlreadyExistsException ex) {
        Error error = new Error("task-already-exists", ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<Error>> handleException(MethodArgumentNotValidException ex) {
        List<Error> errors = new ArrayList<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            errors.add(new Error(error.getDefaultMessage(), error.getObjectName().toString()));
        });
        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception ex) {
        Error error = new Error(ex.getMessage(), ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
