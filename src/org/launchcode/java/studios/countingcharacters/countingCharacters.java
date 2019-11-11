package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        // too lazy to change the variable name :'(
        String hiddenFigures = input.nextLine();
        //String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String hiddenFiguresLower = hiddenFigures.toLowerCase();
        char[] charactersInStringLower = hiddenFiguresLower.toCharArray();
        HashMap<Character, Integer> characterCountResults = new HashMap<>();
        //loop through all characters in array of characters
        for(int i = 0; i<charactersInStringLower.length; i++) {
            //if character is not contained in result hashmap AND is
            if (!characterCountResults.containsKey(charactersInStringLower[i]) && Character.isLetter(charactersInStringLower[i])) {
                int k = 0;
                //loop through array of characters and add to counter k
                for(int j = 0; j<charactersInStringLower.length; j++) {
                    if(charactersInStringLower[j]== charactersInStringLower[i]) {
                        k = k+1;
                    }
                }
                //
                characterCountResults.put(charactersInStringLower[i], k);
            }
        }
        for (char c : characterCountResults.keySet()) {
            System.out.println(c + ": " + characterCountResults.get(c));
        }

    }
}
