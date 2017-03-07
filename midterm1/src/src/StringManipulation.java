import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jay on 2017/2/16.
 */
public class StringManipulation {
    public boolean haveSameChars(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.equals("") && s2.equals(""))
            return true;
        int s1Length = s1.length();
        int s2Length = s2.length();
        String[] s1Array = new String[s1Length];
        for (int i = 0; i < s1Length; i++) {
            s1Array[i] = s1.substring(i, i + 1);
        }
        String[] s2Array = new String[s2Length];
        for (int i = 0; i < s2Length; i++) {
            s2Array[i] = s2.substring(i, i + 1);
        }
        if (s1Length != s2Length) return false;
        for(String s:s2Array){
            if (!Arrays.asList(s1Array).contains(s)){
                return false;
            }
        }
        return true;
    }
}
