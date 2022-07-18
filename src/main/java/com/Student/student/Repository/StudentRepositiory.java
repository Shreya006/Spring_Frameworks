package com.Student.student.Repository;

import com.Student.student.Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepositiory extends JpaRepository<Student, Long> {


}
