public class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public static void main(String[] args) {
        Student john = new Student("John", 25, "23 East California");

        System.out.println("Name: " + john.getName());
        System.out.println("Age: " + john.getAge());
        System.out.println("Address: " + john.getAddress());
    }
}
