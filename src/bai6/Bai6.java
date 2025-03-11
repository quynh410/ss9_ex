package bai6;

public class Bai6 {
    public static void main(String[] args) {
        class Point2D {
            private double x;
            private double y;
            public Point2D(double x, double y) {
                this.x = x;
                this.y = y;
            }
            public double getX() {
                return x;
            }
            public double getY() {
                return y;
            }
            public void setX(double x) {
                this.x = x;
            }
            public void setY(double y) {
                this.y = y;
            }
            public double distanceTo(Point2D p) {
                return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
            }
            public void displayPoint() {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
        Point2D p1 = new Point2D(3, 4);
        Point2D p2 = new Point2D(7, 1);
        System.out.print("Điểm 1: ");
        p1.displayPoint();
        System.out.print("Điểm 2: ");
        p2.displayPoint();
        double distance = p1.distanceTo(p2);
        System.out.println("Khoảng cách giữa hai điểm: " + distance);
        p1.setX(6);
        p1.setY(8);
        System.out.print("Điểm 1 sau khi cập nhật: ");
        p1.displayPoint();
    }
}