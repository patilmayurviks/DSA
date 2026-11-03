class Solution {
    public String sortString(String s) {
        int freq[]=new int[26];
        for(int i=0;i< s.length();i++){
            freq[s.charAt(i)-'a']++;
            
        }
        StringBuilder result=new StringBuilder();

        
        while(result.length()<s.length()){
            for(int i=0;i<26;i++){
                if(freq[i]>0){
                    result.append(  (char)('a'+i));
                    freq[i]--;

                }
            }
            for(int i=25;i>=0;i--){
                if(freq[i]>0){
                    result.append((char) ('a'+i));
                    freq[i]--;
                }
            }
        }
        return result.toString();
    }
}