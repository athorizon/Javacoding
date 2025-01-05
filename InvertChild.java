
/**
 * 104. Maximum Depth of Binary Tree
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

example1
Input: root = [3,9,20,null,null,15,7]
Output: 3
 */



   /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class InvertChild {
    static TreeNode invertchild(TreeNode root){
    if(root == null){
        return root;
    }
    TreeNode temp = invertchild(root.right);
    root.right = invertchild(root.left);
    root.left = temp;
    // System.out.print(root.val+" ");
    return root;
}
    static void printval(TreeNode root){
        if(root == null){
            return;
        }
        printval(root.left);
        System.out.print(root.val+" ");
        printval(root.right);
        // System.out.println();
    }

    public static void main(String[] args){
        // TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        printval(root);
        System.out.println();
        printval(invertchild(root));
    }
}

