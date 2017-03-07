import java.util.Arrays;

/**
 * Solution to Q2 of the midterm exam
 */
public class StringManipulation {
    /**
     * Check if two strings have the same characters
     * @param s1
     * @param s2
     * @return
     */
    public boolean haveSameChars(String s1, String s2) {
        if(s1 == null || s2 == null) return false;

        if(s1.length() == 0 && s2.length() == 0) return true;

        //Convert both strings to a char array
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        //Sort the char arrays
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        //Return true or false based on whether they're equal after sorting
        return Arrays.equals(s1Array, s2Array);
    }
}
