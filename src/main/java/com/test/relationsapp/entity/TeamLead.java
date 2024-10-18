package com.test.relationsapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table
public class TeamLead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lead_id;
    private String name;
    private String pozition;

    @ManyToMany(mappedBy = "leads", cascade = CascadeType.ALL)
    private List<Project> projects;
}
