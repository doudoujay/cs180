import java.util.Scanner;

/**
 * Created by jay on 2017/2/9.
 */
public class WordList {
    final static int MAXWORDS = 300000;   //This is a problem we will discuss later!
    final static int MAXHIST = 50;

    String[] words;
    int size;

    WordList(Scanner in) {
        words = new String[MAXWORDS];
        size = 0;

        while (in.hasNext()) {
            words[size++] = in.next();
        }
    }

    int[] computeHistogram() {
        int[] histogram = new int[MAXHIST];

        for (int i = 0; i < size; i++)
            histogram[words[i].length()]++;
        return histogram;
    }
    public static void main(String[] args) {
        WordList w = new WordList(new Scanner(System.in));
        System.out.printf("read %d words\n", w.size);

        int[] wordLengths = w.computeHistogram();
        for (int i = 1; i < MAXHIST; i++)
            if (wordLengths[i] > 0)
                System.out.printf("%2d: %5d\n", i, histogram[i]);
    }


}
