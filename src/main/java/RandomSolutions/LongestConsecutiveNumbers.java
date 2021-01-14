package RandomSolutions;

public class LongestConsecutiveNumbers {

    public static void longestSequence(int[] num){
        int count =1;
        int res =1;
        for(int i=0; i<num.length-1; i++){
            int j = i+1;
            if (num[j] - num[i] == 1){
                count++;
            }
            else {
                res = Math.max(res,count);
                count=1;
            }
        }
        if (res < count){

            res =count;
        }
        System.out.println(res);
    }
}
