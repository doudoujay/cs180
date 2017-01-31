import java.util.Scanner;

/**
 * Created by jay on 1/31/17.
 */
public class MathToolsClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bye = false;
        while (bye) {
            System.out.println("Select a number from the menu choices:");
            System.out.println("1 - Absolute Value");
            System.out.println("2 - Power");
            System.out.println("3 - Nth Root");
            System.out.println("4 - Scientific Notation");
            switch(input.nextLine()){
                case "1":
                    System.out.println("Enter the value");
                    double n= Integer.parseInt(input.nextLine());
                    System.out.println(MathTools.absoluteValue(n));

                    default:
                        System.out.println("Invalid");
                case "2":
                    double base= Integer.parseInt(input.nextLine());
                    int exponent= Integer.parseInt(input.nextLine());
                    System.out.println(MathTools.power(base,exponent));

            }
            System.out.println("Return to menu? yes/no");
            switch (input.nextLine()){
                case "yes":
                    bye = false;
                case "no":
                    bye = true;
            }


        }
        System.out.println("Select a number from the menu choices:");
        System.out.println("1 - Absolute Value");
        System.out.println("2 - Power");
        System.out.println("3 - Nth Root");
        System.out.println("4 - Scientific Notation");
        System.out.println(MathTools.nthRoot(4,2));
    }

}

