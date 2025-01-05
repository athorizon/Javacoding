
/**
 * 104. Maximum Depth of Binary Tree
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

example1
Input: root = [3,9,20,null,null,15,7]
Output: 3
 */

//  * Definition for a binary tree node.

 


public class CopyofTree {
    static Boolean checknode(TreeNode a,TreeNode b){
    if(a==null && b==null){
        return true;
    }
    if(a == null && b!=null){
        return false;
    }else if(a!=null && b==null){
        return false;
    }else if(a.val != b.val){
        return false;
    }
    return  checknode(a.left,b.left) && checknode(a.right,b.right);
}
    public static Boolean maxDepth(TreeNode a, TreeNode b) {
        return checknode(a,b);
    }

    public static void main(String[] args){
        // TreeNode root1 = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        // TreeNode root2 = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(6)));

        TreeNode root1 = new TreeNode(1,new TreeNode(2),null);
        TreeNode root2 = new TreeNode(1,null,new TreeNode(2));
        System.out.println(maxDepth(root1,root2));
    }
}