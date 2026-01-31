package com.TaskFin.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public record UpdateTaskDto(
    @NotBlank(message = "El Titulo es Obligatorio.")
    String name,

    @NotBlank(message = "La Descripcion es Obligatoria.")
    String description,

    @NotBlank(message = "La Fecha Inicial es Obligatoria.")
    String startDate,

    @NotBlank(message = "La Fecha de Final es Obligatoria.")
    @PastOrPresent(message = "La fecha debe ser despues a la inicial.")
    String endDate,

    @NotBlank(message = "La Hora Inicial es Obligatoria.")
    String startTime,

    @NotBlank(message = "La Hora Final es Obligatoria.")
    @PastOrPresent(message = "La fecha debe ser despues a la inicial.")
    String endTime
) {
}
