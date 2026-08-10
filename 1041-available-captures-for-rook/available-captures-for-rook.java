class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;
        int row=0;
        int col=0;
        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    row=i;
                    col=j;
                    

                }
            }
        }
        //right

        for(int  right=col+1;right<8;right++){
            if(board[row][right]!='.'){
                if(board[row][right]=='p'){
                    count++;
                }
                break;
            }
        }
        //left
        for(int left=col-1;left>=0;left--){
            if(board[row][left]!='.'){
                if(board[row][left]=='p'){
                    count++;
                }
                break;
            }
        }
        //up
        for(int up=row-1;up>=0;up--){
            if(board[up][col]!='.'){
                if(board[up][col]=='p'){
                    count++;
                }
                break;
            }
        }
        for(int down=row+1;down<8;down++){
            if(board[down][col]!='.'){
                if(board[down][col]=='p'){
                    count++;
                }
                break;
            }
        }
        return count;
        
    }
}