import java.util.Scanner;
public class compoundInterestCalculator {
    public static void main(String[] args) {

        double amount;
        double principle;
        double rate;
        int timesCompounded;
        int years;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle:  ");
        principle = scanner.nextDouble();
        System.out.print("Enter the rate:  ");
        rate = scanner.nextDouble()/100;
        System.out.print("Enter the time compounded:  ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the years:  ");
        years = scanner.nextInt();


        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years ) ;
        System.out.println("The compound interest is: " + "$"+ amount);
    }
}
