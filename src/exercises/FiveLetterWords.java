package exercises;

import java.util.ArrayList;

public class FiveLetterWords {
    public static ArrayList<String> findWord(ArrayList arrayListVar) {
        ArrayList<String> fiveLetterWordList = new ArrayList<>();
        for (int i = 0; i<arrayListVar.size(); i++) {
            if (arrayListVar.get(i).toString().length() == 5) {
                fiveLetterWordList.add((String)arrayListVar.get(i));
            }
        }
        return fiveLetterWordList;
    }
}
