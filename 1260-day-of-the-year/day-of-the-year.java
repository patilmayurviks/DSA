class Solution {
    public int dayOfYear(String date) {
        String arr[]=date.split("-");
        int year=Integer.parseInt(arr[0]);
        int month=Integer.parseInt(arr[1]);
        int days=Integer.parseInt(arr[2]);
        int monthes[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%400==0 ||(year%4==0 && year%100!=0)){
            monthes[1]=29;
        }
        int result=days;
        for(int i=0;i<month-1;i++){
            result+=monthes[i];
        }
        return result;
        
    }
}