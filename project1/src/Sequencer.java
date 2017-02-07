import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by jay on 2017/2/3.
 */
public class Sequencer {
    public static boolean checkValid(String input) {
        return input.matches("[atcg]+");
    }

    public static String joinDNA(String input, String dna) {
        if (dna.equals("")) {
            return input;
        }
        /*if (input.substring(0, 3).equals(dna.substring(dna.length() - 3, dna.length()))) {
            return dna + input.substring(3, input.length());
        }*/
        for (int startDNA = dna.length() - 1; startDNA != 0; startDNA--) {
            for (int endInput = 1; endInput != input.length(); endInput++) {
                String tempDna = dna.substring(startDNA, dna.length());
                String tempInput = input.substring(0, endInput);
                if (tempDna.equals(tempInput)) {
                    return dna + input.substring(endInput, input.length());
                }
            }
        }
        return null;


    }

    public static int startCoden(String dna) {
        /*There may be more than one (1) start codon in the DNA. You only need to look at the first one.*/
        String startMark = "atg";
        for (int end = 3; end <= dna.length(); end++) {
            if (dna.substring(end - 3, end).equals(startMark)) {
                return end - 3;
            }

        }
        return -1;
    }

    public static int endCoden(String dna) {
        /*There may be more than one (1) start codon in the DNA. You only need to look at the first one.*/
        String[] endMarks = {"tag", "taa", "tga"};
        int step = 3;
        for (int start = startCoden(dna);start+3<=dna.length();start+=3){
            String temp = dna.substring(start,start+step);
            if(Arrays.asList(endMarks).contains(temp)){
                return start;
            }
        }


        return -1;
    }

    public static void printGeneResult(String dna) {
        String eyeColor = "";
        String hairColor = "";
        String tongue = "";
        String gene = dna.substring(startCoden(dna),endCoden(dna));
        switch (gene.substring(20,21)){
            case "a":
                eyeColor = "blue";
                break;
            case "t":
                eyeColor = "green";
                break;
            case "c":
                eyeColor = "brown";
                break;
            case "g":
                eyeColor = "brown";
                break;
        }
        switch (gene.substring(18,19)){
            case "a":
                hairColor = "black";
                break;
            case "t":
                hairColor = "blond";
                break;
            case "c":
                hairColor = "brown";
                break;
            case "g":
                hairColor = "red";
                break;
        }
        switch (gene.substring(8,9)){
            case "a":
                tongue = "yes";
                break;
            case "t":
                tongue = "no";
                break;
            case "c":
                tongue = "no";
                break;
            case "g":
                tongue = "no";
                break;
        }
        System.out.println("");
        System.out.println("Analysis Results");
        System.out.println("");
        System.out.printf("Eye color: %s\n" +
                "Hair color: %s\n" +
                "Can roll tongue? %s", eyeColor,hairColor,tongue);
    }

    public static void main(String[] args) {
        String dna = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Input lowercase DNA fragments one line at a time. End with a blank line.");
        while (input.hasNextLine()) {
            String dnaInput = input.nextLine();
            dnaInput = dnaInput.toLowerCase();
            if (dnaInput.equals("")) {
                break;
            }
            if (!checkValid(dnaInput)) {
                System.out.println("DNA is invalid");
                break;
            }
            dna = joinDNA(dnaInput, dna);

        }
        System.out.println("Input DNA: " + dna);

        /*Codon*/
        if(startCoden(dna) == -1){
            System.out.println("DNA does not contain a gene start codon");
        }else {
            if(endCoden(dna) == -1){
                System.out.println("DNA does not contain a gene end codon");

            }else {
                System.out.println("Start codon position: " +startCoden(dna));
                System.out.println("End codon position: "+ endCoden(dna));
                System.out.println("Gene: "+dna.substring(startCoden(dna),endCoden(dna)));
                if(endCoden(dna)-startCoden(dna) < 30){
                    System.out.println("The gene is not long enough to continue.");
                }else {
                    /*Print the result*/
                    printGeneResult(dna);
                }


            }
        }



    }
}
