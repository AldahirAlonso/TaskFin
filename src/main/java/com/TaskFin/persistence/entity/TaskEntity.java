package com.TaskFin.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Task_Fin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150, unique = true)
    private String taskName;

    @Column(nullable = false, length = 150)
    private String taskDescription;

    @Column(nullable = false, length = 150)
    private String taskStatus;

    @Column(nullable = false, length = 150)
    private String taskStartTime;

    @Column(nullable = false, length = 150)
    private String taskEndTime;

    @Column(nullable = false, length = 150)
    private String taskStartDate;

    @Column(nullable = false, length = 150)
    private String taskEndDate;
}
