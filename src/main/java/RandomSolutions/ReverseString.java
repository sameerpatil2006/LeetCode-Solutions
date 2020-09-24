package RandomSolutions;

/*
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        char temp;
        while (start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(s);
    }
}
