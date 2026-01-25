package com.TaskFin.domain.dto;

import com.TaskFin.domain.Status;

public record TaskDto(
    Long id,
    String name,
    String description,
    Status status,
    String startDate,
    String endDate,
    String startTime,
    String endTime
) {

}
