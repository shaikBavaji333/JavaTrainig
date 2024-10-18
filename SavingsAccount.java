public class SavingsAccount implements BankAccount {

 private double balance;

  public SavingsAccount(double intialbalance){
      this.balance=intialbalance;
      System.out.println("intialbalance"+intialbalance);
  }

    @Override
    public void deposit(double amount) {
      balance=balance+amount;
      System.out.println("Deposited amount in savings account"+amount+"Total balance in your Account"+balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw amount" + amount + "from savings account" + "avilable balance" + balance);
        } else {
            System.out.println("Insufficient balance in your account");
        }
    }
    @Override
    public double checkBalance() {
        return balance;
    }
}
