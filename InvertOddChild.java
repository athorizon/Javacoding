
/**
 * 2415. Reverse Odd Levels of Binary Tree
 * 
Given the root of a perfect binary tree, reverse the node values at each odd level of the tree.

For example, suppose the node values at level 3 are [2,1,3,4,7,11,29,18], then it should become [18,29,11,7,4,3,1,2].
Return the root of the reversed tree.

A binary tree is perfect if all parent nodes have two children and all leaves are on the same level.

The level of a node is the number of edges along the path between it and the root node.
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


class InvertOddChild {
    static void invertchild(TreeNode left,TreeNode right,int level){
        if(left == null ||right==null){
            return;
        }
        if((level%2 == 0)){
        int temp = right.val;
        right.val = left.val;
        left.val = temp;
        }
       
        invertchild(left.left,right.right,level+1);
        invertchild(left.right,right.left,level+1);
        // System.out.print(root.val+" ");
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
        invertchild(root.left,root.right,0);
        printval(root);
    }
}

