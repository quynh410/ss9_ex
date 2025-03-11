package ra;

import java.util.Scanner;

public class Student {
    /*
        Xây dựng lớp ính viên quan lí thong tin sv
            - thuộc tính: mã số, họ tên, tuổi, giới tính, địa chỉ,
        có 3 constructor : ko tham số , có 2 tham số mã sv , tên sv, có đầy đủ tham sô
        Có các hành vi :
            - Tính tổng 2 số nguyên
            - Chào giảng viên
            - Nhập thông tin sinh viên
            - Hiển thị thông tin sinh viên
    * */
    // Fields | Properties | Atributes : thuộc tính mô tả các đặc điểm của đối tượng trong thế giới thực
    // Syntax: private + datatype + attributeName
    private String std_id ;
    private String std_name ;
    private int std_age ;
    private boolean std_gender ;
    private String std_address ;
    // Constructor : cá hàm giúp khỏi tạo đối tượng từ lớp
    // Syntax: public + ClassName (paramters)
    // -- Constructor default : 0 tham số khởi tạo đối tượng với các thuộc tính với giá trị mặc định
    public Student() {

    }
    // -- constructor 2 tham số để khởi tạo đối tượng với mã sv và tene sv
    public Student(String std_id, String std_name) {
        this.std_id = std_id;
        this.std_name = std_name;
    }
    // -- Constructor đầy đủ tham số để khởi tạo tất cả cá thông tin của sv
    public Student(String std_id, String std_name, int std_age, boolean std_gender, String std_address) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.std_age = std_age;
        this.std_gender = std_gender;
        this.std_address = std_address;
//        StringBuilder sb = new StringBuilder();
    }
    // 3. các methods mô tả các hành vi của đối tượng
    // Syntax: Access Modifier + ReturnDatatype + methodName (parameters)
    // 3.1 Getter/Setter
    // Getter : Lấy dữ liệu các thuộc tính
    // Setter : gán giá trị cho các thuộc tính

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public int getStd_age() {
        return std_age;
    }

    public void setStd_age(int std_age) {
        this.std_age = std_age;
    }

    public boolean isStd_gender() {
        return std_gender;
    }

    public void setStd_gender(boolean std_gender) {
        this.std_gender = std_gender;
    }

    public String getStd_address() {
        return std_address;
    }

    public void setStd_address(String std_address) {
        this.std_address = std_address;
    }

    // 3.2 Method Behavior : phương thức hành vi
    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public void helloTeacher() {
        System.out.println("Hello,teacher!");
    }
    public void input_data(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên: ");
        this.std_id = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.std_name = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        this.std_age = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập vào giới tính sinh viên");
        this.std_gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào đ��a chỉ sinh viên: ");
        this.std_address = scanner.nextLine();
    }
    public void display_data(){
        System.out.println("Mã sinh viên: " + this.std_id);
        System.out.println("Tên sinh viên: " + this.std_name);
        System.out.println("Tuổi sinh viên: " + this.std_age);
        System.out.println("Giới tính sinh viên: " + (this.std_gender? "Nam" : "Nữ"));
        System.out.println("Địa chỉ sinh viên: " + this.std_address);
    }


}














