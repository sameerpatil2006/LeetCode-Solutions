package Trees;

public class DeleteNode {
    public static BinaryTree delete(BinaryTree root, int key){
        if(root == null){
            return root;
        }
        if (root.data > key){
            root.left = delete(root.left, key);
        }
        else if (root.data < key){
            root.right = delete(root.right, key);
        }
        else{
            if (root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);

        }
        return root;
    }

    public static int minValue(BinaryTree root){
        int minvalue = root.data;
        while(root.left != null){
            minvalue = root.left.data;
            root = root.left;
        }
        return minvalue;
    }
}
