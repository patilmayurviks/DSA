class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count_5=0;
        int count_10=0;
        int count_20=0;
        //nice
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5 && count_5>=0){
                count_5++;
            }
            else if(bills[i]==10&& count_10>=0){
                count_10++;
                count_5--;
            }
            else if(bills[i]==20){
                count_20++;
                if(count_10==0){
                    count_5=count_5-3;
                }else{
                    count_5--;
                   count_10--;

                }
                
            }
        }
        if(count_5<0 || count_10<0|| count_20<0){
            return false;
        }else{
            return true;
        }

        
    }
}