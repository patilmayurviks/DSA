class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
        
    }
    private String check(String str){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}