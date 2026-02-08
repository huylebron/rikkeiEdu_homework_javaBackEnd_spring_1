package com.example.studentmanagercrud.repository;

import com.example.studentmanagercrud.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClassroomRepository extends JpaRepository<Classroom , Long > {
    Optional<Classroom> findByCode(String code ) ;

    boolean existsByCode(String code);
}
