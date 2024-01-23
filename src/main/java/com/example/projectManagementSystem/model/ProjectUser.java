package com.example.projectManagementSystem.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ProjectUser {
    @EmbeddedId
    private ProjectUserId id;

    @Column(name = "is_admin")
    private boolean isAdmin;

    @Column(name = "created_date")
    private LocalDate createdDate;
}
