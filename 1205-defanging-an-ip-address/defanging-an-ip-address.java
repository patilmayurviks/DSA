class Solution {
    public String defangIPaddr(String address) {
        String words[]=address.split("\\.");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            
            sb.append(words[i]);
            if (i<words.length-1){
                sb.append("[.]");

            }
            
        }
        return sb.toString();

        
    }
}