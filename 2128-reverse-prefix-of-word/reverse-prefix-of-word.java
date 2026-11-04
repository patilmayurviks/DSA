class Solution {
    public String reversePrefix(String word, char ch) {
        char chara[]=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(chara[i]==ch){
                int start=0;
                int end=i;
                while(start<end){
                    char temp=chara[end];
                    chara[end]=chara[start];
                    chara [start]=temp;
                    start++;
                    end--;

                }
                break;
            }
        }
        return new String(chara);
        
    }
}