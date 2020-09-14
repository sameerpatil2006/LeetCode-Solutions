package RandomSolutions;

public class Rotate_K_Elements {

    /* 12345678,
       k = 3
       67812345
     */

    public static void rotate(int[] nums, int k) {
        if(k > nums.length){
            k = k-nums.length ;
        }
        if(nums.length != 1 && nums.length != k && k !=0){

            int j = nums.length-k-1;
            for (int i=0; i<(nums.length-k)/2; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }

            j = nums.length-1;
            int mid = (j + nums.length-k)/2;

            for (int i=nums.length-k; i<=mid; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }

            j = nums.length-1;
            for (int i=0; i<=nums.length/2; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
}
