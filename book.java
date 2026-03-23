package library_cli;
public class book {
    private int bookid;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public book( int bookid, String title, String author, String genre, boolean isAvailable ){
        this.bookid = bookid;
        this.title = title;
        this.author= author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    //getters
    public int getBookid() {return bookid;}
    public String getTitle () {return title;}
    public String getAuthor() {return author;}
    public String getGenre() {return genre;}
    public boolean getisAvailable(){return isAvailable;}

    @Override /*toString() is a function which every object has and gets called whenever we System.out.print(object); which converts objects address to a string, 
    but here we are overiding means we are overwriting this function to return a string which contains instance variables pf that object */
    public String toString() {
        return bookid+" | "+title+" | "+author+" | "+" | "+genre+" | "+isAvailable;
    }

}
