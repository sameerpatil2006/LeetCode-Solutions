package RandomSolutions;

import java.util.HashMap;

public class NonRepeatChar {

    public static char firstNonRepeatChar(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        int value =0;
        for (int i=0; i<str.length(); i++) {
            if (hm.containsKey(str.charAt(i))){
                value = hm.get(str.charAt(i));
                hm.put(str.charAt(i), value+1);
            }
            else {
                hm.put(str.charAt(i), 1);
            }
        }
        for (int i=0; i<str.length()-1; i++){
            if(hm.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }
        return str.charAt(0);
    }

}
