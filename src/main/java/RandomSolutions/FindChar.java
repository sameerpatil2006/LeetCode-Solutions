package RandomSolutions;

public class FindChar {

    public static char findChar(int m, int n){
        StringBuffer sb = new StringBuffer();
        for (int i=1; i<=n; i++){
            sb.append(i);
        }
        return sb.charAt(n);
    }
}
