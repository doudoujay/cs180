import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jay on 2017/1/20.
 */
public class StringSplitter {
    public String formSubmission(String s) {
        int firstNameStart = 0;
        int firstNameEnd = s.indexOf(" ");
        int secondNameStart = s.indexOf(" ") + 1;
        int secondNameEnd = s.indexOf(",");
        String firstName = s.substring(firstNameStart, firstNameEnd);
        String lastName = s.substring(secondNameStart, secondNameEnd);
        String date = s.substring(s.indexOf(",") + 1);
        SimpleDateFormat dateObj = new SimpleDateFormat("MM/dd/yyyy");
        String result = "";

        int age = 2017 - Integer.parseInt(date.substring(date.length() - 4));
        result = "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Approximate Age: " + Integer.toString(age);
        return result;

    }

    public static void main(String[] args) {
//        Test the result
        String s = "John Doe, 12/7/1992";
        StringSplitter obj = new StringSplitter();
        System.out.println(obj.formSubmission(s));

    }
}
