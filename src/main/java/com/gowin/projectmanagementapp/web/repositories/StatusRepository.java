package com.gowin.projectmanagementapp.web.repositories;

import com.gowin.projectmanagementapp.web.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
}
