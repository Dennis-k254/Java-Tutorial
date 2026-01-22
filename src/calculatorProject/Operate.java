package calculatorProject;

public interface Operate {
    // Variable arguments (varargs) allow passing multiple numbers
    Double getResult(Double... numbers);
}