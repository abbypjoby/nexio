package com.example.nexio.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "table1")
public class table1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "task")
    private String task;

}
