package RandomSolutions;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int result[] = new int[2];
        int sub = 0;
        for(int i=0; i<nums.length;i++){
            sub = target - nums[i];
            if (hmap.containsKey(nums[i])){
                result[0] = i;
                result[1] = hmap.get(nums[i]);
                return result;
             }
            else {
            hmap.put(sub,i);
            }
        }
        return result;
    }
}


 /*   public int[] twoSum(int[] nums, int target)
    {
        int result[]= new int[2];
        for (int i =0 ; i < nums.length ; i++ )
        {
            for (int j=i+1 ; j<nums.length;j++)
            {
                if(nums[i] + nums [j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }

        }
        return result;
    }*/