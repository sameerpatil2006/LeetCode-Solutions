package Trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewTree {
    public static void TopView(BinaryTree root) {
        class QueueObj {
            BinaryTree node;
            int hd;

            QueueObj(BinaryTree node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, BinaryTree> topViewMap = new TreeMap<Integer, BinaryTree>();

        if (root == null) {
            return;
        } else {
            q.add(new QueueObj(root, 0));
        }

        System.out.println("The top view of the tree is : ");

        // count function returns 1 if the container
        // contains an element whose key is equivalent
        // to hd, or returns zero otherwise.
        while (!q.isEmpty()) {
            QueueObj tmpNode = q.poll();
            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node);
            }

            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1));
            }

        }
        for (Map.Entry<Integer, BinaryTree> entry : topViewMap.entrySet()) {
            System.out.print(entry.getValue().data);
        }
    }
}
