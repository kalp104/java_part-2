import java.util.Scanner;
class mainClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("Enter id : ");
        int id = sc.nextInt();
//        System.out.println("Enter ammount : ");
//        double balance = sc.nextDouble();
        Account a2=new Account(id,50000);

//        Account a1=new Account();
        a2.setdata(id,50000,7,"4-8-2022");
        System.out.println("------------------date--------------------");
        System.out.println("Account was created on : "+a2.getDt());
        System.out.println("Account Details: ");
        System.out.println("Balance : "+a2.balance);
        System.out.println("Annual Interest : "+a2.getAnn());
        System.out.println("Monthly Interest Rate : "+a2.getMonthlyInterestRate());
        System.out.println("Monthly Interest : "+a2.getMonthlyInterest());

        System.out.println("______________________________" );
        System.out.println("Enter the ammount you want to witdraw");
        double ammount = sc.nextDouble();
        a2.withdraw(ammount);
        System.out.println("______________________________" );
        System.out.println("Enter the ammount you want to diposite");
        double deposite = sc.nextDouble();
        a2.deposit(deposite);
        System.out.print("------------------------\n");
        SavingAccount a=new SavingAccount(50000);
        CheckingAccount b=new CheckingAccount(5000);
        System.out.println("For Saving Account : ");
        System.out.println(a);
        System.out.print("------------------------\n");
        System.out.println("For Checking Account : ");
        System.out.println(b);
    }
}
