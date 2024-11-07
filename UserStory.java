import java.util.Scanner;

public class UserStory {
  
  private Flight[] flights;
  
    /*
     * Constructor that initializes the flights array from file data
     */ 
    public UserStory(String departFile, String arrivalFile, String priceFile, String timeFile) {
        flights = createFlights(departFile, arrivalFile, priceFile, timeFile);
    }

    /*
     * Method to create an array of Flight objects from file data
     */
    public Flight[] createFlights(String departFile, String arrivalFile, String priceFile, String timeFile) {
        String[] departureData = FileReader.toStringArray(departFile);
        String[] arrivalData = FileReader.toStringArray(arrivalFile);
        double[] priceData = FileReader.toDoubleArray(priceFile);
        int[] timeData = FileReader.toIntArray(timeFile);
        
        Flight[] tempFlights = new Flight[departureData.length];
        for (int i = 0; i < departureData.length; i++) {
            tempFlights[i] = new Flight(departureData[i], arrivalData[i], priceData[i], timeData[i]);
        }

        return tempFlights;
    }
    
    /*
     * Method to find the cheapest flight
     */
    public Flight findMinPriceFlight() {
        Flight minFlight = flights[0];
        for (Flight flight : flights) {
            if (flight.getPrice() < minFlight.getPrice()) {
                minFlight = flight;
            }
        }
        return minFlight;
    }

   
    /*
     *   Method to find the most expensive flight
     */
    public Flight findMaxPriceFlight() {
        Flight maxFlight = flights[0];
        for (Flight flight : flights) {
            if (flight.getPrice() > maxFlight.getPrice()) {
                maxFlight = flight;
            }
        }
        return maxFlight;
    }

    /*
     * Method to display all flights
     */
    public void displayAllFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}







  
