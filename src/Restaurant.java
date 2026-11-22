public class Restaurant {
    private String restaurantName;
    private int waitTime;
    private double rating;

    private String averagePrice = "$15-$35";
    private String weekdayHours = "8:00 AM - 10:00 PM";
    private String saturadayHours = "9:00 AM - 9:00 PM";
    private String sundayHours = "CLOSED";
    
public Restaurant(String restaurantName, int waitTime, double rating, 
String averagePrice, String weekdayHours, String saturadayHours, String sundayHours) {
    this.restaurantName = restaurantName;
    this.waitTime = waitTime;
    this.rating = rating;    
    this.averagePrice = averagePrice;
    this.weekdayHours = weekdayHours;
    this.saturadayHours = saturadayHours;
    this.sundayHours = sundayHours;
}   

    public static void main(String[] args) {
        String restaurantName = "keycabs's krusty krab";
        int waitTime = 5;
        double rating = 4.5;

        String averagePrice = "$15-$35";
        String weekdayHours = "8:00 AM - 10:00 PM";
        String saturadayHours = "9:00 AM - 9:00 PM";
        String sundayHours = "CLOSED";

        System.out.println("Name: " + restaurantName);
        System.out.println("Wait time: " + waitTime + " minutes");
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + averagePrice + "\n");
        System.out.println("Hours open:");
        
        System.out.println("Monday - Friday: " + weekdayHours);
        System.out.println("Saturday: " + saturadayHours);
        System.out.println("Sunday: " + sundayHours);
    }
}