package RandomSolutions;

public class NumberOfSegments {
    public static int countSegments(String s) {
        int count =0;
        String str[] = s.split(" ");
        for(int i=0; i<str.length; i++){
            if (!str[i].equals("")){
                count++;
            }
        }
        return count;
    }
}
