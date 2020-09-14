package RandomSolutions;

public class PalindromeInt {

    public static boolean isPalinInt(int num){
        int pal = num;
        int rev =0, rem =0;
        while(num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == pal)
            return true;
        else
            return false;
    }
}
