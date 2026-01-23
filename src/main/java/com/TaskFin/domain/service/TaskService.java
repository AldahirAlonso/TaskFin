package com.TaskFin.domain.service;

import com.TaskFin.domain.dto.TaskDto;
import com.TaskFin.domain.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskDto> getAll() {
        return this.taskRepository.getAll();
    }
}
