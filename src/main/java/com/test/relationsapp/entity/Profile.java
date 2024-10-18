package com.test.relationsapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profile_id;
    private String phoneNumber;
    private String address;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;



}
