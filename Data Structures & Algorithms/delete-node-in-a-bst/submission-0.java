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
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        //base case
        if(root == null){
            return null;
        }

        if(key<root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }
        else{
            //Case 1: if it has one 0 or one node
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            else{
                //Find the min node iof the right of root
                TreeNode minNode = minNode(root.right);
                //update the root val with min node value
                root.val = minNode.val;
                //remove the min node
                root.right = deleteNode(root.right,minNode.val);
            }
        }
        return root;
    }

    public TreeNode minNode(TreeNode root){
        TreeNode curr = root; 
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}