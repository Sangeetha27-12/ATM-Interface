package atm_interface;

import java.util.ArrayList;

public class Account {

    private String userId;
    private String pin;
    private double balance;

    private ArrayList<Transaction> history = new ArrayList<>();

    public Account(String userId, String pin, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {

        if (balance >= amount) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public void addTransaction(Transaction t) {
        history.add(t);
    }

    public ArrayList<Transaction> getHistory() {
        return history;
    }
}
