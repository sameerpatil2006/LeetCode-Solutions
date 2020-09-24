package RandomSolutions;

import java.util.HashMap;

/*
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        int a[] = new int[256];
        int b[] = new int[256];
        boolean res = false;

        if(ransomNote.equals("")){
            return true;
        }
        for (int i=0 ;i<magazine.length(); i++){
            a[magazine.charAt(i)]++;
        }

        for (int i=0 ;i<ransomNote.length(); i++){
            b[ransomNote.charAt(i)]++;
        }

        for(int i=0; i<256; i++){
            if(b[i] <= a[i] && a[i]>0){
                res=true;
            }
            else if(b[i] > a[i]){
                res = false;
                break;
            }
        }
        return res;
    }
}

/*
Solution 2

HashMap<Character, Integer> hm = new HashMap<>();
        for (int i=0; i<magazine.length(); i++){
            if(hm.containsKey(magazine.charAt(i))){
                hm.put(magazine.charAt(i),hm.get(magazine.charAt(i))+1);
            }
            else {
                hm.put(magazine.charAt(i), 1);
            }
        }

        for(int i=0; i<ransomNote.length();i++){
            if((!hm.containsKey(ransomNote.charAt(i))) || hm.get(ransomNote.charAt(i))==0){
                return false;
            }
            else {
                hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))-1);
            }
        }
        return true;

  */
