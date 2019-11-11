package exercises;

import java.util.ArrayList;

public class SumEvenNumbers {
    public static int sumNumbers(ArrayList<Integer> arrayListVar) {
        Integer sumOfEvenNumbers = 0;
        for (int i = 0; i< arrayListVar.size(); i++) {
            if (arrayListVar.get(i) % 2 == 0) {

                sumOfEvenNumbers += arrayListVar.get(i);
            }
        }
        return sumOfEvenNumbers;
    }
}
