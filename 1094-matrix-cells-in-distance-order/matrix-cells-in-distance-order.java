class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int n=rows*cols;
        int index=0;
        int ans[][]=new int[n][2];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ans[index][0]=i;
                ans[index][1]=j;
                index++;
            }
        }
        Arrays.sort(ans,(a,b)->{
            int distA= Math.abs(a[0]-rCenter) + Math.abs(a[1]-cCenter);
            int distB= Math.abs(b[0]-rCenter) + Math.abs(b[1]-cCenter);
            return distA-distB;
        });
        return ans;
        
    }
}