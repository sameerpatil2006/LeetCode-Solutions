package Trees;

import java.util.LinkedList;
import java.util.Queue;

//Level Order with new line
public class LevelByLevel {

    public static void levelbylevel(BinaryTree root) {
        Queue<BinaryTree> queue = new LinkedList<>();
        BinaryTree current = root;
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            current = queue.remove();
            if (current != null) {
                System.out.print(current.data);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            else if (current == null) {
                System.out.println();
                queue.add(null);
            }
        }
    }
}
