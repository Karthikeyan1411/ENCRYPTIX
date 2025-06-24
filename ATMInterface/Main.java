package ATMInterface;

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance ₹1000
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
