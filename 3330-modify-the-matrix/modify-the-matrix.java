class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] answer=new int[m][n];
        for(int i=0;i<m;i++){
            answer[i]=matrix[i].clone();

        }
        for(int j=0;j<n;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                max=Math.max(max,matrix[i][j]);
            }
            for(int i=0;i<m;i++){
                if(answer[i][j]==-1){
                    answer[i][j]=max;
                }
            }
        }
        return answer;
        
    }
}