package RandomSolutions;

public class CountPrimes {
    public static int countPrimes(int n) {
        int count =0, i=2;
        while(i <n){
            if (isPrime(i)){
                count++;
            }

            i++;
        }
        return count;
    }

    public static boolean isPrime(int n){
        boolean flag = true;
        for(int j = 2; j<=n/2; j++){
            if( n % j == 0){
                flag = false;
            }
        }
        return flag;
    }
}
