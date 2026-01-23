package com.TaskFin.controller;

import com.TaskFin.domain.dto.TaskDto;
import com.TaskFin.domain.service.TaskService;
import com.TaskFin.persistence.crud.CrudTaskEntity;
import com.TaskFin.persistence.entity.TaskEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<TaskDto> getAll() {
        return this.taskService.getAll();
    }

    @PostMapping
    public String createTask() {
        return "Task created";
    }

    @PutMapping
    public String updateTask() {
        return "Task updated";
    }

    @DeleteMapping
    public String deleteTask() {
        return "Task deleted";
    }
}
