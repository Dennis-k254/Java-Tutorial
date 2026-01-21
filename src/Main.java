import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        while (true) {
            System.out.print("Enter your Principal: ");
            principal = scanner.nextDouble();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter an amount between $1000 and $1,000,000");
        }

        double annualRate;
        while (true) {
            System.out.print("Enter your Annual Interest Rate (%): ");
            annualRate = scanner.nextDouble();
            if (annualRate >= 1 && annualRate <= 30)
                break;
            System.out.println("Enter interest rate between 1% and 30%");
        }

        double monthlyRate;
        int months;
        while (true) {
            System.out.print("Enter your Repayment Period (Years): ");
            byte years = scanner.nextByte();
            monthlyRate = annualRate / 100.0 / 12.0;

            if (years >=1 && years <= 30){
                months = years * 12;
                break;
            }
            System.out.println("Enter period between 1 and 30 years");
        }

        //formula for mortgage calculation
        double monthlyPayment = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Your mortgage payment per month is: %.2f%n", monthlyPayment);
    }
}