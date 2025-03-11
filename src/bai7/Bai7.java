package bai7;

public class Bai7 {
    public static void main(String[] args) {
        class QuadraticEquation {
            private double a, b, c;

            public QuadraticEquation(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public double getDiscriminant() {
                return (b * b) - (4 * a * c);
            }

            public boolean hasRealRoots() {
                return getDiscriminant() >= 0;
            }

            // Tính và trả về nghiệm thứ nhất nếu có
            public double getRoot1() {
                double delta = getDiscriminant();
                if (delta >= 0) {
                    return (-b + Math.sqrt(delta)) / (2 * a);
                }
                return Double.NaN; // Trả về NaN nếu không có nghiệm thực
            }

            // Tính và trả về nghiệm thứ hai nếu có
            public double getRoot2() {
                double delta = getDiscriminant();
                if (delta >= 0) {
                    return (-b - Math.sqrt(delta)) / (2 * a);
                }
                return Double.NaN;
            }

            public void display() {
                if (hasRealRoots()) {
                    double root1 = getRoot1();
                    double root2 = getRoot2();

                    if (root1 == root2) {
                        System.out.println("Phương trình có nghiệm kép: x = " + root1);
                    } else {
                        System.out.println("Phương trình có hai nghiệm:");
                        System.out.println("x1 = " + root1);
                        System.out.println("x2 = " + root2);
                    }
                } else {
                    System.out.println("Phương trình không có nghiệm thực.");
                }
            }
        }
        QuadraticEquation equation1 = new QuadraticEquation(1, -3, 2);
        System.out.println("Phương trình 1:");
        equation1.display();
        QuadraticEquation equation2 = new QuadraticEquation(1, -2, 1);
        System.out.println("Phương trình 2:");
        equation2.display();
        QuadraticEquation equation3 = new QuadraticEquation(1, 1, 1);
        System.out.println("Phương trình 3:");
        equation3.display();
    }
}
