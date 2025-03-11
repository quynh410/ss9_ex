package bai3;

public class Bai3 {
    public static void main(String[] args) {
        class Rectangle {
            private float length;
            private float width;

            public Rectangle() {
                this.length = 1.0f;
                this.width = 1.0f;
            }
            public Rectangle(float length, float width) {
                this.length = length;
                this.width = width;
            }
            public double getArea() {
                return length * width;
            }
            public double getPerimeter() {
                return 2 * (length + width);
            }
            public void display() {
                System.out.println("Chiều dài: " + length);
                System.out.println("Chiều rộng: " + width);
                System.out.println("Diện tích: " + getArea());
                System.out.println("Chu vi: " + getPerimeter());
            }
        }
        Rectangle rect1 = new Rectangle();
        System.out.println("Hình chữ nhật 1 (Mặc định):");
        rect1.display();
        System.out.println("\n-------------------\n");
        Rectangle rect2 = new Rectangle(8.0f, 1.3f);
        System.out.println("Hình chữ nhật 2 (Có tham số):");
        rect2.display();
    }
}
