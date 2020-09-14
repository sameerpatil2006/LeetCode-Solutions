package RandomSolutions;

public class ReverseVowels {

    //Hello -- Holle
    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char s1[] = s.toCharArray();
        char temp;

        while (i < j) {

            if ((s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u') && (s1[j] == 'a' || s1[j] == 'e' || s1[j] == 'i' || s1[j] == 'o' || s1[j] == 'u')) {
                temp = s1[i];
                s1[i] = s1[j];
                s1[j] = temp;
                i++;
                j--;
            } else if ((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
                j--;
            } else {
                i++;
            }
        }

        return String.valueOf(s1);
    }
}
