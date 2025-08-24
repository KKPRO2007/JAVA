package Lab_sheet_2;

public class Experiment_5 {
    private String accountNumber;
    private double balance;

    public Experiment_5(String accountNumber, double balance) {
        if (accountNumber == null || balance < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative.");
            return;
        }
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }

   
    public static void main(String[] args) {
        Experiment_5 account = new Experiment_5("AC12345", 1000);
        account.displayAccount();

        account.setBalance(-500); 
        account.displayAccount();

        account.setBalance(1500);
        account.displayAccount();
    }
}
