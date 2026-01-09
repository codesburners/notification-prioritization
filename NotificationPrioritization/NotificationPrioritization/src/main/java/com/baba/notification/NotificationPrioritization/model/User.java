package com.baba.notification.NotificationPrioritization.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

@Entity
@Table(name="users")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
}
