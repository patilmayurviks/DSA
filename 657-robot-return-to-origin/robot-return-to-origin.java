class Solution {
    public boolean judgeCircle(String moves) {
        int countL=0;
        int countR=0;
        int countU=0;
        int countD=0;
        for(char count: moves.toCharArray()){
            if(count=='R'){
                countR++;
            }else if(count=='L'){
                countL++;
            }else if(count=='U'){
                countU++;
            }else{
                countD++;
            }
        }
        if(countL==countR && countU==countD){
            return true;
        }
        return false;
        
    }
}