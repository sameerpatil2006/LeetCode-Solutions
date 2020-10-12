package RandomSolutions;

import java.util.*;

public class Anagram {
    public static boolean isAnagramUsingBitMap(String word1, String word2){
        int[] letters = new int[256];
        System.out.println(letters.length);
        for(int i=0; i<word1.length();i++){
            letters[word1.charAt(i)] = letters[word1.charAt(i)]+1;
        }
        for(int i=0; i<word2.length();i++){
            if(letters[word2.charAt(i)] ==0){
                return false;
            }
            else {
                letters[word2.charAt(i)] = letters[word2.charAt(i)]-1;
            }
        }
        for (int i=0; i<letters.length; i++){
            if(letters[i]>0){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramUsing2Loops(String str1, String str2){
        for (int i=0;i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    str2 = str2.substring(0,j) + str2.substring(j+1);
                    break;
                }
            }
        }
        if(str2.length() == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isAnagramUsingHashMap(String str1, String str2){
        HashMap<Character, Integer> hm = new HashMap<>();
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        
        for (int i=0; i<ch1.length; i++){
            if (hm.containsKey(ch1[i])){
                hm.put(ch1[i], hm.get(ch1[i])+1);
            }
            else {
                hm.put(ch1[i],1);
            }
        }

        for (int j=0; j<ch2.length; j++){
            if(hm.containsKey(ch2[j])){
                hm.put(ch2[j], hm.get(ch2[j])-1);
            }
            else {
                return false;
            }
        }

        for (Map.Entry<Character,Integer> entry : hm.entrySet())
            if (entry.getValue() != 0){
                return false;
        }
        return true;
}

    public static boolean isAnagramUsingSort(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i=0;i <ch1.length; i++){
            if (ch1[i] != ch2[i]){
              return false;
            }
        }
        return true;
    }
}
