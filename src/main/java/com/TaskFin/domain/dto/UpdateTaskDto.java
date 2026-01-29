package com.TaskFin.domain.dto;

public record UpdateTaskDto(
    String name,
    String description,
    String startDate,
    String endDate,
    String startTime,
    String endTime
) {
}
