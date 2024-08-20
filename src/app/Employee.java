package app;


public class Employee {

    private String name;
    private String secondName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String name, String secondName, String position,
                    String email, String phoneNumber, int age) {
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display() {
        System.out.println("Welcome! \nName: " + name + "\nSurname: " + secondName +
                "\nPosition: " + position + "\nE-mail: " + email +
                "\nPhone " + phoneNumber + "\nAge: " + age + "\n--------------" );

    }
}
