package com.Student.student.Service;

import com.Student.student.Domain.Student;
import com.Student.student.Repository.StudentRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    @Autowired
   private StudentRepositiory repo;


    public void save(Student std)
    {
        repo.save(std);
    }

    public Student get(Long id)
    {
        return repo.findById(id).get();
    }

    public void delete(Long id)
    {
        repo.deleteById(id);
    }


    public List<Student> listAll() {
        return repo.findAll();
    }
}
