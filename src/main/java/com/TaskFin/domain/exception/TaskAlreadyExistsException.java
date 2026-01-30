package com.TaskFin.domain.exception;

public class TaskAlreadyExistsException extends RuntimeException {
    public TaskAlreadyExistsException(String taskName) {
        super("La tarea " + taskName + " ya existe.");
    }
}
