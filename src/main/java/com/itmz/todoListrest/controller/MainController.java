package com.itmz.todoListrest.controller;

import com.itmz.todoListrest.model.Task;
import com.itmz.todoListrest.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class MainController {

    private TaskRepository taskRepository;

    public MainController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/all")
    public List<Task> findAll(){
        return taskRepository.findAll();

    }

    @PostMapping("/addTask")
    public Task addTask(@RequestBody Task task){
        return taskRepository.save(task);
    }
}
