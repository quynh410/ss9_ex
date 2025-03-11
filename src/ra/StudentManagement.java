package ra;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        // Khởi tạo đối tượng : ClassName objName  = new Constructor (Argument)
        // 1. khỏi tạo đối tượng sv 1 với các thông tin mặc định
        Student sv1 = new Student();
        // 2. khởi tạo đối tượng sv 2 với các thông tin Mã sv SV002, tếnV : Nguyễn Văn B
        Student sv2 = new Student("SV002", "Nguyễn Văn B");
        // 3. khởi tạo đối tượng sv 3 với các thông tin Mã sv SV003, Phan Thị Tâm, 23, true, Hồ Chí Minh
        Student sv3 = new Student("SV003", "Phan Thị Tâm", 23, true, "Hồ Chí Minh");
        //4 . Nhập thông tin sv 1
        System.out.println("===================Nhập thông tin sinh viên 1===================");
        Scanner scanner = new Scanner(System.in);
        sv1.input_data(scanner);
        //5 . Sử dụng các phương thức setter để nhập các thông tin còn lại của sinh viên
        System.out.println("===================Nhập thông tin sinh viên 2===================");
        System.out.println("Nhâpj tuổi sinh viên: ");
        sv2.setStd_age((Integer.parseInt(scanner.nextLine())));
        System.out.println("Nhập giới tính sinh viên: ");
        sv2.setStd_gender(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập địa chỉ sinh viên: ");
        sv2.setStd_address(scanner.nextLine());
        // 6. cho sinh 3 tính tổng 2 số nguyên 10 và 20 và in ra màn hình cốnle
        System.out.println("kết quả: " + sv3.addTwoNumbers(10, 20));
        // 7. tính tuổi tb 3 sinh viên  và in ra kết quả - Getter

        // 8. in thông tin sinh viên
        System.out.println("===================Thông tin sinh viên 1===================");
        sv1.display_data();
        System.out.println("===================Thông tin sinh viên 2===================");
        sv2.display_data();
        System.out.println("===================Thông tin sinh viên 3===================");
        sv3.display_data();
        // in thông tin sinh viên
        System.out.println("===================Thông tin sinh viên 1===================");
        sv1.display_data();
        System.out.println("===================Thông tin sinh viên 2===================");
        sv2.display_data();
        System.out.println("===================Thông tin sinh viên 3===================");
        sv3.display_data();
    }
}
