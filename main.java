import java.util.*;

import Rack.book;
import Rack.library;
import Students.Student;
import Students.StudentList;
public class main {
    public static void main(String[] args) {
        library library = new library();
        StudentList studlist = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("\n1. Add Book");
            System.out.println("2. Display all books");
            System.out.println("3. Create library Card");
            System.out.println("4. Display information of all the members of the library");
            System.out.println("5. Exit");
            System.out.println("Enter Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id= sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre ");
                    String genre= sc.nextLine();

                    book book = new book(id, title, author, genre, true);
                    library.addBook(book);
                    break;
                case 2:
                    library.displayAllBooks();
                    break;
                
                 case 3 :
                System.out.println("Enter application number");
                int x = sc.nextInt();
                sc.nextLine();
                System.out.println(" Enter name");
                String studname = sc.nextLine();
                Student stud = new Student(studname, x);
                studlist.addStudent(stud);
                break;
            case 4 :
                studlist.displayStudentInfo();
                break;

            case 5 :
                System.out.println(" goodbye"); 
                break; 

            }           
            }
             while(choice!=5);
        
             System.out.println("goodbye !");
        }
        
    }
    
