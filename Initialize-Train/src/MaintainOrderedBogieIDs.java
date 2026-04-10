import java.util.LinkedList;
public class MaintainOrderedBogieIDs
 {
    public static void main(String[] args) {

        // Step 1: Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add initial bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Step 3: Insert Pantry Car at position 2
        train.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(train);

        // Step 4: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        // Step 5: Display final consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}
