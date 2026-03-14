import java.sql.*;
import java.util.Scanner;

public class BankManagementSystem {

    static Connection conn;

    public static void connectDB() {
        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankdb",
                "root",
                "root1234"
            );

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
        }
    }

    public static void createAccount(Scanner sc) {
        try {

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Set Password: ");
            String pass = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            String query = "INSERT INTO accounts VALUES (?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, accNo);
            ps.setString(2, name);
            ps.setString(3, pass);
            ps.setDouble(4, balance);

            ps.executeUpdate();

            System.out.println("Account Created Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deposit(Scanner sc) {
        try {

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            String query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setDouble(1, amount);
            ps.setInt(2, accNo);

            ps.executeUpdate();

            System.out.println("Deposit Successful!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void withdraw(Scanner sc) {
        try {

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            String check = "SELECT balance FROM accounts WHERE account_number=?";

            PreparedStatement ps = conn.prepareStatement(check);
            ps.setInt(1, accNo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                double balance = rs.getDouble("balance");

                if (balance < amount) {
                    System.out.println("Insufficient Balance!");
                    return;
                }

                String update = "UPDATE accounts SET balance = balance - ? WHERE account_number=?";

                PreparedStatement ps2 = conn.prepareStatement(update);

                ps2.setDouble(1, amount);
                ps2.setInt(2, accNo);

                ps2.executeUpdate();

                System.out.println("Withdrawal Successful!");

            } else {
                System.out.println("Account Not Found!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void checkBalance(Scanner sc) {

        try {

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            String query = "SELECT * FROM accounts WHERE account_number=?";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, accNo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Balance: " + rs.getDouble("balance"));

            } else {
                System.out.println("Account Not Found!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        connectDB();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    createAccount(sc);
                    break;

                case 2:
                    deposit(sc);
                    break;

                case 3:
                    withdraw(sc);
                    break;

                case 4:
                    checkBalance(sc);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");

            }
        }
    }
}