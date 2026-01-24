package com.TaskFin.persistence;

import com.TaskFin.domain.dto.TaskDto;
import com.TaskFin.persistence.crud.CrudTaskEntity;
import com.TaskFin.persistence.mapper.TaskMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskEntityRepository {
    private final CrudTaskEntity crudTaskEntity;
    private final TaskMapper taskMapper;

    public TaskEntityRepository(CrudTaskEntity crudTaskEntity, TaskMapper taskMapper) {
        this.crudTaskEntity = crudTaskEntity;
        this.taskMapper = taskMapper;
    }

    public List<TaskDto> getAll() {
        this.crudTaskEntity.findAll();
        return this.taskMapper.toDto(this.crudTaskEntity.findAll());
    }
}
