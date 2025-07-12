package otherFolder.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


public class Testers {
@Test
void sampleTest1() {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    // assertTrue((numbers.get(1)==2),"GOOD");
    assertEquals(numbers.get(1), 2);
}
@Test
void sampleTest2() {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    assertTrue((numbers.get(1)==2),"GOOD");
}
}
