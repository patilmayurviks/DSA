class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int ans[][]= new int [n][n];
        int temp[][]= new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int newcol=(j-rowShift[i]%n+n)%n;
                temp[i][newcol]=grid[i][j];

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int newrow=(i-colShift[j]%n+n)%n;
                ans[newrow][j]=temp[i][j];
            }
        }
        return ans;
        
    }
}