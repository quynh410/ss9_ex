package bai8;

public class Bai8 {
    public static void main(String[] args) {
        class BankAccount {
            private String accountNumber;
            private String accountHolder;
            private double balance;
            public BankAccount(String accountNumber, String accountHolder, double balance) {
                this.accountNumber = accountNumber;
                this.accountHolder = accountHolder;
                this.balance = balance;
            }
            public void add_money(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Đã nạp: " + amount + " vào tài khoản " + accountNumber);
                } else {
                    System.out.println("Số tiền nạp không hợp lệ!");
                }
            }
            public void withdraw_money(double amount) {
                if (amount > balance) {
                    System.out.println("Số dư không đủ để rút tiền!");
                } else if (amount > 0) {
                    balance -= amount;
                    System.out.println("Đã rút: " + amount + " từ tài khoản " + accountNumber);
                } else {
                    System.out.println("Số tiền rút không hợp lệ!");
                }
            }
            public void transfer_money(BankAccount recipient, double amount) {
                if (amount > 0 && amount <= balance) {
                    this.balance -= amount;
                    recipient.balance += amount;
                    System.out.println("Đã chuyển: " + amount + " từ tài khoản " + accountNumber + " đến " + recipient.accountNumber);
                } else {
                    System.out.println("Chuyển tiền thất bại: Số dư không đủ hoặc số tiền không hợp lệ!");
                }
            }
            public void display() {
                System.out.println("==================================");
                System.out.println("Số tài khoản: " + accountNumber);
                System.out.println("Chủ tài khoản: " + accountHolder);
                System.out.println("Số dư hiện tại: " + balance);
                System.out.println("==================================");
            }
        }
        BankAccount account1 = new BankAccount("023467897654", "Nguyễn Văn A", 5000);
        BankAccount account2 = new BankAccount("09876543456", "Trần Thị B", 3000);
        account1.display();
        account2.display();
        account1.add_money(2000);
        account1.display();
        account1.withdraw_money(1000);
        account1.display();
        account1.transfer_money(account2, 1500);
        account1.display();
        account2.display();
    }
}
