/* To run this test case, have JUnit 4 installed and
 * either use a modern IDE, or
 * $ java -cp classes:<path-to-junit4.jar> org.junit.runner.JUnitCore ca.patricklam.TestFindLast
 */
package ca.patricklam;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFindLast {
    @Test
    public void testFindLast() {
        int[] x = new int[] {2, 3, 5};
        assertEquals(0, FindLast.findLast(x, 2));
    }
}
