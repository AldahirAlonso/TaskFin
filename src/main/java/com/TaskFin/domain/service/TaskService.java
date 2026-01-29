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

    public TaskDto getById(Long id) {
        return this.taskRepository.getById(id);
    }

    public TaskDto add(TaskDto taskDto) {
        return this.taskRepository.save(taskDto);
    }

    public TaskDto update(long id, TaskDto taskDto) {
        return this.taskRepository.update(id, taskDto);
    }
}
