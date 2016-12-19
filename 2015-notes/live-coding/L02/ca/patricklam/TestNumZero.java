/* To run this test case, have JUnit 4 installed and
 * either use a modern IDE, or
 * $ java -cp classes:<path-to-junit4.jar> org.junit.runner.JUnitCore ca.patricklam.TestNumZero
 */
package ca.patricklam;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestNumZero {
    @Test
    public void testNoFailure() {
        int[] x = new int[] {2, 7, 0};
        assertEquals(1, NumZero.numZero(x));
    }

    @Test
    public void testFailure() {
        int[] x = new int[] {0, 7, 2};
        assertEquals(1, NumZero.numZero(x));
    }
}
