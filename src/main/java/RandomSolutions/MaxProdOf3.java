package RandomSolutions;

import java.util.Arrays;

public class MaxProdOf3 {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod = 1, prod1 =1;
        if(nums[0] < 0 && nums[1] < 0){
            prod = nums[0]*nums[1]*nums[nums.length-1];
        }
        prod1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(prod,prod1);
    }
}
