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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root==null){
            return ll;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            List<Integer> ls = new ArrayList<>();
            int count=q.size();
            for(int i=0; i<count; i++){
                TreeNode el=q.remove();
                ls.add(el.val);
                if(el.left!=null){
                    q.add(el.left);
                }
                if(el.right!=null){
                    q.add(el.right);
                }
            }
            ll.add(ls);
        }
        return ll;
    }
}