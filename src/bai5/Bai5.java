package bai5;

public class Bai5 {
    public static void main(String[] args) {
        class Vector2D {
            private double x;
            private double y;
            public Vector2D(double x, double y) {
                this.x = x;
                this.y = y;
            }
            public double magnitude() {
                return Math.sqrt(x * x + y * y);
            }
            public Vector2D add(Vector2D v) {
                return new Vector2D(this.x + v.x, this.y + v.y);
            }
            public Vector2D subtract(Vector2D v) {
                return new Vector2D(this.x - v.x, this.y - v.y);
            }
            public double dotProduct(Vector2D v) {
                return this.x * v.x + this.y * v.y;
            }
            public void displayVector() {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(1, 2);
        System.out.print("Vector 1: ");
        v1.displayVector();
        System.out.print("Vector 2: ");
        v2.displayVector();
        System.out.println("Độ dài của Vector 1: " + v1.magnitude());
        System.out.println("Độ dài của Vector 2: " + v2.magnitude());
        Vector2D sum = v1.add(v2);
        System.out.print("Tổng của hai vector: ");
        sum.displayVector();
        Vector2D difference = v1.subtract(v2);
        System.out.print("Hiệu của hai vector: ");
        difference.displayVector();
        double dotProduct = v1.dotProduct(v2);
        System.out.println("Tích vô hướng của hai vector: " + dotProduct);
    }
}
