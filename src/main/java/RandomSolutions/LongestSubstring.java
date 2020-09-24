package RandomSolutions;

import java.util.HashSet;

public class LongestSubstring {

    public static int longestSubstring(String s){
        if(s.isEmpty()){
            return 0;
        }
        HashSet<Character> hs = new HashSet<>();
        int j=0;
        int len =0, max=1, count =0;
        for(int i =0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                len = hs.size();
                if(max < len){
                    max = len;
                }
                hs.clear();
                j++;
                i = j-1;
            }
            else{
                hs.add(s.charAt(i));
                if (i == s.length()-1 && max < hs.size()){
                    max = hs.size();
                }
            }

        }
        return max;
    }
}


/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        HashSet<Character> hs = new HashSet<>();
        int j=0;
        int len =0, max=1, count =0;
        for(int i =0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                len = hs.size();
                hs.clear();
                count = 1;
                j++;
                i = j;
                if(max < len){
                    max = len;
                }
            }
            else{
                hs.add(s.charAt(i));
                count++;
            }

        }
        if(count > max){
            max = count;
        }
        return max;
    }
}*/
