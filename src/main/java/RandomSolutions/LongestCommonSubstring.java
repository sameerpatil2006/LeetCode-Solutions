package RandomSolutions;

public class LongestCommonSubstring {
    public static int longestCommonSubstring(String a, String b){
        int j =0;
        String a2 = a;
        int strLen = a.length();
        for (int i=a.length() -1; i>=0; i--){
            if (b.contains(a)){
                return a.length();
            }
            else {
                a = a.substring(0,i);
            }
            if (a.isEmpty()){
                j++;
                a = a2.substring(j,strLen);
                i = a.length();
            }
        }
        return 0;
    }
}
