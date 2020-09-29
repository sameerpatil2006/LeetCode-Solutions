package RandomSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Intersection2Arrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<nums1.length ;i++){
            if (hm.containsKey(nums1[i])){
                hm.put(nums1[i],hm.get(nums1[i])+1);
            }
            else {
                hm.put(nums1[i], 1);
            }
        }
        List<Integer> nums3 = new ArrayList<>();
        for (int i=0; i<nums2.length; i++){
            if (hm.containsKey(nums2[i])){
                nums3.add(nums2[i]);
                if(hm.get(nums2[i]) == 1){
                    hm.remove(nums2[i]);
                }
                else{
                    hm.put(nums2[i],hm.get(nums2[i])-1);
                }
            }
        }
        int res[] = new int[nums3.size()];
        for(int i=0; i<nums3.size(); i++){
            res[i] = nums3.get(i);
        }
        return res;
    }
}
