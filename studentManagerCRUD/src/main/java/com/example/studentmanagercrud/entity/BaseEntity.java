package com.example.studentmanagercrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public class BaseEntity {
    @CreatedDate
    @Column( name = "created_at" , nullable = false , updatable = false)
    protected Instant createAt ;

    @LastModifiedDate
    @Column( name = "updated_at" , nullable = false)

    protected Instant updateAt ;
}
