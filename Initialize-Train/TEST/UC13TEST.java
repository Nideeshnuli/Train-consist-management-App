import org.junit.jupiter.api.Test;
import java.util.*;
        import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UC13TEST {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : getSampleBogies()) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertEquals(2, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> result = getSampleBogies().stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : getSampleBogies()) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        List<Bogie> streamResult = getSampleBogies().stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        long duration = end - start;

        assertTrue(duration >= 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", i));
        }

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 5000)
                .collect(Collectors.toList());

        assertFalse(result.isEmpty());
    }
}
