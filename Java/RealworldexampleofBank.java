class Account{
    int acc_no;
    String name;
    float amount;
    void insert(int a,String n,float amt)
    {
        acc_no=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt)
    {
        amount+=amt;
        System.out.println(amt+" deposited");
    }
    void withdraw(float amt)
    {
        if (amt>amount)
        {
            System.out.println("Insufficient Balance");
        }
        else{
            amount-=amt;
            System.out.println(amt+" Withdraw");
        }
    }
    void checkBalance()
    {
        System.out.println("Balance is:"+amount);
    }
    void display()
    {
        System.out.println(acc_no+" "+name+" "+amount);
    }
}
class TestAccount{
    public static void main(String args[])
    {
        Account a1=new Account();
        a1.insert(467567,"Samit_Verma",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(1000);
        a1.checkBalance();
    }
}