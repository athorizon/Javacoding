
/**
 * 104. Maximum Depth of Binary Tree
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

example1
Input: root = [3,9,20,null,null,15,7]
Output: 3
 */


class DepthofBTree {
    static int checknode(TreeNode root){
    if(root == null){
        return 0;
    }
    return Math.max(checknode(root.left),checknode(root.right))+1;
}
    public static int maxDepth(TreeNode root) {
        return checknode(root);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        System.out.println(maxDepth(root));
    }
}

