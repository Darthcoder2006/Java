package labsheet;

public class Lab6 {
    
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
            return true;
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }
}

public static void main(String[] args) {
    BankAccount account = new BankAccount(1000.0);
    account.withdraw(500.0);
    account.withdraw(600.0);
    account.deposit(200.0);
    account.withdraw(600.0);
}