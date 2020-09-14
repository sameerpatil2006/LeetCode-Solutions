package Trees;

public class TreeTraversals {

    public static void inOrder(BinaryTree root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(" " +root.data);
        inOrder(root.right);
    }

    public static void preOrder(BinaryTree root){
        if (root == null){
            return;
        }
        System.out.print(" " +root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(BinaryTree root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " +root.data);
    }
}
