package exercises;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(24);
        someNumbers.add(31);
        someNumbers.add(56);
        someNumbers.add(27);
        someNumbers.add(94);
        someNumbers.add(100);
        System.out.print(SumEvenNumbers.sumNumbers(someNumbers));

        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("happy");
        someWords.add("hello");
        someWords.add("johnny");
        someWords.add("seven");
        someWords.add("fifty");
        someWords.add("Alphie");
        System.out.print(FiveLetterWords.findWord(someWords));

    }
}
