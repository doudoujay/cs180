import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Test cases for the {@code EmailScam} class.
 *
 * @author Logan Kulinski
 * @version March 21, 2017
 */
public class EmailScamTest {
    private File personalFile;

    @Before
    public void setUp() {
        personalFile = new File("personalScam.txt");
    } //setUp

    @Test
    public void testNullArgument() throws Exception {
        new PrintWriter(personalFile).print("");

        assertTrue("Check your return values for each situation!", !EmailScam.personalize(null));
        assertTrue("Make sure you are not writing to the file when you are not supposed to!", !new Scanner(personalFile).hasNextLine());
    } //testNullArgument

    @Test
    public void testEmptyString() throws Exception {
       new PrintWriter(personalFile).print("");

        assertTrue("Check your return values for each situation!", !EmailScam.personalize(""));
        assertTrue("Make sure you are not writing to the file when you are not supposed to!", !new Scanner(personalFile).hasNextLine());
    } //testNullArgument

    @Test
    public void testNameOne() throws Exception {
        new PrintWriter(new FileWriter(personalFile)).print("");

        assertTrue(EmailScam.personalize("Logan"));

        String[] lines = new String[] {"Dear Logan,", "In an effort to make your online experience safer and more enjoyable, Facebook will be implementing a new login system that will affect some Facebook users, including you, Logan. These changes will offer new features and increased account security. Before you are able to use the new login system, you will be required to update your account.", "We are sorry for this inconvenience, Logan, and thank you for your time.", "-The Facebook Team"};
        List<String> lineList = new ArrayList<>();
        Scanner inFile = new Scanner(personalFile);

        while (inFile.hasNextLine())
            lineList.add(inFile.nextLine());

        inFile.close();

        assertTrue("Check to make sure they correct name is replacing the hash symbol!", Arrays.equals(lines, lineList.toArray(new String[lineList.size()])));
    } //testNameOne

    @Test
    public void testNameTwo() throws Exception {
        new PrintWriter(new FileWriter(personalFile)).print("");

        assertTrue(EmailScam.personalize("Anna"));

        String[] lines = new String[] {"Dear Anna,", "In an effort to make your online experience safer and more enjoyable, Facebook will be implementing a new login system that will affect some Facebook users, including you, Anna. These changes will offer new features and increased account security. Before you are able to use the new login system, you will be required to update your account.", "We are sorry for this inconvenience, Anna, and thank you for your time.", "-The Facebook Team"};
        List<String> lineList = new ArrayList<>();
        Scanner inFile = new Scanner(personalFile);

        while (inFile.hasNextLine())
            lineList.add(inFile.nextLine());

        inFile.close();

        assertTrue("Check to make sure they correct name is replacing the hash symbol!" , Arrays.equals(lines, lineList.toArray(new String[lineList.size()])));
    } //testNameTwo
}