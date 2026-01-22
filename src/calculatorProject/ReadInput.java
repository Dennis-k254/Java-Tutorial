package calculatorProject;

import java.util.Scanner;

public class ReadInput {
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input expression (e.g., 4+5*3/2):");
        return scanner.nextLine();
    }
}