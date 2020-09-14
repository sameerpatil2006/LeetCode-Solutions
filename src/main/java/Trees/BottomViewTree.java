package Trees;

import java.util.*;

public class BottomViewTree {

    public static void bottomView(BinaryTree root) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Queue<BinaryTree> q = new LinkedList<>();
        q.add(root);
        root.hd = 0;

        while (!q.isEmpty()) {
            BinaryTree temp = q.remove();
            if (!hm.containsKey(temp.hd)){
                hm.put(temp.hd, temp.data);
            }
            if (temp.left != null) {
                temp.left.hd = temp.hd - 1;
                q.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.hd = temp.hd + 1;
                q.add(temp.right);
            }
        }
        Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> me = (Map.Entry<Integer, Integer>) it.next();
            System.out.print(me.getValue() + " ");
        }
    }
}
