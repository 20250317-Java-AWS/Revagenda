package com.revature.revagenda_backend.controllers;

import com.revature.revagenda_backend.services.TaskService;

public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
}
