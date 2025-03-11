package bai4;

public class Bai4 {
    public static void main(String[] args) {
        class Circle {
            private double radius;
            public Circle() {
                this.radius = 1.0;
            }
            public Circle(double radius) {
                this.radius = radius;
            }
            public double getArea() {
                return Math.PI * radius * radius;
            }
            public double getCircumference() {
                return 2 * Math.PI * radius;
            }
            public void display() {
                System.out.println("Bán kính: " + radius);
                System.out.println("Diện tích: " + getArea());
                System.out.println("Chu vi: " + getCircumference());
            }
        }
        Circle circle1 = new Circle();
        System.out.println("Hình tròn 1 (Mặc định):");
        circle1.display();
        Circle circle2 = new Circle(4.5);
        System.out.println("Hình tròn 2 (Có tham số):");
        circle2.display();
    }
}

