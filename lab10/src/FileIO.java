import java.io.*;

/**
 * Created by jay on 2017/3/27.
 */
public class FileIO {
    public static void printer(File f) throws Exception{
        FileInputStream fis  = new FileInputStream(f);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
        while(true){
            String line = bfr.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        bfr.close();
    }
    public static void main(String[] args) throws Exception{
        File f = new File("output1.txt");
        PrintWriter pw = new PrintWriter(f);
        pw.println("Hello World!");
        pw.print("CS180 is awesome!");
        pw.close();
        printer(f);
    }
}
