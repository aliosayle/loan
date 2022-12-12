public class CarLoan extends Loan
{
    private String carType;
    private double insuranceFee;

    public CarLoan(String customerName, double loanAmount, int nbYears, double interest, String carType,
            double insuranceFee) {
        super(customerName, loanAmount, nbYears, interest);
        this.carType = carType;
        this.insuranceFee = insuranceFee;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public double finalAmount()
    {
        return getLoanAmount() + getInsuranceFee();
    }

    @Override
    public String toString() {
        return "CarLoan [carType=" + carType + ", insuranceFee=" + insuranceFee + "]";
    }
    
    
    
}