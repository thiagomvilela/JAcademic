package interfaces;

import java.util.List;

import models.bean.Student;

public interface IRepositoryAcademicNotes {
    
    public Student getStudentById(int id);

    public List<Integer> getNotesStudentById(int id);

    public Student getStudentByName(String name);

    public Student getNotesStudentByName(String name);

    public List<Student> getStudents();   

}
