import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

UserStory userStory = new UserStory("departure.txt", "arrival.txt", "price.txt", "time.txt");
        
        /*
         * Print all flights
         */ 
        userStory.displayAllFlights();

        /*
         * Find and display the cheapest and most expensive flights
         */ 
        Flight cheapestFlight = userStory.findMinPriceFlight();
        Flight mostExpensiveFlight = userStory.findMaxPriceFlight();
        
        System.out.println("\nThe cheapest flight is: " + cheapestFlight);
        System.out.println("The most expensive flight is: " + mostExpensiveFlight);
    }
}
