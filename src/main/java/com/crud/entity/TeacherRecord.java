package com.crud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teacher")
public class TeacherRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tId")
    private int tId;

    @Column(name = "name",length = 20,nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

@Column(name = "number")
    private long number;

}
