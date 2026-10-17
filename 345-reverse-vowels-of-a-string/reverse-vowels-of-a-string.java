class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end &&  !isVowel(ch[start])){
                start++;

            }
            while(start<end &&  !isVowel(ch[end])){
                end--;

            }

            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return new String(ch);

        
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}