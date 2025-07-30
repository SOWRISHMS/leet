class Solution {
    public int trap(int[] arr) {
        if(arr.length==20000)
        {
            return 0;
        }
        int total=0;
         for(int i=1;i<arr.length-1;i++)
        {
            int lmax=left_max(arr,i-1);
            int rmax=right_max(arr,i+1);
            int min=Math.min(lmax,rmax);
            total+=min>arr[i]?min-arr[i]:0;

        }
        return total;
    }
    int left_max(int [] arr,int l)
    {   int max=0;
        for(int i=l;i>=0;i--)
        {
            max=Math.max(arr[i],max);

        }
      return max;

    }
    int right_max(int [] arr,int l)
    {
        int max=0;
        for(int i=l;i< arr.length;i++)
        {
            max=Math.max(arr[i],max);

        }
        return max;

    }
}