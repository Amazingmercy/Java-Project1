package LibrarySystem;
import java.util.Scanner;

public abstract class Borrower {

    protected String name;

    public String getName() {
        return name;
    }


    public abstract int getBorrowDays();

    public abstract boolean canAddBook();
}
