import java.util.ArrayList;
import java.util.List;

public class AddPassengerBogiestoTrain  {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Print list after insertion
        System.out.println("Passenger bogies after addition: " + passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removal of AC Chair: " + passengerBogies);

        // Check if Sleeper bogie exists
        boolean sleeperExists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper bogie exist? " + sleeperExists);

        // Final list state
        System.out.println("Final passenger bogie list: " + passengerBogies);

        System.out.println("System ready for next operations.");
    }
}