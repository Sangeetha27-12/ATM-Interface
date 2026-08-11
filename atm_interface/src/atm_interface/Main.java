package atm_interface;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addAccount(new Account("1001", "1234", 5000));
        bank.addAccount(new Account("1002", "5678", 3000));

        Atm atm = new Atm(bank);
        atm.start();
    }
}
