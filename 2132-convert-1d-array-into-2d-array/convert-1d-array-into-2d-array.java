class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int start=0;
        int ans[][]=new int[m][n];
        if(original.length!=m*n){
            return new int[0][0];
        }
        while(start< original.length){
            for(int i=0;i<m;i++ ){
                for(int j=0;j<n;j++){
                    ans[i][j]=original[start];
                    start++;
                }
            }
        }
        return ans;
        
    }
}