public class SavingsAccount extends BankAccount{
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance-amount >= MIN_BALANCE){
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance : " + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance must be maintained.");
        }
    }
}
