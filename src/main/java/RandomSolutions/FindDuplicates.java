package RandomSolutions;

import java.util.*;

public class FindDuplicates {

    public static Object[] findDuplicates(int[] numbers) {
        List<Integer> res = new ArrayList<>();
        int j = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (hs.containsKey(numbers[i])) {
                hs.put(numbers[i], hs.get(numbers[i]) + 1);
            } else {
                hs.put(numbers[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            if (entry.getValue() > 1) {
                res.add(entry.getKey());
            }
        }
        return res.toArray();
    }
}