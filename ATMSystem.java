import java.util.Scanner;

class ATM {
    private double balance;
    private int pin;

    // Constructor
    public ATM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    // Method to verify PIN
    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Your Balance: ₹" + balance);
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully Deposited ₹" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw Money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an ATM object with default balance 5000 and pin 1234
        ATM atm = new ATM(5000, 1234);

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (!atm.verifyPin(enteredPin)) {
            System.out.println("Incorrect PIN! Exiting...");
            return;
        }

        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}