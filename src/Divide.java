public class Divide implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        if (numbers[1] != 0) {
            return numbers[0] / numbers[1];
        }
        return 0.0; // Simple error handling for division by zero
    }
}