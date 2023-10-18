public class BankAccount
{
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    BankAccount(){}
    BankAccount(int a,String nom,int b)
    {
        this.accountNumber=a;
        this.accountHolderName=nom;
        this.balance=b;
    }
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    public String getAccountHolderName()
    {
        return this.accountHolderName;
    }
    public int getBalance()
    {
        return this.balance;
    }
    public void deposit(int amount)
    {
        balance+=amount;
    }
    public void withdraw(int amount)
    {
        if(balance>=amount) balance-=amount;
        else{
            System.out.println("Insufficient balance");
        }
    }
}

