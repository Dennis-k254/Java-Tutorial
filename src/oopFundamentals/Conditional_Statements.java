package oopFundamentals;

import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {

        // -----------------------------
        // Control Flow / Conditionals
        // -----------------------------

        // Comparison operators (== checks equality)
        int x = 1;
        int y = 1;
        System.out.println(x == y); // true

        // Logical operators: &&, ||, !
        int temperature = 22;

        // && means BOTH conditions must be true
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm); // true for 22

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        // Eligibility example:
        // (high income OR good credit) AND (no criminal record)
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible); // true

        // if / else if / else (order matters)
        if (temperature > 30) {
            System.out.println("It's a hot day");
        } else if (temperature > 20) {
            System.out.println("It's a beautiful day");
        } else {
            System.out.println("It's a cold day");
        }

        // Ternary operator: quick if/else when it’s simple
        String className = (temperature > 20) ? "Warm" : "Cold";
        System.out.println(className);

        // switch: good when you’re matching one value against specific cases
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        // -----------------------------
        // Loops
        // -----------------------------

        // for loop: when you know how many times you want to loop
        for (int k = 0; k < 5; k++) {
            System.out.println("Hello World " + k);
        }

        // while loop: when you don’t necessarily know the number of loops in advance
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World " + i);
            i++;
        }

        // do-while: always runs at least once
        int j = 0;
        do {
            System.out.println("Hello World " + j);
            j++;
        } while (j < 0); // condition is false but it still prints once

        // break + continue example with user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("quit")) {
                break; // exit the loop completely
            }

            if (input.equals("pass")) {
                continue; // skip printing and go back to the top
            }

            System.out.println(input);
        }

        scanner.close();

        // for-each loop: easiest way to loop through an array
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
