import javax.swing.*;

/**
 * Created by jay on 2017/1/31.
 */
public class CodonExtractor {
    public static void main(String[] args) {
        int continueProgram;

        do {
            // Read DNAsequence
            String input = JOptionPane.showInputDialog("Enter a DNA sequence");
            input = input.toUpperCase(); // Make upper case
            String message = "Do you want to continue?";

            if (isValid(input)) // Check for validity
                displayCodons(input); // Find and display codons
            else
                message = "Invalid DNA Sequence.\n" + message;

            continueProgram = JOptionPane.showConfirmDialog(null, message,
                    "Alert",
                    JOptionPane.YES_NO_OPTION);
        } while (continueProgram == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Thanks for using the Codon Extractor!");

    }
    public static boolean isValid(String dna) {
        String validBases = "ACGT";

        for (int i = 0; i < dna.length(); i++) {
            char base = dna.charAt(i);
            if (validBases.indexOf(base) == -1)
                return false; //base not in "ACGT"
        }
        return true;
    }
    public static void displayCodons(String dna) {
        String message = "";

        // Get as many complete codons as possible
        for (int i = 0; i < dna.length() - 2; i += 3)
            message += "\n" + dna.substring(i, i + 3);

        // 1-2 bases might be left over
        int remaining = dna.length() % 3;
        if (remaining == 1)
            message += "\n"+ dna.substring(dna.length() - 1,
                    dna.length()) + "**";
        else if (remaining == 2)
            message += "\n"+ dna.substring(dna.length() - 2,
                    dna.length()) + "*";

        message = "dna length: " + dna.length() + "\n\nCodons: " + message;
        JOptionPane.showMessageDialog(null, message,
                "Codons in DNA",
                JOptionPane.INFORMATION_MESSAGE);
    }


}
