package com.TaskFin.persistence.crud;

import com.TaskFin.persistence.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudTaskEntity extends CrudRepository<TaskEntity, Long> {
    TaskEntity findFirstByTaskName(String taskName);
}
