import java.util.*;

// Step 1: Create Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class SortBogiesbyCapacity {
    public static void main(String[] args) {

        // Step 2: Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Step 3: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 4: Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 5: Sort in descending order (optional)
        bogies.sort((a, b) -> b.capacity - a.capacity);

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}