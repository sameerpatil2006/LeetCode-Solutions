package RandomSolutions;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i= 0,j =0;
        while (j < nums.length){
            if(nums[i] != nums[j] ){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}

/*
    public int removeDuplicates(int[] nums) {
        int j=0;
        int count =0;
        for(int i=0; i<nums.length-1; i++){
            j =i+1;
            if(nums[i] == nums[j] ){
                nums[i] =  Integer.MAX_VALUE;
            }
        }
        j =0;
        for (int i=0; i<nums.length;i++){
            if(nums[i] != Integer.MAX_VALUE ){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }*/
