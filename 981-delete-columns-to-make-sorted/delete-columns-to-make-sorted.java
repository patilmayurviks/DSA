class Solution {
    public int minDeletionSize(String[] strs) {
        int n= strs.length;
        int colum=0;
        for(int j=0;j<strs[0].length();j++){
            for(int i=0;i<n-1;i++){
                
                if(strs[i].charAt(j) > strs[i+1].charAt(j)){
                    colum++;
                    break;
                    
                }

            }
        }
        return colum;
        
    }
}