package ATMInterface;

import java.util.Scanner;

public class ATM implements ATMOperations {
    private BankAccount account;
    private Scanner scan;

    public ATM(BankAccount account) {
        this.account = account;
        this.scan = new Scanner(System.in);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            account.deposit(amount);
            System.out.println("Deposited : Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (account.withdraw(amount)) {
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: Rs." + account.getBalance());
    }

    public void start() {
        while (true) {
            System.out.println("======= ATM MENU =======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount: Rs.");
                    deposit(scan.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount: Rs.");
                    withdraw(scan.nextDouble());
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
