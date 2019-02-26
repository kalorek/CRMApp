package com.gowin.projectmanagementapp.web.repositories;

import com.gowin.projectmanagementapp.web.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
