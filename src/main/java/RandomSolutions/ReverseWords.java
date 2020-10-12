package RandomSolutions;

import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (int i=0; i<arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = String.valueOf((sb.reverse()));
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i =0; i<arr.length; i++){
            sb2.append(arr[i]);
        }
        return sb2.toString();
    }
}
