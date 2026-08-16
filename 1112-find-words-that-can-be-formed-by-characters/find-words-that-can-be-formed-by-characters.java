class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[]=new int[26];
        int len=0;
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;

        }
        for(String word:words){
            int current[]=new int[26];
            for(char ch: word.toCharArray()){
                current[ch-'a']++;
            }
            boolean good=true;
            for(int i=0;i<26;i++){
                if(current[i]>freq[i]){
                    good=false;
                    break;
                }
            }
            if(good){
                len+=word.length();

            }

        }
        return len;
    }
}