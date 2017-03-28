import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Contains a method that personalizes a scam email.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public class EmailScam {
    /**
     * Personalizes the scam email by replacing each occurring hash symbol with the specified name.
     *
     * @param name the name used to replace the hash symbol
     */
    public static boolean personalize(String name) {
        //determine if name is valid
        if (name == null || name.equals("")) {
            return false;
        } else {
            //create a File objects for scam.txt and personalScam.txt
            File scamFile = new File("scam.txt");
            File personalFile = new File("personalScam.txt");

            if (scamFile.exists() && personalFile.exists()) {
                try (Scanner inFile = new Scanner(scamFile); PrintWriter outFile = new PrintWriter(new FileWriter(personalFile))) {
                    //create a String object to hold the personalized email text
                    String personalizedText = "";

                    //declare a String reference variable to hold the line that was just read
                    String line;

                    while (inFile.hasNext()) {
                        //read a line from inFile
                        line = inFile.nextLine();

                        //determine if line contains a hash symbol, and replace all occurrences if so
                        if (line.contains("#")) {
                            line = line.replaceAll("#", name);
                        } //end if

                        //append line to personalizedText
                        personalizedText += line + "\n";
                    } //end while

                    //write personalizedText to outFile
                    outFile.print(personalizedText);
                } catch (IOException e) {
                    return false;
                } //end try catch

                return true;
            } else {
                return false;
            } //end if
        } //end if
    } //personalize
}