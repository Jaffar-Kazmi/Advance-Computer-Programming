public abstract class BankAccount implements BankingOperations {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    @Override
    public abstract void withdraw(double amount);

    @Override
    public double getBalance() {
        return balance;
    }
}

