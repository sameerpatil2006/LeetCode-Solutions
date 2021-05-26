package RandomSolutions;

public class LongestPalindromicSubstring {

    public static void longestPalindromicSubstring(String string){
       int j=0, count =0;
       String toCheck, longStr = null;
        for (int i=string.length(); i>j; i--){
            toCheck = string.substring(j,i);
            if (isPalindrome(toCheck)){
                if (toCheck.length() > count){
                    longStr = toCheck;
                    count = toCheck.length();
                }
                i = string.length()+1;
                j++;
            }
            if (i == 1){
                j++;
                i = string.length();
            }
        }
        System.out.println(longStr);
    }

    public static boolean isPalindrome(String str){
        if (str.length() == 1){
            return true;
        }
        int len = str.length()-1;
        boolean flag = false;
        for (int k =0; k<str.length()/2; k++ ){
            if (str.charAt(k) == str.charAt(len)){
                len--;
                flag = true;
            }
            else {
                return false;
            }
        }
        return flag;
    }
}
