package RandomSolutions;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase();
        String arr[] = paragraph.split("\\s+");
        HashMap<String,Integer> hm = new HashMap<>();
        int max=0;
        String ans = null;
        for (int i =0; i<arr.length; i++){
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        for (int i=0; i<banned.length; i++){
            if (hm.containsKey(banned[i]) || hm.containsKey("")){
                hm.put(banned[i],0);
            }
        }
        for(Map.Entry<String,Integer> entry : hm.entrySet()) {
            if (max < entry.getValue()){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
