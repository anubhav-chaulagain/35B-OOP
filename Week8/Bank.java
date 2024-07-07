package Week8;

public class Bank {
    public static void main(String[] args) {
        
    }   
}

class BankAccount {
    private String account_num;
    private String account_holder_name;
    private double account_balance;

    BankAccount(String account_num, String account_holder_name, int account_balance) {
        this.account_balance=account_balance;
        this.account_holder_name=account_holder_name;
        this.account_num=account_num;
    }

    public void deposit(int amt){
        this.account_balance+=amt;
    }
    
    public void withdraw(int amt){
        if(this.account_balance-amt<0){
            System.out.println("Amt goes -ve so cannot perform this action");
            return;
        } else {
            this.account_balance-=amt;
            System.out.println("Amount Withdrawn Successfully");
        }
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public String getAccount_num() {
        return account_num;
    }
}
