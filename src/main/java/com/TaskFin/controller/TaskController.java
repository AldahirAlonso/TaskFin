package com.TaskFin.controller;

import com.TaskFin.persistence.crud.CrudTaskEntity;
import com.TaskFin.persistence.entity.TaskEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/tasks")
    public ResponseEntity<TaskEntity> createTask(@RequestBody TaskEntity task) {
        TaskEntity saved = crudTaskEntity.save(task);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
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
