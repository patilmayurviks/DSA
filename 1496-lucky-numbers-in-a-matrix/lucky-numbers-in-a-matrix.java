class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int num=matrix[i][j];
                int mini=Integer.MAX_VALUE;
                int maxi=Integer.MIN_VALUE;
                for(int row=0;row<m;row++){
                    if(matrix[row][j]>maxi){
                        maxi=matrix[row][j];
                    }
                }
                for(int col=0;col<n;col++){
                    if(matrix[i][col]<mini){
                        mini=matrix[i][col];
                    }
                }
                if(maxi==num && mini==num){
                    list.add(num);
                }

            }
        }
        return list;
        
    }
}