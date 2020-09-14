package RandomSolutions;

public class Factorial {

    public static int fact(int num){
        //Recursive
           /* if(num <=1){
                return 1;
            }
            return num * fact(num-1);*/

        //Iterative
        int result=1;
        while (num > 1){
            result = result * num;
            num--;
        }
        return result;
    }
}
