package domain;

public class Student {
    private String name;
    private static int id=0;
    private int studentId;

    public Student(String name){
        this.name=name;
        studentId=id;
        id++;
    }
    @Override
    public String toString(){
        return this.name+Integer.toString(studentId);
    }
}
