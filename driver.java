import java.util.*;

public class driver
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Loan[] list = new Loan[4];
        System.out.println("Enter the tax");
        double tax = scan.nextDouble();
        System.out.println("Enter name, years, amount, interest, car type and insurance fee");
        for(int i = 0; i < 2; i++)
        {
            String customerName = scan.next();
            int nbYears = scan.nextInt();
            double loanAmount = scan.nextDouble();
            double interest = scan.nextDouble();
            String carType = scan.next();
            double insuranceFee = scan.nextDouble();
            list[i] = new CarLoan(customerName, loanAmount, nbYears, interest, carType, insuranceFee);
        }

        System.out.println("Enter name, years, amount, interest, home address and number of rooms");
        for(int i = 2; i < 4; i++)
        {
            String customerName = scan.next();
            int nbYears = scan.nextInt();
            double loanAmount = scan.nextDouble();
            double interest = scan.nextDouble();
            String homeAddress = scan.next();
            int nbOfRooms = scan.nextInt();
            list[i] = new HomeLoan(customerName, loanAmount, nbYears, interest, homeAddress, nbOfRooms);
        }

        for(int i = 0; i < list.length; i++)
        {
            if(list[i] instanceof CarLoan)
                System.out.println("The final amout of loan " + i+1 + " is " + ((CarLoan)list[i]).finalAmount());
            else if(list[i] instanceof HomeLoan)
                System.out.println("The final amout of loan " + i+1 + " is " + ((HomeLoan)list[i]).finalAmount(tax));
        }

        for(int i = 0; i < list.length; i++)
        {
            if(list[i] instanceof CarLoan)
                System.out.println("The insurance fees of car " + i+1 + " is " + ((CarLoan)list[i]).getInsuranceFee());
        }   
        scan.close();     

    }
}