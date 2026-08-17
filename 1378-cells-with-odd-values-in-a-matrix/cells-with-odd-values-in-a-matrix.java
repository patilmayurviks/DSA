class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int ans[][]=new int[m][n];
        for(int []rows: indices){
            int row=rows[0];
            int col=rows[1];
            for(int i=0;i<ans[0].length;i++){
                ans[row][i]++;
            }
            for(int j=0;j<ans.length;j++){
                ans[j][col]++;
            }

        }
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
        
    }
}