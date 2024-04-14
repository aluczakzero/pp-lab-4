import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Nowak", 10000);
        employees[1] = new Worker("Roman Kowalski", 30000);
        employees[2] = new Employee("Michał Wiśniewski", 25000);
        employees[3] = new Employee("Kamil Kowalski", 40000);
        employees[4] = new Worker("Łukasz Nowak", 60000);

        
        System.out.println("Dane pracownika o indeksie 3: " + employees[3]);

        employees[3].setSalary(50000);

        for (Employee employee : employees) {
            System.out.println(employee);;
        }
        
    }
}