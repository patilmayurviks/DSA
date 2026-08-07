class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int rank[]=new int[26];
        for(int i=0;i<order.length();i++){
            rank[order.charAt(i)-'a']=i;
        }

        for(int i=0;i<words.length-1;i++){
            String w1=words[i];
            String w2=words[i+1];
            int len=Math.min(w1.length(),w2.length());
            int j=0;
            while(j<len){
                char ch1=w1.charAt(j);
                char ch2=w2.charAt(j);
                if(rank[ch1-'a']<rank[ch2-'a']){
                    break;

                }
                if(rank[ch1-'a']>rank[ch2-'a']){
                    return false;

                }
                j++;
                
            }
            if(j==len && w1.length()>w2.length()){
                return false;
            }
             
            
        }
        return true;
        
    }
}