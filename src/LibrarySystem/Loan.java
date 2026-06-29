package LibrarySystem;

import java.time.LocalDate;

public class Loan {

    private Book book;
    private Borrower borrower;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Loan(Book book, Borrower borrower, LocalDate borrowDate, LocalDate returnDate) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
