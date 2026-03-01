package com.TaskFin.domain;

public enum Status {
    PENDING("Pendiente"),
    IN_PROGRESS("En Progreso"),
    COMPLETED("Completado"),
    CANCELLED("Cancelado");

    private final String label;

    Status(String label) {
        this.label = label;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getLabel() {
        return label;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Status fromString(String value) {
        if (value == null)
            return null;
        for (Status status : Status.values()) {
            if (status.label.equalsIgnoreCase(value) || status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown status: " + value);
    }
}
