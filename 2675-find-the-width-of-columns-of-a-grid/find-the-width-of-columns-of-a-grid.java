class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int []ans=new int[n];
        for(int j=0;j<n;j++){
            int maxwidth=0;
            for(int i=0;i<m;i++){
                int width=String.valueOf(grid[i][j]).length();
                maxwidth=Math.max(maxwidth,width);
            }
            ans[j]=maxwidth;
        }
        return ans;
    }
}