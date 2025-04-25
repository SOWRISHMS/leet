class Solution {
    public int singleNonDuplicate(int[] nums) {
      Stack<Integer> st=new Stack<>();
      int size=nums.length;
      for(int i=0;i<size;i++)
      {
        if(st.empty())
        {
            st.push(nums[i]);
        }
        else if(st.peek().equals(nums[i]))
        {
            st.pop();
        }
        else
        {
            st.push(nums[i]);
        }
      }
      return st.peek();
     
    }
}