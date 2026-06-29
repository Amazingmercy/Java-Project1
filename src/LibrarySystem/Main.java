package LibrarySystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean running = true;

        Borrower borrower;
        Book book = null;
        Loan loan = null;

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");
        System.out.println("Select User Type");
        System.out.println("1. Student");
        System.out.println("2. Staff");
        System.out.print("Choice: ");
        int userType = scanner.nextInt();
        scanner.nextLine();

        if (userType == 1){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Matric No: ");
            int matricNo = scanner.nextInt();
            scanner.nextLine();
            borrower = new Student(name, matricNo);
        } else if (userType == 2) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Staff Id: ");
            int staffId = scanner.nextInt();
            scanner.nextLine();
            borrower = new Staff(name, staffId);
        } else {
            System.out.println("Invalid choice. Try again.\n");
            return;
        }


        while(running) {
            System.out.println("1. Add Book(staffs only!)");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Books");
            System.out.println("5. Switch User");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    if (!borrower.canAddBook()) {
                        System.out.println("Only staff members can add books.");
                        break;
                    }

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    book = new Book(title, author, isbn, true);
                    library.addBook(book);

                    break;

                case 2:
                    if (book == null) {
                        System.out.println("No book in the Library\n");
                        break;
                    }

                    library.viewBooks();
                    System.out.print("Enter the ISBN of the book to borrow: ");
                    String isbnOfBook = scanner.nextLine();
                    loan = library.borrowBook(isbnOfBook, borrower);
                    break;

                case 3:
                    if (loan == null) {
                        System.out.println("You have not borrowed any book.\n");
                        break;
                    }
                    library.returnBook(loan);
                    break;

                case 4:
                    library.viewBooks();
                    break;

                case 5:

                    System.out.println("1. Student");
                    System.out.println("2. Staff");
                    System.out.print("Choice: ");

                    userType = scanner.nextInt();
                    scanner.nextLine();

                    if (userType == 1) {

                        System.out.print("Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Matric No: ");
                        int matricNo = scanner.nextInt();
                        scanner.nextLine();

                        borrower = new Student(name, matricNo);

                    } else if (userType == 2) {

                        System.out.print("Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Staff Id: ");
                        int staffId = scanner.nextInt();
                        scanner.nextLine();

                        borrower = new Staff(name, staffId);
                    } else {
                        System.out.println("Invalid choice. Try again.\n");
                        return;
                    }
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using the Library System.\n");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }

        scanner.close();
    }
}
