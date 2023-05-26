package com.itmz.todoListrest.repository;

import com.itmz.todoListrest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    public Task save(Task task);

}
