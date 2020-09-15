import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HomeEdge {

    public static void main(String args[]) throws Exception {

        List<Integer> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
        reader.close();
        if (n<0){
            throw new ArithmeticException("Number is Negative");
        }
        for (int i = 1 ; i<=n;i++ ){
            boolean  ans = isPrime(i);
            if (ans){
             list.add(i);
            }
        }
        System.out.println(list);
    }

    /**
     * Checks if given number is prime or not
     * @param num
     * @return
     */
    public static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i < (num/2)+1; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
