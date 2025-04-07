package com.revature.revagenda_backend.repositories;

import com.revature.revagenda_backend.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
