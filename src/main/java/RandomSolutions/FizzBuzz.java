package RandomSolutions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        int i =1;
        List<String> res = new ArrayList<>();
        while ( i <= n){
            if (i%3==0 && i%5==0){
                res.add("FizzBuzz");
            }
            else if(i%3==0){
                res.add("Fizz");
            }
            else if(i%5 ==0){
                res.add("Buzz");
            }
            else {
                res.add(Integer.toString(i));
            }
            i++;
        }
        return res;
    }
}
