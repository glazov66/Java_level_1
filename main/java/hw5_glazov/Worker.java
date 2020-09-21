package hw5_glazov;

public class Worker {
    String number;
    String lastName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Worker(String number, String lastName, String position, String email, String phone, int salary, int age){
        this.number = number;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Worker #" + number + ':' + "\n" +
                "lastName: " + lastName + "\n" +
                "position: " + position + "\n" +
                "email: " + email + "\n" +
                "phone: " + phone + "\n" +
                "salary: " + salary + "\n" +
                "age: " + age + "\n";
    }
}
