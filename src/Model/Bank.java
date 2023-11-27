package Model;

public class Bank {
    private  String balance;

    public Bank(String balance) {
        this.balance = balance;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance='" + balance + '\'' +
                '}';
    }
}
