import java.util.Scanner;

class SwiggyOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] foodItems = {
                "Burger",
                "Pizza",
                "Biryani",
                "Dosa",
                "Ice Cream"
        };

        int[] prices = {120, 250, 180, 80, 100};

        int total = 0;
        int choice, quantity;

        System.out.println("===== Welcome to Swiggy =====");

        while (true) {
            System.out.println("\nMenu");
            for (int i = 0; i < foodItems.length; i++) {
                System.out.println((i + 1) + ". " + foodItems[i] + " - Rs." + prices[i]);
            }

            System.out.println("6. Place Order");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 6) {
                break;
            }

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();

                int amount = prices[choice - 1] * quantity;
                total += amount;

                System.out.println(foodItems[choice - 1] + " added successfully!");
                System.out.println("Amount: Rs." + amount);
            } else {
                System.out.println("Invalid Choice!");
            }
        }

        double gst = total * 0.05;
        int deliveryCharge = 40;
        double finalBill = total + gst + deliveryCharge;

        System.out.println("\n===== Order Summary =====");
        System.out.println("Food Total      : Rs." + total);
        System.out.println("GST (5%)        : Rs." + gst);
        System.out.println("Delivery Charge : Rs." + deliveryCharge);
        System.out.println("----------------------------");
        System.out.println("Total Bill      : Rs." + finalBill);

        System.out.println("\nOrder Placed Successfully!");
        System.out.println("Thank you for ordering with Swiggy.");

        sc.close();
    }
}