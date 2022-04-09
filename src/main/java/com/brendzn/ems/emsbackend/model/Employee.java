package com.brendzn.ems.emsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private long id;

    @Column(name = "first_name")
    @Getter @Setter
    private String firstName;

    @Column(name = "last_name")
    @Getter @Setter
    private String lastName;

    @Column(name = "email_address")
    @Getter @Setter
    private String emailAddress;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    @Getter @Setter
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    @Getter @Setter
    private LocalDateTime updatedAt;
}
