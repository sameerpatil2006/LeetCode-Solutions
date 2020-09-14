package RandomSolutions;

public class PlaindromeString {
    public static boolean isPalin(String str){
        boolean flag = true;
        int j= str.length()-1;
        for(int i = 0; i<=str.length()/2; i++){
            if(str.charAt(i) == str.charAt(j)){
                j--;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
