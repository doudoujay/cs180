import junit.framework.TestCase;

/**
 * Created by jay on 2017/1/31.
 */
public class PalindromeTest extends TestCase {
    public void testIsPalindrome() {
        Palindrome p = new Palindrome();
        assertEquals(true, p.isPalindrome(""));
        assertEquals(true, p.isPalindrome(null));
        assertEquals(true, p.isPalindrome("x"));
        assertEquals(true, p.isPalindrome("xx"));
        assertEquals(false, p.isPalindrome("xy"));
        assertEquals(true, p.isPalindrome("level"));
        assertEquals(false, p.isPalindrome("henway"));
        assertEquals(true, p.isPalindrome("racecar"));
    }
}