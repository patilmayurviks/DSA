class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        
        StringBuilder sb=new StringBuilder();
        boolean neg=num<0;
        num=Math.abs(num);
        while(num>0){
            int rem=num%7;
            sb.append(rem);
            num=num/7;

        }
        if(neg){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}