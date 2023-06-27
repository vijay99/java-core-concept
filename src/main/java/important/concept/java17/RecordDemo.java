package important.concept.java17;

public class RecordDemo {
    public static void main(String[] args) {
        //traditional java way
        Loan loanObj = new Loan(101,"Amit");
        System.out.println("Loan account holder is :"+loanObj.getAccountHolder());

        //using java 17 (actually java 16) feature Record instead a regular class
        LoanRecord loanRecord = new LoanRecord(201,"Sexsena");
        System.out.println("Loan account holder is :"+loanRecord.accountHolder());
    }
}
