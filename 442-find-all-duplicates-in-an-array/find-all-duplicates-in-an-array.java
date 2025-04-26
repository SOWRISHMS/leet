class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
     List<Integer> list=new ArrayList<>();   
     for(int i:nums)
     {
        if(set.contains(i))
        { 
            list.add(i);
            continue;
        }
          set.add(i);
     }
     return list;
    }
}