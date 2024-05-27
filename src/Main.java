import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("A", "A", "A", "AAA", "111",
                10000, 1991, "2001-01-01");
        Employee employee2 = new Employee("B", "B", "B", "BBB", "222",
                20000, 1992, "2002-02-02");
        Employee employee3 = new Employee("C", "C", "C", "CCC", "333",
                30000, 1993, "2003-03-03");
        Manager manager = new Manager("M", "M", "M", "MMM", "444",
                40000, 1994, "2004-04-04");

        Employee[] employees = {employee1, employee2, employee3, manager};

        Manager.increaseSalaries(employees, 5000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        if (employee1.compareTo(employee2) > 0) {
            System.out.println("Employee1 is younger then employee2");
        } else if (employee1.compareTo(employee2) < 0) {
            System.out.println("Employee1 is older then employee2");
        } else {
            System.out.println("Equal");
        }

        TreeSet<Employee> employeeTreeSetName = new TreeSet<>(Employee.comparatorEmployeeName);
        employeeTreeSetName.add(employee1);
        employeeTreeSetName.add(employee2);
        employeeTreeSetName.forEach(System.out::println);

        TreeSet<Employee> employeeTreeSetDate = new TreeSet<>(Employee.comparatorEmployeeDate);
        employeeTreeSetDate.add(employee1);
        employeeTreeSetDate.add(employee2);
        employeeTreeSetDate.forEach(System.out::println);

        TreeSet<String> employeeTreeSetDateString = new TreeSet<>(Employee.comparatorStringDate);
        employeeTreeSetDateString.add("2004-01-01");
        employeeTreeSetDateString.add("2005-01-01");
        employeeTreeSetDateString.add("2004-04-01");
        employeeTreeSetDateString.forEach(System.out::println);



    }
}