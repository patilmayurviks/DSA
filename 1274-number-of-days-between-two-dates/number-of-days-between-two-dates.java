class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(countdays(date1)-countdays(date2));
        

        
    }
    private int countdays(String date){
        String dates[]= date.split("-");
        
        int year=Integer.parseInt(dates[0]);
        int month=Integer.parseInt(dates[1]);
        int days=Integer.parseInt(dates[2]);
        int total= year*365;
        total+= (year-1)/4-(year-1)/100 +(year-1)/400;

        int[] day={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
           
            total+=day[i];
        }
        if(month>2 &&(year%400==0||(year%4==0 && year%100!=0))){
            total++;
        }
        total+=days;
        return total;


    }
}