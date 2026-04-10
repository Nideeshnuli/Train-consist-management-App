
import org.junit.jupiter.api.Test;
import java.util.*;
        import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UC9TEST {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );
    }

    @Test
    void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<Bogie> emptyList = new ArrayList<>();

        Map<String, List<Bogie>> result =
                emptyList.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 70)
        );

        Map<String, List<Bogie>> result =
                list.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(1, result.size());
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.keySet().containsAll(
                Arrays.asList("Sleeper", "AC Chair", "First Class")));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = new ArrayList<>(getSampleBogies());

        Map<String, List<Bogie>> result =
                original.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(5, original.size());
        assertNotSame(original, result);
    }
}

