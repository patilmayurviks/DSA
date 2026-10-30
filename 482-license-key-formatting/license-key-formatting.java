class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb= new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='-'){
                sb.append(Character.toUpperCase(ch));
            }
        }
        int count=0;
        StringBuilder result=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--){
            result.append(sb.charAt(i));
            count++;
            if(count==k && i!=0){
                result.append('-');
                count=0;
            }

        }
        return result.reverse().toString();
        
    }
}