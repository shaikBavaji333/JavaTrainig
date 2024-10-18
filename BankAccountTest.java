public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount s=new SavingsAccount(1000);
        s.deposit(500);
        s.withdraw(100);

        double balance=s.checkBalance();
        System.out.println("checkbalance"+balance);
    }
}
