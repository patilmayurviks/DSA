class Solution {
    public String tictactoe(int[][] moves) {
        char board[][]=new char[3][3];
        for(int i=0;i<moves.length;i++){
            int row=moves[i][0];
            int col=moves[i][1];
            if(i%2==0){
                board[row][col]='X';
            }else{
                board[row][col]='O';
            }
        }

        //row
        for(int i=0;i<3;i++){
            if(board[i][0]!='\0'&& board[i][0]==board[i][1] && board[i][1]==board[i][2]){
                if(board[i][0]=='X'){
                    return "A";
                }else{
                    return "B";
                }
            }
        }

        //colum
        for(int i=0;i<3;i++){
            if(board[0][i]!='\0' && board[0][i]==board[1][i]&& board[1][i]==board[2][i]){
                if(board[0][i]=='X'){
                    return "A";

                }else{
                    return "B";
                }
            }
        }

        //digonal;

        
            if(board[0][0]!='\0'&& board[0][0]==board[1][1] &&board[1][1]==board[2][2]){
                if(board[0][0]=='X'){
                    return "A";

                }else{ 
                    return "B";
                }
            }
        
        if(board[0][2]!='\0'&& board[0][2]==board[1][1]&& board[1][1]==board[2][0]){
            if(board[0][2]=='X'){
                return "A";
            }else{
                return "B";
            }
        }
        if(moves.length==9){
            return "Draw";
        }else{
            return "Pending";
        }
        
    }
}