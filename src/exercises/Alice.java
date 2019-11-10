package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        String aliceLC= aliceFirstSentence.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Phrase/word to search for: ");
        String phrase = input.nextLine().toLowerCase();
        boolean containsPhrase = aliceLC.contains(phrase);
        int indexOfPhrase = aliceLC.indexOf(phrase);
        int lengthOfPhrase = phrase.length();
        System.out.println("Contains " + phrase +": "+containsPhrase);
        System.out.println("The length of phrase/word " + "'" + phrase + "'" + " is " + lengthOfPhrase + " and is at the index of " + indexOfPhrase );
        String newAlice = aliceFirstSentence.substring(0, indexOfPhrase) + aliceFirstSentence.substring(indexOfPhrase+lengthOfPhrase+1);
        System.out.println("CONFIRMATION: " + newAlice);
    }
}
