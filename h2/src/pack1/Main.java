package pack1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Employee em1 = new Employee("Иван", "Иванов", Employee.Gender.MALE, 30, Employee.Department.IT);
        Employee em2 = new Employee("Алиса", "Иванова", Employee.Gender.FEMALE, 32, Employee.Department.IT);
        Employee em3 = new Employee("Алексей", "Сидоров", Employee.Gender.MALE, 28, Employee.Department.IT);
        Employee em4 = new Employee("Анна", "Петрова", Employee.Gender.FEMALE, 23, Employee.Department.IT);
        Employee em5 = new Employee("Светлана", "Андреева", Employee.Gender.FEMALE, 27, Employee.Department.SALES);
        Employee em6 = new Employee("Егор", "Сурков", Employee.Gender.MALE, 29, Employee.Department.SALES);
        Employee em7 = new Employee("Дарья", "Иванова", Employee.Gender.FEMALE, 39, Employee.Department.ENGINEER);
        Employee em8 = new Employee("Михаил", "Степанов", Employee.Gender.MALE, 45, Employee.Department.ENGINEER);

        Stream<Employee> employeeStream = Stream.of(em1, em2, em3, em4, em5, em6, em7, em8);
        employeeStream.filter(employee -> employee.getDepartment().equals(Employee.Department.IT) && employee.getGender().equals(Employee.Gender.FEMALE))
                .forEach(System.out::println);
    }
}
