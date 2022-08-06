class CheckingAccount extends Account
{
    CheckingAccount(double am)
    {
        amount=am;
        balance-=amount;
    }
    public String toString()
    {
        System.out.println("Withdrawal successful");
        return "Now the balance left is Rs. "+balance+" after the withdrawal of Rs. "+amount;
    }
}