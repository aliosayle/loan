public class Loan
{
    private String customerName;
    private double loanAmount;
    private int nbYears;
    private double interest;

    public Loan(String customerName, double loanAmount, int nbYears, double interest) 
    {
        this.customerName = customerName;
        setLoanAmount(loanAmount);
        setNbYears(nbYears);
        setInterest(interest);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if(loanAmount > 0)
        this.loanAmount = loanAmount;
        else
        this.loanAmount = 0;
    }

    public int getNbYears() {
        return nbYears;
    }

    public void setNbYears(int nbYears) {
        if(nbYears > 0)
        this.nbYears = nbYears;
        else
        this.nbYears = 0;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        if(interest >= 5 && interest <= 8)
        this.interest = interest;
        else 
        this.interest = 5;
    }

    
}