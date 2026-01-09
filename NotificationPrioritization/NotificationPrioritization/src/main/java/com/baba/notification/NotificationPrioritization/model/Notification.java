package com.baba.notification.NotificationPrioritization.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String title;
    private String message;
    private String type;
    private String status;
    private Date createdAt;
    @ManyToOne
    private User user;
}
