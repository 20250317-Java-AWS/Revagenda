package com.revature.revagenda_backend.services;

import com.revature.revagenda_backend.repositories.TaskRepository;

public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}
