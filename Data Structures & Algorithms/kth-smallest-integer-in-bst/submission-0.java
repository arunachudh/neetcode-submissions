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
    public int cnt=0;
    public int largest;
    public int kthSmallest(TreeNode root, int k) {
        findkthSmallest(root, k);
        return largest;
    }

    public void findkthSmallest(TreeNode node, int k) {
    
        if(node==null || k<0){
            return;
        }
        findkthSmallest(node.left,k);
        cnt++;
        if(cnt==k){
            largest = node.val;
        }
        
        findkthSmallest(node.right,k);
    }
}
