package Trees;

public class SearchTree {
    public static void search(BinaryTree root, int key, BinaryTree parent)
    {
        // if key is not present in the key
        if (root == null)
        {
            System.out.print("Key Not found");
            return;
        }

        // if key is found
        if (root.data == key)
        {
            if (parent == null) {
                System.out.print("The node with key " + key + " is root node");
            }

            else if (key < parent.data) {
                System.out.print("Given key is left node of node with key "
                        + parent.data);
            }
            else {
                System.out.print("Given key is right node of node with key "
                        + parent.data);
            }

            return;
        }

        // if given key is less than the root node, recur for left subtree
        // else recur for right subtree

        if (key < root.data) {
            search(root.left, key, root);
        }
        else {
            search(root.right, key, root);
        }
    }

}
