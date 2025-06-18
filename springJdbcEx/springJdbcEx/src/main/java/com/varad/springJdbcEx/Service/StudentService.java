package com.varad.springJdbcEx.Service;

import com.varad.springJdbcEx.Model.Student;
import com.varad.springJdbcEx.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s1) {
        repo.save(s1);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
