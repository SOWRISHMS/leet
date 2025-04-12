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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> st=new LinkedList<>();
        st.offer(root);
        List<Double> list =new ArrayList<>();
        while(!st.isEmpty())
        {   double sum=0;
            List<Integer> lt =new ArrayList<>();
            int size=st.size();
            for(int i=0;i<size;i++)
            {   TreeNode s=st.poll();
                lt.add(s.val);
                if(s.left!=null)
                {
                    st.offer(s.left);
                }
                if(s.right!=null)
                {
                    st.offer(s.right);
                }
            }
            for(int i:lt)
            {
                sum+=i;
            }
            int l=lt.size();
            list.add((double)sum/l);

        }
        return list;
        
        
    }
  
}