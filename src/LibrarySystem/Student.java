package LibrarySystem;

public class Student extends Borrower{
    private String name;
    private int matricNo;

    public Student(String name, int matricNo){
        this.name = name;
        this.matricNo = matricNo;
    }

    //getters
    public int getMatricNo(){
        return matricNo;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMatricNo(int matricNo) {
        this.matricNo = matricNo;
    }

    @Override
    public int getBorrowDays(){
        return 14;
    }

    @Override
    public boolean canAddBook(){
        return false;
    }
}

