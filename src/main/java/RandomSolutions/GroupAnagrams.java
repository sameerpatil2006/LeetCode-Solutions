package RandomSolutions;

import java.util.*;

public class GroupAnagrams {

    public static void groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            char ch1[] = strs[i].toCharArray();
            Arrays.sort(ch1);
            String asc = new String(ch1);
            if (hmap.containsKey(asc)){
                List<String> l2;
                l2 = hmap.get(asc);
                l2.add(strs[i]);
                hmap.put(asc,l2);
            }
            else {
                List<String> l1 = new ArrayList<>();
                l1.add(strs[i]);
                hmap.put(asc,l1);
            }
        }
        for (Map.Entry<String,List<String>> entry : hmap.entrySet()){
            res.add(entry.getValue());
            }
    }
}
