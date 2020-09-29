package RandomSolutions;

public class SortColors {
    public static void sortColors(int[] nums) {
        int j =1, i=0;
        int swap;
        while(i < nums.length-1){
            if (nums[j]<nums[i]){
                swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
            }
            j++;
            if(j == nums.length){
                i++;
                j=i;
            }
        }
    }
}
