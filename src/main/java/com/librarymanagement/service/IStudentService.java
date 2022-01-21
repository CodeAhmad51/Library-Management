package com.librarymanagement.service;

import com.librarymanagement.entity.Student;

public interface IStudentService {
    public Student registerStudent(Student student);
    public boolean loginUser(Student student);
}
