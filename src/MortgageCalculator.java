import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter your Annual Interest Rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter your Repayment Period (Years): ");
        byte years = scanner.nextByte();

        int months = years * 12;
        double monthlyRate = annualRate / 100.0 / 12.0;

        //formula for mortgage calculation
        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, months))/(Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Your mortgage payment per month is: %.2f%n", monthlyPayment);
    }
}
