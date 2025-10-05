public class CurrentAccount extends BankAccount{
    private static final double OVERDRAFT_LIMIT = -1000;

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance-amount >= OVERDRAFT_LIMIT){
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }
}
