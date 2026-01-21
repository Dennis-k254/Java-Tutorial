public class Add implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        return numbers[0] + numbers[1];
    }
}