import java.util.Scanner;

public class IT24104081Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_3_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.println("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
        } else {
            int daysReserved = endDate - startDate;

            double totalAmount;
            if (daysReserved < 3) {
                totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
            } else if (daysReserved <= 4) {
                totalAmount = daysReserved * ROOM_CHARGE_PER_DAY * (1 - DISCOUNT_3_4_DAYS / 100.0);
            } else {
                totalAmount = daysReserved * ROOM_CHARGE_PER_DAY * (1 - DISCOUNT_5_OR_MORE_DAYS / 100.0);
            }

            System.out.println("Number of days reserved: " + daysReserved);
            System.out.println("Total amount to be paid: Rs " + totalAmount);
        }

        scanner.close();
    }
}
