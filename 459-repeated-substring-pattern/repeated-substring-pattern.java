class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int len=1;len<=n/2;len++){
            if(n%len==0){
                StringBuilder sb=new StringBuilder();
                String sub=s.substring(0,len);
                while(sb.length()<n){
                    sb.append(sub);
                }
                 if(sb.toString().equals(s)){
                return true;
            }
            }
           
        }
        return false;
        
    }
}