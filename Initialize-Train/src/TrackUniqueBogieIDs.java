
import java.util.HashSet;
import java.util.Set;

public class TrackUniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for bogie IDs (unique values only)
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs, including duplicates
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate, will be ignored
        bogieIDs.add("BG102"); // Duplicate, will be ignored

        // Print final set (duplicates removed automatically)
        System.out.println("Unique bogie IDs in the train consist: " + bogieIDs);

        System.out.println("System ready for next operations.");
    }
}