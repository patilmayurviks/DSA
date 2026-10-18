class Solution {
    public char findTheDifference(String s, String t) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;

        }
        for(int i=0;i<t.length();i++){
            char c= t.charAt(i);
            if(freq[c-'a']==0){
                return c;
            }
            freq[c-'a']--;
        }
        return ' ';
        
    }
}