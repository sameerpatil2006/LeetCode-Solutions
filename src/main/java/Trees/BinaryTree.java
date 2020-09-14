package Trees;

public class BinaryTree {

        int data;
        int hd;
        BinaryTree left = null, right = null;

        BinaryTree(int data) {
            this.data = data;
            left = right = null;
            hd = 0;
        }
    }
