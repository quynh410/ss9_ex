package bai10;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        class StudentManager {
            private Student[] students;
            private int studentCount;
            private Scanner sc;

            public StudentManager() {
                this.students = new Student[100];
                this.studentCount = 0;
                this.sc = new Scanner(System.in);
            }

            public void displayAllStudents() {
                if (studentCount == 0) {
                    System.out.println("Danh sách sinh viên trống.");
                } else {
                    System.out.println("=============Hiển thị sinh viên=============");
                    for (int i = 0; i < studentCount; i++) {
                        students[i].displayData();
                    }
                }
            }

            public void addStudent() {
                if (studentCount >= students.length) {
                    System.out.println("Danh sách đã đầy, không thể thêm sinh viên mới.");
                    return;
                }
                Student student = new Student();
                student.inputData();
                students[studentCount++] = student;
                System.out.println("Thêm sinh viên thành công!");
            }

            public void updateStudent() {
                System.out.print("Nhập mã sinh viên cần sửa: ");
                int id = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < studentCount; i++) {
                    if (students[i].getStd_id() == id) {
                        System.out.println("Nhập thông tin mới cho sinh viên:");
                        students[i].inputData();
                        System.out.println("Cập nhật thông tin thành công!");
                        return;
                    }
                }
                System.out.println("Không tìm thấy sinh viên có mã: " + id);
            }

            public void deleteStudent() {
                System.out.print("Nhập mã sinh viên cần xóa: ");
                int id = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < studentCount; i++) {
                    if (students[i].getStd_id() == id) {
                        for (int j = i; j < studentCount - 1; j++) {
                            students[j] = students[j + 1];
                        }
                        students[--studentCount] = null;
                        System.out.println("Xóa sinh viên thành công!");
                        return;
                    }
                }
                System.out.println("Không tìm thấy sinh viên có mã: " + id);
            }
        }
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên dựa vào mã sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Xử lý trôi lệnh

            switch (choice) {
                case 1:
                    manager.displayAllStudents();
                    break;
                case 2:
                    manager.addStudent();
                    break;
                case 3:
                    manager.updateStudent();
                    break;
                case 4:
                    manager.deleteStudent();
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
                    break;
            }
        }
    }
}
