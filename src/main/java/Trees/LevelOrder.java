package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//Level order in same line
public class LevelOrder {
    public static void levelOrder(BinaryTree root){
        BinaryTree rm;
        Queue<BinaryTree> q = new LinkedList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        q.add(root);
        while (!q.isEmpty()){
            rm = q.remove();
            if (!hm.containsKey(rm.hd)) {
                hm.put(rm.hd, rm.data);
            }
            if(rm.left !=null){
                rm.left.hd = rm.hd-1;
                q.add(rm.left);
            }
            if(rm.right != null){
                rm.right.hd = rm.hd+1;
                q.add(rm.right);
            }
            System.out.print(hm.values());
        }

    }
}
