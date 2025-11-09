import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Market ===");
        System.out.println("1. Water (2.5 PLN)");
        System.out.println("2. Bread (3 PLN)");
        System.out.println("3. Sandwich (4 PLN)");
        System.out.println("What would you like to buy (1-3) ?");
        int choice = sc.nextInt();

        double price;

        if (choice == 1) {
            price = 2.50;
            System.out.println("You choose Water.");
        }else if (choice == 2) {
            price = 3.00;
            System.out.println("You choose Bread.");
        }else if (choice == 3) {
            price = 4.00;
            System.out.println("You choose Sandwich.");
        }else {
            System.out.println("Invalid choice.");
            return;
        }


        System.out.print("Enter the payment: ");
        double payment = sc.nextDouble();

        if (payment < 0) {
            System.out.println("Payment cannot be negative.");
            return;
        }
        if (payment < price) {
            System.out.println("Insufficient funds. Need " + (price - payment));
            return;
        }

        sc.close();

    }
}