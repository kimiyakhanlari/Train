package Tamrin1;
import Tamrin1.service.StudentService;

public class TestDriver {
    public static void main(String[] args) {
        StudentService studentService=new StudentService();
        studentService.getAllStudents();
    }
}
