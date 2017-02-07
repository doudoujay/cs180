import java.lang.reflect.Array;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by jay on 1/31/17.
 */
public class MathToolsClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bye = true;
        while (bye) {
            System.out.println("Select a number from the menu choices:");
            System.out.println("1 - Absolute Value");
            System.out.println("2 - Power");
            System.out.println("3 - Nth Root");
            System.out.println("4 - Scientific Notation");
            String inputChoice = input.nextLine();

            switch (inputChoice) {
                case "1":
                    System.out.println("***Absolute Value***");
                    System.out.println("Enter the value");
                    double n = Double.parseDouble(input.nextLine());
                    System.out.println(MathTools.absoluteValue(n));
                    break;
                case "2":
                    System.out.println("***Power***");
                    System.out.println("Enter the base");
                    double base = Double.parseDouble(input.nextLine());
                    System.out.println("Enter the exponent");
                    int exponent = Integer.parseInt(input.nextLine());
                    System.out.println(MathTools.power(base, exponent));
                    break;
                case "3":
                    System.out.println("***Nth Root***");
                    System.out.println("Enter the value");
                    double value = Double.parseDouble(input.nextLine());
                    System.out.println("Enter the root");
                    int root = Integer.parseInt(input.nextLine());
                    System.out.println(MathTools.nthRoot(value, root));
                    break;
                case "4":
                    System.out.println("***Scientific Notation***");
                    System.out.println("Enter the number");
                    double number = Double.parseDouble(input.nextLine());
                    System.out.println(MathTools.scientificNotation(number));
                default:
                    System.out.println("Invalid");
            }
            System.out.println("Return to menu? yes/no");
            String yesorno = input.nextLine();
            if(yesorno.equals("no")){
                System.out.println("Good bye");
                break;
            }
            else if (yesorno.equals("yes")){

            }
            else {
                System.out.println("Invalid");
            }

        }


    }

}

