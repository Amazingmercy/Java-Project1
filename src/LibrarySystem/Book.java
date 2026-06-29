package LibrarySystem;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn,String title, String author, boolean isAvailable){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    //getters
    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    //setters
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTittle(String title){
        this.title = title;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

}



