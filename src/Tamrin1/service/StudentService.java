package Tamrin1.service;

import Tamrin1.Repository.StudentRepository;

public class StudentService {
    public void getAllStudents(){
        StudentRepository studentRepository=new StudentRepository();
        studentRepository.findAll();
    }
}
