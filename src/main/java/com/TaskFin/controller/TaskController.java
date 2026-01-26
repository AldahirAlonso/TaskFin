package com.TaskFin.controller;

import com.TaskFin.domain.dto.TaskDto;
import com.TaskFin.domain.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<TaskDto>> getAll() {
        return ResponseEntity.ok(this.taskService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> getById(@PathVariable Long id) {
        TaskDto taskDto = this.taskService.getById(id);

        if (taskDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(taskDto);
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
