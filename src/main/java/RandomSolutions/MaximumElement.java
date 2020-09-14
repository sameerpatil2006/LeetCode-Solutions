package RandomSolutions;

import java.util.HashMap;
import java.util.Map;

public class MaximumElement {

    // [1,2,2,3,2,3,4] == 2
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i])+1 );
            }
            else{
                hmap.put(nums[i], 1 );
            }
        }

        int max =0, key=0;

        for (Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            if(max < entry.getValue()) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        return key;

    }
}
