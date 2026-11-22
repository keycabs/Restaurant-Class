public class Main {
        public static void main(String[] args) {
        String restaurantName = "keycabs's krusty krab";
        int waitTime = 5;
        double rating = 4.5;

        String averagePrice = "$15-$35";
        String weekdayHours = "8:00 AM - 10:00 PM";
        String saturadayHours = "9:00 AM - 9:00 PM";
        String sundayHours = "CLOSED";

        // Creates object using constructor
        Restaurant restaurant = new Restaurant(
            restaurantName, waitTime, rating, averagePrice,
            weekdayHours, saturadayHours, sundayHours
    );

        System.out.println(restaurant);
    }
}