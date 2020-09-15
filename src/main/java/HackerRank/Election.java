import java.util.HashMap;
import java.util.Map;

public class Election {
    public static void main(String[] args) {
        String winner;
        String[] arr = {"sandesh"};
        winner = electionWinner(arr);
        System.out.println(winner);
    }

    public static String electionWinner(String[] votes) {
        int maxVote = 0;
        String elected = "";
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < votes.length; i++) {
            if (map.containsKey(votes[i])) {
                map.put(votes[i], map.get(votes[i]) + 1);
            } else {
                map.put(votes[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > maxVote) {
                maxVote = value;
                elected = key;
            } else if (value == maxVote && elected.compareTo(key) > 0) {
                elected = key;
            }
        }
        return elected;
    }
}




