public class YourFirstAccount {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthew's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);

        matthewsAccount.withdraw(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}/* 
 * DO NOT TOUCH THIS !
 */

public class Account {

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    public double saldo() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
