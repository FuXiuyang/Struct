package tree;

/**
 * Created by fuxiuyang on 17-6-21.
 */
public class TreeMain {

    public static void main(String args[]){

        Tree tree = new Tree();

        TreeNode root = tree.createTree();
        System.out.println("递归先序遍历:");
        tree.preOrder(root);
        System.out.println("非递归先序遍历:");
        tree.nonRecPreOrder(null);

        System.out.println("递归中序遍历:");
        tree.inOrder(root);

        System.out.println("非递归中序遍历:");
        tree.nonRecInOrder(root);

        System.out.println("递归后序遍历:");
        tree.postOrder(root);

        System.out.println("非递归后序遍历:");
        tree.nonRecPostOrder(root);
    }
}
