
public class SavePrisoner {

    static int saveThePrisoner(int n, int m, int s) {
        int result = s;
        int swt = m % n;
        System.out.println(swt);
        if (swt != 0) {
            result = s + (swt - 1);
            if (result > n){
                result = result % n;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int n = 5 ;
        int m = 4;
        int s = 3;
        int result;
        result = saveThePrisoner(n, m, s);
        System.out.println(result);

    }

}
