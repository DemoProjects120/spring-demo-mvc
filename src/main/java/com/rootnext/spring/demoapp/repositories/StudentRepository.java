package com.rootnext.spring.demoapp.repositories;

import com.rootnext.spring.demoapp.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sanjoy on 8/25/15.
 */
public interface StudentRepository extends CrudRepository<Student, Long>{
}
