package tree;

import java.util.Stack;

/**
 * Created by fuxiuyang on 17-6-21.
 */
public class Tree {

    public TreeNode createTree(){
        TreeNode root = null;
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        root = node1;
        root.left = node2;
        root.right = node3;
        root.left.left = node4;
        root.left.right = node5;
        root.right.right = node6;

        return root;
    }

    /**
     * 递归先序遍历
     * @param root
     */
    public void preOrder(TreeNode root){
        if (root != null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * 非递归先序遍历
     * @param root
     */
    public void nonRecPreOrder(TreeNode root){
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.empty()){
            node = stack.peek();
            while (node != null){
                System.out.println(node.data);
                node = node.left;
                stack.push(node);
            }
            stack.pop();
            if (!stack.empty()){
                node = stack.pop();
                stack.push(node.right);
            }
        }
    }

    /**
     * 递归中序遍历
     * @param root
     */
    public void inOrder(TreeNode root){
        if (root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    /**
     * 非递归中序遍历
     * @param root
     */
    public void nonRecInOrder(TreeNode root){
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (root != null && !stack.empty()){
            node = stack.peek();

            while (node != null){
                node = node.left;
                stack.push(node);
            }
            stack.pop();

            if (!stack.empty()){
                node = stack.pop();
                System.out.println(node.data);
                stack.push(node.right);
            }

        }
    }

    /**
     * 递归后序遍历
     * @param root
     */
    public void postOrder(TreeNode root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    /**
     * 非递归后序遍历
     * @param root
     */
    public void nonRecPostOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node01 = root;
        TreeNode node02 = null;
        stack.push(node01);

        while (!stack.empty()){
            node01 = stack.peek();

            while (node01 != null){
                node01 = node01.left;
                stack.push(node01);
            }
            stack.pop();
            node02 = null;

            while (!stack.empty()){
                node01 = stack.peek();
                if (node01.right == null || node01.right == node02){
                    System.out.println(node01.data);
                    node02 = node01;
                    stack.pop();
                }else {
                    node01 = node01.right;
                    stack.push(node01);
                    break;
                }
            }
        }


    }

}
