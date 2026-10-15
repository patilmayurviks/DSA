class Solution {
    public int minimumOperations(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int opration=0;
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                if(grid[i][j]<=grid[i-1][j]){
                    int newval= grid[i-1][j]+1;
                    opration+=newval-grid[i][j];
                    grid[i][j]=newval;
                }
            }
        }
        return opration;
    }
}