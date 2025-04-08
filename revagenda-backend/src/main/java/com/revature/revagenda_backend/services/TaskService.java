package com.revature.revagenda_backend.services;

import com.revature.revagenda_backend.models.Task;
import com.revature.revagenda_backend.repositories.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task save(Task task){
        return this.taskRepository.save(task);
    }

    public List<Task> saveAll(List<Task> taskList) {
        return this.taskRepository.saveAll(taskList);
    }


}
