package RandomSolutions;

public class LongestPalindromicSubstring {

    public static void longestPalindromicSubstring(String string){
        int length = string.length();
        int substringLength = 0;
        String substring = "";
        int j =0;
        StringBuilder sb = new StringBuilder(string);
        if (length == 1 || string.equals(sb.reverse().toString())){
            System.out.println(string);
        }

        for (int i= length; i >= j ; i-- ){
            if (isPalindrome(string.substring(j,i))){
                if (string.substring(j,i).length() > substringLength){
                    substring = string.substring(j,i);
                }
            }
            if (i == j){
                j++;
                i = length;
            }
        }
        if (substring.isEmpty()){
            substring = string.substring(0,1);
        }
        System.out.println(substring);
    }

    public static boolean isPalindrome(String str){
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
