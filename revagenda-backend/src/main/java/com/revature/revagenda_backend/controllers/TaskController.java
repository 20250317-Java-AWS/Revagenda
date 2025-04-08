package com.revature.revagenda_backend.controllers;

import com.revature.revagenda_backend.services.TaskService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
}
