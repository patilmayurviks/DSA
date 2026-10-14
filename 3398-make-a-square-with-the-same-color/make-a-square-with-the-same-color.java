class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int white=0;
                int black=0;
                for(int r=i;r<i+2;r++){
                    for(int c=j;c<j+2;c++){
                        if(grid[r][c]=='B'){
                            black++;
                        }else{
                            white++;
                        }
                    }
                }
                if(black>=3 || white>=3){
                return true;
            }
            }
            
        }
        return false;
        
    }
}