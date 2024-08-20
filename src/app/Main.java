package app;

public class Main {

        public static void main(String[] args) {
            Employee employee = new Employee("Vlad","Myndru",
                    "developer", "vlad@gmail.com",
                    "380000000001",30);

            employee.display();

            Car car = new Car();
            car.start();
        }
    }
