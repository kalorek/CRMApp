package com.gowin.projectmanagementapp.web.repositories;

import com.gowin.projectmanagementapp.web.entities.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
