import java.util.ArrayList;
import java.util.List;

    public class InitializeTrainandDisplayConsistSummary {

        public static void main(String[] args) {

            // Welcome Message
            System.out.println("=== Train Consist Management App ===");

            // Initialize Train Consist (Dynamic List)
            List<String> trainConsist = new ArrayList<>();

            // Display initial state
            System.out.println("Train consist initialized.");

            // Display initial bogie count
            System.out.println("Initial bogie count: " + trainConsist.size());

            // Program continues...
            System.out.println("System ready to add bogies.");
        }
    }

