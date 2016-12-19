package ca.patricklam;

public class FindLast {
    static public int findLast(int[] x, int y) {
        /* bug: loop test should be i >= 0 */
        for (int i = x.length - 1; i > 0 ; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }
}
