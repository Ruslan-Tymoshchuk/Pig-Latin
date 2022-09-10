package pl.com.piglatin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PigLatin pigLatin = new PigLatin();
        while (scanner.hasNextLine()){
        System.out.println(pigLatin.createSentence(scanner.nextLine()));
        }
        scanner.close();
    }
}