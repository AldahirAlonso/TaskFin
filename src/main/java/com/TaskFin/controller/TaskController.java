package com.TaskFin.controller;

import com.TaskFin.persistence.crud.CrudTaskEntity;
import com.TaskFin.persistence.entity.TaskEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private CrudTaskEntity crudTaskEntity;

    public TaskController(CrudTaskEntity crudTaskEntity) {
        this.crudTaskEntity = crudTaskEntity;
    }

    @GetMapping("/tasks")
    public List<TaskEntity> getTasks() {
        return (List<TaskEntity>) crudTaskEntity.findAll();
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
