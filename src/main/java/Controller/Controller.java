package Controller;

import repository.StudentRepository;

public class Controller {
    private StudentRepository studentRepository;

    public Controller(){
        studentRepository=new StudentRepository();
    }
    public void addStudent(String name){
        //exceptii bla bla
        studentRepository.addStudent(name);
    }
    public String PrintStudents(){
        return studentRepository.toString();
    }
}
