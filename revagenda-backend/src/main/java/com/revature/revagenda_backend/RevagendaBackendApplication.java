package com.revature.revagenda_backend;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.revagenda_backend.models.Task;
import com.revature.revagenda_backend.models.User;
import com.revature.revagenda_backend.services.TaskService;
import com.revature.revagenda_backend.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication(scanBasePackages = {
		"com.revature.revagenda_backend.controllers",
		"com.revature.revagenda_backend.services",
		"com.revature.revagenda_backend.repositories"})
public class RevagendaBackendApplication {

	public static void main(String[] args) throws JsonProcessingException {
		ApplicationContext ac = SpringApplication.run(RevagendaBackendApplication.class, args);

		UserService userService = ac.getBean(UserService.class);
		TaskService taskService = ac.getBean(TaskService.class);

		User kyle = new User("Kyle", "password");

		userService.save(kyle);

		Task task = new Task("first task", "This is the first task!", "2025-04-10");
		task.setUser(kyle);
		kyle.appendTask(task);

		taskService.save(task);



		List<User> userList = userService.getAll();

		User result = userList.get(0);

		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(result));

		User kyleResultByUSername = userService.findByUsername("Kyle");
		System.out.println(kyleResultByUSername);

		System.out.println(userService.findKyle());

	}

}
