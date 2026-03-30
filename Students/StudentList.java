package Students;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added Successfully");
    }

    public void displayStudentInfo(){
        for(Student stud : students){
            System.out.println(stud);
        }

    }
    

    
}
