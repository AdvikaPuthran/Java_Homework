package abstractClassAndInterfaceAssignment;

interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
}

class CustomCheckingAccount implements BankOperations {
    double balance;

    public CustomCheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        CustomCheckingAccount account = new CustomCheckingAccount(1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0); // Attempting to withdraw more than balance
    }
}
