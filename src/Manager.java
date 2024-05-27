class Manager extends Employee {

    public Manager(String name, String midName, String surName, String position, String phone, int salary, int birth, String date) {
        super(name, midName, surName, position, phone, salary, birth, date);
    }

    public static void increaseSalaries(Employee[] employees, int increment) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(increment);
            }
        }
}
    private static void increaser(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > 45 && !(emp[i] instanceof Manager)) {
                emp[i].increaseSalary(5000);
            }
        }
    }

    private static void increaser(Employee[] emp, int age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age && !(emp[i] instanceof Manager)) {
                emp[i].increaseSalary(increment);
            }
        }
    }


}