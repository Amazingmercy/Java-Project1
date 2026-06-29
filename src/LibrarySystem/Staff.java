package LibrarySystem;

public class Staff extends Borrower{
    private String name;
    private int staffId;

    public Staff(String name, int staffId){
        this.name = name;
        this.staffId = staffId;
    }

    //getters
    public int getStaffId(){
        return staffId;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Override
    public int getBorrowDays(){
        return 28;
    }

    @Override
    public boolean canAddBook(){
        return true;
    }
}
