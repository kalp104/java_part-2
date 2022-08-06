class SavingAccount extends Account {
    SavingAccount(double a)
    {
        amount = a;
        balance -= amount;
    }
    public String toString()
    {
        if (balance >= 3000)
        {
            return "The balance left after withdrawal of Rs " + amount + " is Rs. " + balance;
        }
        else
        {
            return "Minimum balance of Rs. 3000 is required.";
        }
    }
}













