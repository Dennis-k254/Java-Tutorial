package calculatorProject;

public class Subtract implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        return numbers[0] - numbers[1];
    }
}