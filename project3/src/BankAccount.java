import java.util.ArrayList;
import java.util.Random;


public class BankAccount {
    //instance variables
    private int accountNumber;
    private String name;
    private double balance = 0;

    //static properties
    private static double interest = 0.3;
    private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    //The first constructor receives a name and creates bank account with balance = 0
    public BankAccount(String name) {
        this.name = name;
        /* a 6-digit random account number */
        this.accountNumber = generateSixDigitNum();
        /* So the Interest rate at the bank starts at 30% (i.e., 0.3) but each time 5 new people decide to join the bank, 2% (i.e., 0.02) is taken off the (global) interest rate.*/
        accounts.add(this);
        interest = 0.3 - (accounts.size() / 5) * 0.02;

    }

    //The second constructor receives name and balance, creates a bank amount and updates balance
    public BankAccount(String name, double balance) {
        this(name);
        this.balance = balance;
    }

    //This method performs deposit operation
    public double deposit(double money) {
        if (money < 0) {
            return -1;
        }
        balance += money;
        return money;
    }

    //This method performs withdraw operation
    public double withdrawMoney(double money) {
        if (money < 0 || balance - money < 0) {
            return -1;
        }
        balance -= money;
        return money;
    }

    //This method returns account number
    public int getAccountNumber() {
        return accountNumber;
    }

    //This method returns interest rate
    public static double getInterestRate() {
        return interest;
    }

    //This method performs a transfer operation to a single bank account
    public double transfer(BankAccount destinationBankAccount, double amount) {
        if (this.balance - amount < 0)
            return -1;
        if (destinationBankAccount == null)
            return -1;
        if (amount < 0)
            return -1;
        this.balance -= amount;
        destinationBankAccount.deposit(amount);
        return amount;
    }

    //This method performs a transfer operation to multiple accounts
    public double transfer(BankAccount[] destinationBankAccount, double amount) {
        if (destinationBankAccount == null || destinationBankAccount.length ==0)
            return -1;
        ArrayList<Double> result = new ArrayList<>();
        for (int i = 0; i < destinationBankAccount.length; i++) {
            result.add(this.transfer(destinationBankAccount[i], amount));
        }
        if (existsNegativeOne(result)) return -1;
        return amount*destinationBankAccount.length;
    }

    public static void main(String args[]) {
        //Feel free to add code that will help you test your methods
    }

    public int generateSixDigitNum() {
        Random rnd = new Random();
        int n = 100000 + rnd.nextInt(900000);
        return n;
    }

    public void updateAccounts() {

    }
    public boolean existsNegativeOne(ArrayList<Double> result){
        for (double i : result ){
            if(i==-1)
                return true;
        }
        return false;
    }
}