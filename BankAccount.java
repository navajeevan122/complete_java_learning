class Account
{
    String holderName;
    double balance;
    Account(String holderName,double balance)
    {
        this.holderName=holderName;
        this.balance=balance;
    }

    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("deposit: "+amount);
    }
    
    void withDraw(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdraw: "+amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void displayDetails()
    {
        System.out.println("AccountHolderName: "+holderName);
        System.out.println("Account Balance: "+balance);
    }
}
class BankAccount
{
    public static void main(String args[])
    {
        Account account1=new Account("Jeevan",10000);
        account1.displayDetails();
        account1.deposit(5000);
        account1.displayDetails();
        account1.withDraw(3000);
        account1.displayDetails();

        Account account2=new Account("Ganesh",60000);
        account2.displayDetails();
        account2.deposit(5000);
        account2.displayDetails();
        account2.withDraw(3000);
        account2.displayDetails();

    }
}