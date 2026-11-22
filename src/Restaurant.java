public class Restaurant {
    // Private fields store the information for each Restaurant object
    private String restaurantName;
    private int waitTime;
    private double rating;

    private String averagePrice = "$15-$35";
    private String weekdayHours = "8:00 AM - 10:00 PM";
    private String saturadayHours = "9:00 AM - 9:00 PM";
    private String sundayHours = "CLOSED";
    
// Constructor: initializes a Restaurant with the provided values
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

// Getters read field values; setters update them
public String getRestaurantName() {
    return restaurantName;
}

public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
}

public int getWaitTime() {
    return waitTime;
}

public void setWaitTime(int waitTime) {
    this.waitTime = waitTime;
}

public double getRating() {
    return rating;
}

public void setRating(double rating) {
    this.rating = rating;
}

public String getAveragePrice() {
    return averagePrice;
}

public void setAveragePrice(String averagePrice) {
    this.averagePrice = averagePrice;
}

public String getWeekdayHours() {
    return weekdayHours;
}

public void setWeekdayHours(String weekdayHours) {
    this.weekdayHours = weekdayHours;
}

public String getSaturadayHours() {
    return saturadayHours;
}

public void setSaturadayHours(String saturadayHours) {
    this.saturadayHours = saturadayHours;
}

public String getSundayHours() {
    return sundayHours;
}

public void setSundayHours(String sundayHours) {
    this.sundayHours = sundayHours;
}

// Tells Java how to represent a Restaurant object as readable text
@Override
public String toString() {
    return "Name: " + restaurantName
            + "\nWait time: " + waitTime + " minutes"
            + "\nRating: " + rating
            + "\nAverage Price: " + averagePrice
            + "\n Weekday Hours: " + weekdayHours
            + "\n Saturday Hours: " + saturadayHours
            + "\n Sunday Hours: " + sundayHours;
}

    // The current main method displays sample restaurant information
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
