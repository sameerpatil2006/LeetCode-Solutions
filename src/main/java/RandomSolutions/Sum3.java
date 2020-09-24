package RandomSolutions;

import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;
/*
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
 */
public class Sum3 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        int sum, j, k;
        boolean a = false;
        for(int i=0; i<nums.length-1; i++){
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            for (j= i+1 ; j<nums.length; j++) {
                a = false;
                list.add(nums[j]);
                sum = nums[i]+nums[j];
                k = j+1;
                while (k < nums.length) {
                    if (sum + nums[k] == 0) {
                        list.add(nums[k]);
                        ls.add(list);
                    }
                    k++;
                }
            }
        }
        return ls;
    }

}
