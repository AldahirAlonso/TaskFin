package com.TaskFin.domain.repository;

import com.TaskFin.domain.dto.TaskDto;

import java.util.List;

public interface TaskRepository {
    List<TaskDto> getAll();
}
