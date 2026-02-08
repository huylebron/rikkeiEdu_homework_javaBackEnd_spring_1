package com.example.studentmanagercrud.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table( name = "classrooms")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder

public class Classroom extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(nullable = false , unique = true , length = 50)
    private String code ;
    @Column( nullable = false)
    private String name ;

}
