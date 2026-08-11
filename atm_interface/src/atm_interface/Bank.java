package atm_interface;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account login(String id, String pin) {

        for (Account acc : accounts) {

            if (acc.getUserId().equals(id)
                    && acc.getPin().equals(pin)) {
                return acc;
            }
        }

        return null;
    }

    public Account findAccount(String id) {

        for (Account acc : accounts) {

            if (acc.getUserId().equals(id)) {
                return acc;
            }
        }

        return null;
    }
}