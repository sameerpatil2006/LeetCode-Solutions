package RandomSolutions;

public class Prime {

    public static boolean isPrime(int num){
        boolean flag = true;
        for (int i =2; i<=num/2; i++){
            System.out.println("I:" +i);
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
