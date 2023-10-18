public class TestBank
{
    public static void main(String [] args)
    {
        BankAccount b = new BankAccount(2,"Tarek", 0);
        System.out.println("Account number "+b.getAccountNumber()+" belonging to Mr."+b.getAccountHolderName()+" has a balance of: "+b.getBalance());
        b.withdraw(50);
        b.deposit(500);
        b.withdraw(50);
        System.out.println("Account number "+b.getAccountNumber()+" belonging to Mr."+b.getAccountHolderName()+" has a balance of: "+b.getBalance());    }
}
