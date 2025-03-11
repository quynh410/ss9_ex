package bai2;

public class Bai2 {
    public static void main(String[] args) {
        class Employee {
            // Thuộc tính của lớp
            private int emp_id;
            private String emp_name;
            private String emp_department;
            private double salary;

            // Constructor
            public Employee(int id, String name, String department, double salary) {
                this.emp_id = id;
                this.emp_name = name;
                this.emp_department = department;
                this.salary = salary;
            }

            // Phương thức hiển thị thông tin nhân viên
            public void displayInfo() {
                System.out.println("ID: " + emp_id);
                System.out.println("Name: " + emp_name);
                System.out.println("Department: " + emp_department);
                System.out.println("Salary: " + salary);
            }

            // Getter và Setter cho salary
            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            // Phương thức tăng lương theo phần trăm
            public void increaseSalary(double percentage) {
                if (percentage > 0) {
                    this.salary += this.salary * (percentage / 100);
                }
            }
        }
        Employee emp1 = new Employee(101, "Quynh", "IT", 5000);

        System.out.println("Thông tin nhân viên trước khi tăng lương:");
        emp1.displayInfo();
        emp1.increaseSalary(10);
        System.out.println("\nThông tin nhân viên sau khi tăng lương:");
        emp1.displayInfo();
    }
}