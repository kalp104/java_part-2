// 21CE084
// kalp pandya
/*
  (Subclasses of Account) In Programming Exercise 9.7, the Account class was
  defined to model a bank account. An account has the properties account number,
  balance, annual interest rate, and date created, and methods to deposit and
  withdraw funds. Create two subclasses for checking and saving accounts. A
  checking account has an overdraft limit, but a savings account cannot be
  overdrawn.

  Draw the UML diagram for the classes and then implement them. Write
  a test program that creates objects of Account, SavingsAccount, and
  CheckingAccount and invokes their toString() methods.
 */
import java.util.Scanner;
class Account
{
    private int id = 0;
    double balance = 0, annualInterest = 0, amount;
    String dateCreated;

    Account()
    {
//        id = 0;
//        balance = 50000;
//        annualInterest = 7;
    }
    Account(int i, double bal)
    {
        id = i;
        balance = bal;
    }
    void setdata(int i, double bal, double aInt, String dt)
    {
        id = i;
        balance = bal;
        annualInterest = aInt;
        dateCreated = dt;
    }
    int getId()
    {
        return id;
    }
    double getBal()
    {
        return balance;
    }
    double getAnn()
    {
        return annualInterest;
    }
    double getMonthlyInterestRate()
    {
        return (annualInterest * 100) / 12;
    }
    double getMonthlyInterest()
    {
        return balance * (annualInterest * 100) / 12;
    }
    String getDt()
    {
        return dateCreated;
    }
    void withdraw(double amount)
    {
        balance -= amount;
        if (balance > 0)
        {
            System.out.println("The balance left after withdrawal of Rs " + amount + " is Rs. " + balance);
        }
        else
        {
            System.out.println("Withdrawal of Rs " + amount + " is not possible ");
        }
    }
    void deposit(double amount)
    {
        balance += amount;
        System.out.println("The balance left after deposit of Rs." + amount + " is Rs. " + balance);
    }
}


