package LibrarySystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public Loan borrowBook(String isbn, Borrower borrower){
        Book book = null;
        //if book is in the arrayLst
        for (Book b : books) {
            if (b.getIsbn().equalsIgnoreCase(isbn)) {
                book = b;
                break;
            }
        }

        if (book == null) {
            System.out.println("Book not found.");
            return null;
        }

        //if book has been borrowed
        if(!checkAvailability(book)){
            System.out.println("Book has been borrowed");
            return null;
        }

        LocalDate borrowDate = LocalDate.now();
        LocalDate dueDate = borrowDate.plusDays(borrower.getBorrowDays());

        book.setIsAvailable(false);
        Loan loan = new Loan(book, borrower, borrowDate, dueDate);
        loans.add(loan);

        System.out.println("Book borrowed successfully.");
        System.out.println("Borrower: " + borrower.getName());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Due Date: " + dueDate);

        return loan;


    }

    public void returnBook(Loan loan) {
        Book book = loan.getBook();
        loans.remove(loan);
        book.setIsAvailable(true);
        System.out.println("Book returned successfully.");
    }

    public void viewBooks(){
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println("------------------------");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Available: " + book.getIsAvailable());
        }
    }

    private boolean checkAvailability(Book book){
        return book.getIsAvailable();
    }
}
