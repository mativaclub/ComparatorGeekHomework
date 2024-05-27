import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private static final int CURRENT_YEAR = 2024;
    private String name;
    private String midName;
    private String surName;
    private String position;
    private String phone;
    private int salary;
    private int birth;
    private String date;


    public Employee(String name, String midName, String surName, String position, String phone, int salary, int birth, String date) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
        this.date = date;
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }

    public static Comparator<Employee> comparatorEmployeeName = (Employee e1, Employee e2) -> {
        return e1.name.compareTo(e2.name);
    };

    public static Comparator<Employee> comparatorEmployeeDate = (Employee e1, Employee e2) -> {
        return e1.date.compareTo(e2.date);
    };

    public static Comparator<String> comparatorStringDate = (String e1, String e2) -> {
        return e1.compareTo(e2);
    };

    @Override
    public int compareTo(Employee e) {
        return date.compareTo(e.date);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", date='" + date + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getBirth() {
        return birth;
    }

    public String getDate() {
        return date;
    }

    public int getAge() {
        return CURRENT_YEAR- birth;
    }
}
