package RandomSolutions;

import java.util.List;

public class WordBreak {

    public static void wordBreak(String str, List<String> wordDict){
        for (int i=0; i<wordDict.size();i++){
            str = str.replace(wordDict.get(i),"");
        }
        if (str.isEmpty()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
