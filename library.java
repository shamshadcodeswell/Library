package library_cli;
import java.util.ArrayList;

public class library {
    private ArrayList<book> books = new ArrayList<>();

    public void addBook(book book){
        books.add(book);
        System.out.println(" Book has been added");
    }

    public void displayAllBooks(){
        if (books.isEmpty()){
            System.out.println("no books present");
        }
        for(book b: books){
            System.out.println(b);
        }
    }
}
