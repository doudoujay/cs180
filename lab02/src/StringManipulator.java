import java.util.Scanner;

/**
 * CS180 - Lab 02
 * String manipulator for cs 180 lab 02
 * @author Ji Ma, ma438@purdue.edu, L08
 */

public class StringManipulator {
    public String makeUserName(String fullname) {
        if (fullname == null) {
            return null;
        }
        char firstChar = fullname.charAt(0);
        int startIndex = fullname.indexOf(" ") + 1;
        int stopIndex = fullname.length();
        String username = (firstChar + fullname.substring(startIndex, stopIndex)).toLowerCase();
        return username;
    }

    public String makeEmail(String userName, String domain) {
        if (userName == null || domain == null) {
            return null;
        }
        return (userName + "@" + domain).toLowerCase();
    }

    public static void main(String[] args) {
        StringManipulator obj = new StringManipulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your fullname");
        String fullname = scanner.nextLine();
        System.out.println("Please enter domain");
        String domain = scanner.nextLine();
        String username = obj.makeUserName(fullname);
        System.out.println("Username: " + username);
        String email = obj.makeEmail(username, domain);
        System.out.println("Email address: " + email);
    }
}








