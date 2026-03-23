import java.util.*;

import library_cli.book;
import library_cli.library;
public class main {
    public static void main(String[] args) {
        library library = new library();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("\n1. Add Book");
            System.out.println("2. Display all books");
            System.out.println("3.exit");
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

            }           
            }
             while(choice!=3);
        
             System.out.println("goodbye !");
        }
        
    }
    
