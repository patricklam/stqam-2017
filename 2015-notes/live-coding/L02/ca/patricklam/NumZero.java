package ca.patricklam;

public class NumZero {
    public static int numZero(int[] x) {
        // effects: if x is null, throw NullPointerException
        //          otherwise, return number of occurrences of 0 in x.
        int count = 0;
        for (int i = 1; i < x.length; i++) {
            // program point (*)
            if (x[i] == 0) count++; 
        } 
        return count;
    }
}
