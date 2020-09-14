import Trees.BinaryTree;
import Trees.BottomViewTree;
import Trees.InsertTree;
import Trees.TopViewTree;

public class MainClass {
    public static void main(String args[]){
        BinaryTree root = null;
        int[] keys = { 1,2,3,4,5,6};

        for (int key : keys) {
            root = InsertTree.insert(root, key);
        }

        TopViewTree.TopView(root);
        BottomViewTree.bottomView(root);
    }
}
