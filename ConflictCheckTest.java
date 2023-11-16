import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import java.util.Arrays;

public class ConflictCheckTest {

    @Test
    public void hasNoConflicts() {
        int[] expectation = new int[ConflictCheck.events.length];

        //Test Case 1: No conflicts
        Arrays.fill(expectation, -1); //indicates no conflicts
        assertArrayEquals(expectation, ConflictCheck.hasNoConflicts("Work on Final Project", "11132023", 1430, 1530));

        //Test Case 2: One conflict
        expectation[0] = 1;
        assertArrayEquals(expectation, ConflictCheck.hasNoConflicts("Ryan's Birthday Party", "05012026", 1200, 1500));

        //Test Case 3: Multiple conflicts
        expectation[0] = 0;
        expectation[1] = 3;
        assertArrayEquals(expectation, ConflictCheck.hasNoConflicts("Take Down the Fireworks Stand", "01102024", 1300, 2000));
    }

}