package com.TaskFin.persistence.mapper;

import com.TaskFin.domain.Status;
import org.mapstruct.Named;

public class StatusMapper {

    @Named("stringToStatus")
    public static Status stringToStatus(String status) {
        if (status == null)
            return null;

        return switch (status.toUpperCase()) {
            case "PENDIENTE" -> Status.PENDING;
            case "EN PROGRESO" -> Status.IN_PROGRESS;
            case "COMPLETADO" -> Status.COMPLETED;
            case "CANCELADO" -> Status.CANCELLED;
            case "PENDING" -> Status.PENDING;
            case "IN_PROGRESS" -> Status.IN_PROGRESS;
            case "COMPLETED" -> Status.COMPLETED;
            case "CANCELLED" -> Status.CANCELLED;
            default -> null;
        };
    }

    @Named("statusToString")
    public static String statusToString(Status status) {
        if (status == null)
            return null;

        return switch (status) {
            case PENDING -> "Pendiente";
            case IN_PROGRESS -> "En Progreso";
            case COMPLETED -> "Completado";
            case CANCELLED -> "Cancelado";
            default -> "Desconocido";
        };
    }
}