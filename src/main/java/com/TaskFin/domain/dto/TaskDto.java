package com.TaskFin.domain.dto;

public record TaskDto(
    Long id,
    String title,
    String description,
    Boolean completed,
    String startDate,
    String endDate,
    String startTime,
    String endTime
) {

}
