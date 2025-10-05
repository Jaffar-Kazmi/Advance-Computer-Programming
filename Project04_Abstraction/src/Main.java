// Abstraction

public class Main{
    public static void main(String[] args){
        BankingOperations acc1 = new SavingsAccount("Jaffar", 50000);
        BankingOperations acc2 = new CurrentAccount("Raza", 85000);

        acc1.deposit(500);
        acc1.withdraw(1800);
        System.out.println("Final Balance (Savings): " + acc1.getBalance());

        acc2.deposit(1000);
        acc2.withdraw(2500);
        System.out.println("Final Balance (Current): " + acc2.getBalance());
    }
}