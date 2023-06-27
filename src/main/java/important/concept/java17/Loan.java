package important.concept.java17;

import java.util.Objects;

public class Loan {
    private final int loadId;
    private final String accountHolder;

    //constructor
    public Loan(int loadId,String accountHolder){
        this.loadId=loadId;
        this.accountHolder=accountHolder;
    }

    //getter

    public int getLoadId() {
        return loadId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loadId=" + loadId +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return loadId == loan.loadId && accountHolder.equals(loan.accountHolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadId, accountHolder);
    }
}
