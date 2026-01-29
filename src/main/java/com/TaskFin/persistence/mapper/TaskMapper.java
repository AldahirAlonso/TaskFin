package com.TaskFin.persistence.mapper;

import com.TaskFin.domain.dto.TaskDto;
import com.TaskFin.persistence.entity.TaskEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

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

    @InheritInverseConfiguration
    @Mapping(source = "name", target = "taskName", qualifiedByName = "statusToString")
    TaskEntity toEntity(TaskDto dto);

    @Mapping(target = "taskName", source = "name")
    @Mapping(target = "taskDescription", source = "description")
    @Mapping(target = "taskStartTime", source = "startTime")
    @Mapping(target = "taskEndTime", source = "endTime")
    @Mapping(target = "taskStartDate", source = "startDate")
    @Mapping(target = "taskEndDate", source = "endDate")
    void updateEntityFromDto(TaskDto taskDto, @MappingTarget TaskEntity taskEntity);
}
