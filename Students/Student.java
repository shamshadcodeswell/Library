package Students;

public class Student{
    String name;
    int applicationNumber;
    public Student(String name, int applicationNumber){
        this.name= name;
        this.applicationNumber = applicationNumber;
    }
    /* public void displayStudentInfo(){
        System.out.println("Application number = "+applicationNumber+" | name = "+name);
    } */
   @Override
   public String toString() {
       return "Application number = "+applicationNumber+" | name = "+name;
   }
}
