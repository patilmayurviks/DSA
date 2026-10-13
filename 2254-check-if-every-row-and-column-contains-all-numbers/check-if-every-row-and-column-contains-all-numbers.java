class Solution {
    public boolean checkValid(int[][] matrix) {
        int m=matrix.length;
        for(int i=0;i<m;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<m;j++){
                set.add(matrix[i][j]);
            }
            if(set.size()!=m){
                return false;
            }
        }
        for(int i=0;i<m;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<m;j++){
                set.add(matrix[j][i]);
            }
            if(set.size()!=m){
                return false;
            }
        }
        return true;

        
    }
}