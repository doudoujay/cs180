import java.io.*;
import java.util.ArrayList;

public class EmailScam {
//    4.19

    /**
     * Personalizes the scam email by replacing each occurring hash symbol with the specified name.
     *
     * @param name the name used to replace the hash symbol
     */
    public static boolean personalize(String name) throws Exception {
        File f = new File("scam.txt");
        FileInputStream fis = new FileInputStream(f);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
        ArrayList<String> lines = new ArrayList<>();
        boolean result = false;
        if (name == null || name.equals("")) {
            return false;
        }
        while (true) {
            String line = bfr.readLine();
            if (line == null) break;
            for (int i = 0; i < line.length(); i++) {
                if (line.substring(i, i + 1).equals("#")) {
                    line = line.substring(0, i) + name + line.substring(i + 1, line.length());
                    result = true;
                }
            }
            lines.add(line);

        }

        PrintWriter pf = new PrintWriter("personalScam.txt");
        for (String l : lines
                ) {
            pf.println(l);
        }
        bfr.close();
        pf.close();
        return result;
    } //personalize
}