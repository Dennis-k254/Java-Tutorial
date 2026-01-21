public class AbstractionDemo {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee("John Doe", 101, 5000.0);
        ContractEmployee ctEmployee = new ContractEmployee("Jane Smith", 102, 25.0, 160);

        System.out.println("Full-time Employee: " + ftEmployee.getName() + ", Salary: " + ftEmployee.calculateSalary());
        System.out.println("Contract Employee: " + ctEmployee.getName() + ", Salary: " + ctEmployee.calculateSalary());
    }
}