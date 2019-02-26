package com.gowin.projectmanagementapp.web.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime created;
    @Column(nullable = false)
    private String subject;
    @ManyToOne
    @JoinColumn
    private Project project;
    @Column(nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn
    private Status status;
    @ManyToOne
    @JoinColumn
    private Priority priority;
    @ManyToMany
    private List<User> actualUsers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public List<User> getActualUsers() {
        return actualUsers;
    }

    public void setActualUsers(List<User> actualUsers) {
        this.actualUsers = actualUsers;
    }
}
