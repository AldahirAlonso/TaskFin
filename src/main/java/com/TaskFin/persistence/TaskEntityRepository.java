package com.TaskFin.persistence;

import com.TaskFin.domain.dto.TaskDto;
import com.TaskFin.domain.repository.TaskRepository;
import com.TaskFin.persistence.crud.CrudTaskEntity;
import com.TaskFin.persistence.entity.TaskEntity;
import com.TaskFin.persistence.mapper.TaskMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskEntityRepository implements TaskRepository {
    private final CrudTaskEntity crudTaskEntity;
    private final TaskMapper taskMapper;

    public TaskEntityRepository(CrudTaskEntity crudTaskEntity, TaskMapper taskMapper) {
        this.crudTaskEntity = crudTaskEntity;
        this.taskMapper = taskMapper;
    }

    @Override
    public List<TaskDto> getAll() {
        this.crudTaskEntity.findAll();
        return this.taskMapper.toDto(this.crudTaskEntity.findAll());
    }

    @Override
    public TaskDto getById(Long id) {
        TaskEntity taskEntity = this.crudTaskEntity.findById(id).orElse(null);
        return this.taskMapper.toDto(taskEntity);
    }
}
