class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int m=mat.length;
        for(int rotation=0;rotation<4;rotation++){
            if(equal(mat,target)){
                return true;
            }
            int rotations[][]=new int[m][m];
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    rotations[j][m-1-i]=mat[i][j];
                }
            }
            mat=rotations;
        }
        return false;
       
        
    }
     public boolean equal(int mat[][],int target[][]){
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    if(mat[i][j]!=target[i][j]){
                        return false;

                    }
                }
            }
            return true;
        }
}