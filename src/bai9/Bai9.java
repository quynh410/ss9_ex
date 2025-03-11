package bai9;

public class Bai9 {
    public static void main(String[] args) {
        class Fraction {
            private int numerator;
            private int denominator;
            public Fraction(int numerator, int denominator) {
                if (denominator == 0) {
                    throw new ArithmeticException("Mẫu số không thể bằng 0!");
                }
                this.numerator = numerator;
                this.denominator = denominator;
                simplify();
            }
            private int gcd(int a, int b) {
                return b == 0 ? Math.abs(a) : gcd(b, a % b);
            }
            private void simplify() {
                int gcdValue = gcd(numerator, denominator);
                numerator /= gcdValue;
                denominator /= gcdValue;
                if (denominator < 0) {
                    numerator = -numerator;
                    denominator = -denominator;
                }
            }
            public Fraction add(Fraction other) {
                int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
                int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
            }
            public Fraction subtract(Fraction other) {
                int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
                int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
            }

            public Fraction multiply(Fraction other) {
                int newNumerator = this.numerator * other.numerator;
                int newDenominator = this.denominator * other.denominator;
                return new Fraction(newNumerator, newDenominator);
            }

            public Fraction divide(Fraction other) {
                if (other.numerator == 0) {
                    throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0!");
                }
                int newNumerator = this.numerator * other.denominator;
                int newDenominator = this.denominator * other.numerator;
                return new Fraction(newNumerator, newDenominator);
            }

            public void display() {
                System.out.println(numerator + "/" + denominator);
            }
        }
        Fraction frac1 = new Fraction(3, 4);
        Fraction frac2 = new Fraction(5, 6);
        Fraction sum = frac1.add(frac2);
        Fraction diff = frac1.subtract(frac2);
        Fraction product = frac1.multiply(frac2);
        Fraction quotient = frac1.divide(frac2);
        System.out.print("Phân số 1: "); frac1.display();
        System.out.print("Phân số 2: "); frac2.display();
        System.out.print("Tổng: "); sum.display();
        System.out.print("Hiệu: "); diff.display();
        System.out.print("Tích: "); product.display();
        System.out.print("Thương: "); quotient.display();
    }
}
