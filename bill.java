import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input Details
        System.out.print("Enter Customer Name: ");
        String name = s.nextLine();
        System.out.print("Enter Customer ID: ");
        String id = s.nextLine();
        System.out.print("Enter Previous Reading: ");
        int prev = s.nextInt();
        System.out.print("Enter Current Reading: ");
        int curr = s.nextInt();
        s.nextLine(); // Flush buffer
        System.out.print("Enter Connection Type (Domestic/Non-Domestic): ");
        String type = s.nextLine();

        int units = curr - prev;
        double amount = 0;

        // Logic based on provided criteria
        if (type.equalsIgnoreCase("Domestic")) {
            if (units <= 100) {
                amount = units * 4.80;
            } else if (units <= 200) {
                amount = units * 5.80;
            } else {
                amount = units * 6.50;
            }
        } else if (type.equalsIgnoreCase("Non-Domestic")) {
            if (units <= 100) {
                amount = units * 6.05;
            } else {
                System.out.println("Slab for Non-Domestic > 100 not defined.");
            }
        } else {
            System.out.println("Invalid Connection Type.");
            return;
        }

        // Print Output
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer: " + name );
	System.out.println("Customer ID:" +id );
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Amount: Rs. " + amount);
    }
}
