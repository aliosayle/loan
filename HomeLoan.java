public class HomeLoan extends Loan
{
    private String homeAdress;
    private int nbOfRooms;

    public HomeLoan(String customerName, double loanAmount, int nbYears, double interest, String homeAdress,
            int nbOfRooms) {
        super(customerName, loanAmount, nbYears, interest);
        this.homeAdress = homeAdress;
        this.nbOfRooms = nbOfRooms;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public int getNbOfRooms() {
        return nbOfRooms;
    }

    public void setNbOfRooms(int nbOfRooms) {
        this.nbOfRooms = nbOfRooms;
    }

    public double finalAmount(double tax)
    {
        return (getLoanAmount() * Math.pow((1 + getInterest()), getNbYears()) + (getLoanAmount() *((Math.pow((1 + getInterest()), getNbYears())) * tax)));
    }

    @Override
    public String toString() {
        return "HomeLoan [homeAdress=" + homeAdress + ", nbOfRooms=" + nbOfRooms + "]";
    }
    
}