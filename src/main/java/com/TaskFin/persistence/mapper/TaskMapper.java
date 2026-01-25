package com.TaskFin.persistence.mapper;

import com.TaskFin.domain.dto.TaskDto;
import com.TaskFin.persistence.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {StatusMapper.class})
public interface TaskMapper {
    @Mapping(source = "taskName", target = "name")
    @Mapping(source = "taskDescription", target = "description")
    @Mapping(source = "taskStatus", target = "status", qualifiedByName = "stringToStatus")
    @Mapping(source = "taskStartTime", target = "startTime")
    @Mapping(source = "taskEndTime", target = "endTime")
    @Mapping(source = "taskStartDate", target = "startDate")
    @Mapping(source = "taskEndDate", target = "endDate")
    TaskDto toDto(TaskEntity entity);
    List<TaskDto> toDto(Iterable<TaskEntity> entities);
}
