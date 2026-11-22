import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Restaurant name
        System.out.print("Restaurant name (e.g., The Krusty Krab): ");
        String restaurantName = scanner.nextLine();

        // Wait time
        System.out.print("Wait time in minutes (e.g., 5): ");
        int waitTime = Integer.parseInt(scanner.nextLine());

        // Rating
        System.out.print("Rating (e.g., 4.5): ");
        double rating = Double.parseDouble(scanner.nextLine());

        System.out.print("Average price range (e.g., $15-$35): ");
        String averagePrice = scanner.nextLine();

        System.out.print("Weekday hours (e.g., 8:00 AM - 10:00 PM): ");
        String weekdayHours = scanner.nextLine();

        System.out.print("Saturday hours (e.g., 9:00 AM - 9:00 PM): ");
        String saturadayHours = scanner.nextLine();

        System.out.print("Sunday hours (e.g., CLOSED): ");
        String sundayHours = scanner.nextLine();

        // Creates object using constructor
        Restaurant restaurant = new Restaurant(
            restaurantName, waitTime, rating, averagePrice,
            weekdayHours, saturadayHours, sundayHours
    );

        System.out.println(restaurant);
    }
}
