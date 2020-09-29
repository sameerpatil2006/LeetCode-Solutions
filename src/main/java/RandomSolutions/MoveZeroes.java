package RandomSolutions;

/*
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                nums[j] = nums[i];
                j++;
            }
        }
        while(count!=0){
            nums[j] = 0;
            j++;
            count--;
        }
    }
}
