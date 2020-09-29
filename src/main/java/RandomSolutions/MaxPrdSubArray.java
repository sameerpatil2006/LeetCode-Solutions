package RandomSolutions;

public class MaxPrdSubArray {
    public static int maxProduct(int[] nums) {
        int i=0;
        int max = nums[0];
        int prod = max;

        for(int j =i+1; j<nums.length; j++){
            if(prod > max){
                max = prod;
            }
            prod = prod*nums[j];
            if(prod > max){
                max = prod;
            }
            if(j == nums.length-1 && i != nums.length-1){
                i++;
                j =i;
                prod = nums[i];
            }
        }
        if(nums[i] > max){
            max = nums[i];
        }
        return max;
    }
}
