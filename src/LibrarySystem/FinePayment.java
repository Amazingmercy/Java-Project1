package LibrarySystem;

public class FinePayment {

    public int calculateFine(int daysLate){
        if (daysLate <= 0) {
            return 0;
        }
        int finePerDay = 50;
        return daysLate * finePerDay;
    }
}
