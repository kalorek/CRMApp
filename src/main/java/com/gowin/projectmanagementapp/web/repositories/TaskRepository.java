package com.gowin.projectmanagementapp.web.repositories;

import com.gowin.projectmanagementapp.web.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
