class Solution {
    public int countNegatives(int[][] grid) {
    int size=grid.length;
    int c=0;
    for(int i=0;i<size;i++)
    { 
        for(int j=0;j<grid[i].length;j++)
        { 
           if(grid[i][j]<0)
           {
           c++;
           }
        }
    }
    return c;

    }
}