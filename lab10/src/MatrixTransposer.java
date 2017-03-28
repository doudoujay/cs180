import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jay on 2017/3/27.
 */
public class MatrixTransposer {


    public static void main(String[] args) throws Exception {
        File fi = new File("studentinputfiles/matrix1.txt");
        File fo = new File("studentinputfiles/matrixOutput.txt");
        PrintWriter pw = new PrintWriter(fo);
        FileInputStream fis = new FileInputStream(fi);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
        List<List<Integer>> temp = new ArrayList<List<Integer>>();
        while(true){
            String line = bfr.readLine();
            if (line == null) break;
            List<Integer> tempLine = new ArrayList<>();
            String[] numbersArray = line.split(" ");
            for (String s: numbersArray
                 ) {
                tempLine.add(Integer.parseInt(s));

            }

            temp.add(tempLine);


        }



        Matrix m = new Matrix();
        int[][] tempArray = new int[temp.size()][temp.get(0).size()];
        for (int i = 0; i < temp.size() ; i++) {
            for (int j = 0; j <temp.get(0).size() ; j++) {
                tempArray[i][j] = temp.get(i).get(j);
            }

        }
        int[][] result = m.transposeMatrix(tempArray);
        for (int i = 0; i < temp.size(); i++) {
            String line = "";
            for (int a : result[i]
                    ) {
                line = line + a + " ";
            }
            pw.println(line);
        }
        bfr.close();
        pw.close();
    }
}
