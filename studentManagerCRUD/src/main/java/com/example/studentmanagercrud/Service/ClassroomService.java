package com.example.studentmanagercrud.Service;

import com.example.studentmanagercrud.dto.req.ClassroomCreateRequest;
import com.example.studentmanagercrud.dto.req.ClassroomUpdateRequest;
import com.example.studentmanagercrud.dto.res.ClassroomResponse;
import org.hibernate.query.Page;

import java.awt.print.Pageable;
import java.util.Calendar;

public interface ClassroomService {

     ClassroomResponse create (ClassroomCreateRequest req) ;
     ClassroomResponse getById ( Long id ) ;

    Page<ClassroomResponse> getAll(Pageable pageable);
     ClassroomResponse update (Long id , ClassroomUpdateRequest request) ;
     void delete( Long id ) ;


}
