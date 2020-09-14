package Trees;

public class InsertTree {

    public static BinaryTree insert(BinaryTree root, int key) {
        // if the root is null, create a new node and return it
        if (root == null) {
            return new BinaryTree(key);
        }

        // if given key is less than the root node, recur for left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        // if given key is more than the root node, recur for right subtree
        else {
            root.right = insert(root.right, key);
        }

        return root;
    }
}
