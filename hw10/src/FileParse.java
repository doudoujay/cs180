/**
 * Created by jay on 2017/3/24.
 */
import java.io.*;
import java.util.ArrayList;

public class FileParse {

    public static int countWords(String fileName, String searchWord) throws Exception {
        int num=0;

        // Open file  with the path ‘fileName’
        File f = new File(fileName);
        // Read the file
        FileInputStream fis = new FileInputStream(f);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));

        // Go through the file and tally up the number of matches
        while(true){
            String line = bfr.readLine();
            if (line == null) break;
            for (int i = 0; i < line.length()-searchWord.length()+1; i++) {
                String temp = line.substring(i,i+searchWord.length());
                if (temp.equals(searchWord)) num++;
            }
        }
        bfr.close();
        // Print output
        System.out.println("Total number of occurrences: "+num);

        return num;

    }

    public static boolean deleteLine(String fileName, int lineNum) throws Exception {

        // Open file  with the path ‘fileName’
        File f = new File(fileName);
        // Read the file
        FileInputStream fis = new FileInputStream(f);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));

        //Create an array to save the lines
        ArrayList<String> lines = new ArrayList<>();
        boolean result = false;

        int indexLine = 0;
        //TODO: Iterate through the file line by line until you find the 'lineNum' line
        while(true){
            String line = bfr.readLine();
            if (line == null) break;
            indexLine++;
            //If line is found, skip saving it, otherwise, save it in the array
            if(indexLine == lineNum){
                result = true;
            }else {
                lines.add(line);
            }

        }


        //Write the whole array to the file
        PrintStream fileStream = new PrintStream(f);
        for (String line: lines) {
            fileStream.println(line);
        }
        fileStream.close();
        bfr.close();

        if (result){
            System.out.println("Line deleted!");
        }else {
            System.out.println("Line not found");
        }


        return result;
    }

    public static int refactor(String fileName, String original, String replace) throws Exception {
        // Open file  with the path ‘fileName’
        File f = new File(fileName);
        // Read the file
        FileInputStream fis = new FileInputStream(f);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
        RandomAccessFile rAccFile = new RandomAccessFile(f, "rw");
        ArrayList<String> lines = new ArrayList<>();
        int num = 0;
        //TODO: Iterate through the file line by line and check if the line has the ‘original’ string
        while(true){
            String line = bfr.readLine();
            if (line == null) break;
            for (int i = 0; i < line.length()-original.length()+1; i++) {
                String temp = line.substring(i,i+original.length());
                //Replace the “original” with “replace”
                if (temp.equals(original)){
                    line = line.substring(0,i) + replace + line.substring(i+original.length(),line.length());
                    num++;
                }
            }
            lines.add(line);

        }
        //HINTS: Use RandomAccessFile

        //Write the whole array to the file
        PrintStream fileStream = new PrintStream(f);
        for (String line: lines) {
            fileStream.println(line);
        }
        fileStream.close();
        bfr.close();

        //TODO: Print output
        if(num == 0){
            System.out.println("No words found");
        }else {
            System.out.printf("Number of words replaced: "+num);
        }
        return num;


    }


    public static void main(String[] args) {
        FileParse f = new FileParse();
        try {
            countWords("sampleRead.txt","cat");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            deleteLine("sampleRead.txt",1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            refactor("sampleRead.txt","boy","milk");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}