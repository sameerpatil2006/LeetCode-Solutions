package RandomSolutions;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum =0, i=0;
        for(int j=i; j<nums.length; j++){
            sum = sum + nums[j];
            if(nums[j] > sum && max < nums[j]){
                max = nums[j];
            }
            if(sum > max){
                max = sum;
            }
            if(j==nums.length-1 &&  i <= nums.length-1){
                j = i;
                sum =0;
                i++;
            }
        }
        return max;
    }

}
