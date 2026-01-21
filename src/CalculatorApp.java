import java.util.*;

public class CalculatorApp {
    public static void main(String[] args) {
        String inputExpression = ReadInput.read();

        // Splitting numbers and operators using regex
        String[] numbersArray = inputExpression.split("[-+*/]");
        String[] operatorsArray = inputExpression.split("[0-9]+");

        Queue<String> numbers = new LinkedList<>(Arrays.asList(numbersArray));
        Queue<String> operators = new LinkedList<>(Arrays.asList(operatorsArray));

        // Initial result is the first number
        Double res = Double.parseDouble(numbers.poll());

        while (!numbers.isEmpty()) {
            String opr = operators.poll();
            if (opr.isEmpty()) opr = operators.poll(); // Skip empty leading matches

            Operate operate;
            // Switch case for choosing the operation
            switch (opr) {
                case "+": operate = new Add(); break;
                case "-": operate = new Subtract(); break;
                case "*": operate = new Multiply(); break;
                case "/": operate = new Divide(); break;
                default: continue;
            }

            Double num = Double.parseDouble(numbers.poll());
            res = operate.getResult(res, num); // Update running result [01:53:02]
        }

        System.out.println("Final Result: " + res);
    }
}