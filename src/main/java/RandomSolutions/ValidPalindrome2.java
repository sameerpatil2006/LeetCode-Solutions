package RandomSolutions;

//Few Testcases failing
public class ValidPalindrome2 {
    public static boolean validPalindrome(String s) {
        int i=0;
        int j= s.length()-1;
        int count =0;
        if(s.isEmpty()){
            return true;
        }
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                count++;
                if(s.charAt(i+1)== s.charAt(j)){
                    i++;
                }
                else{
                    j--;
                }
                if(count>1){
                    return false;
                }
            }
        }
        return true;
    }
}
